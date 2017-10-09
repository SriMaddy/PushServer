package com.example.demo.datasource.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.internal.SessionFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datasource.mysql.domain.Message;
import com.example.demo.datasource.mysql.domain.NotificationBean;
import com.example.demo.datasource.mysql.domain.NotificationDataBean;
import com.example.demo.datasource.mysql.domain.TokenBean;
import com.example.demo.datasource.mysql.repo.TokenRepository;
import com.google.gson.Gson;

import javapns.Push;
import javapns.notification.PushNotificationPayload;
import javapns.notification.PushedNotification;
import javapns.notification.ResponsePacket;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	private static final String ANDROID_SERVER_KEY = "AIzaSyBy_ulhbjiuoiUPr3dAp9TjnsxACmw4exw";
	
	@Autowired
	private TokenRepository tokenRepo;
	
	@PersistenceUnit(unitName = "MySql")
    private EntityManagerFactory emf;
	
	private static final String URL = "https://fcm.googleapis.com/fcm/send";
	
	private static final Logger logger = LoggerFactory.getLogger(NotificationController.class);

	@RequestMapping(value = "/registerToken", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TokenBean> registerToken(@RequestBody String payload) {
		logger.debug("sending token to fcm");
		// save this token to mysql db
		
		Gson gson = new Gson();
		TokenBean token = gson.fromJson(payload, TokenBean.class);
		
		/*SessionFactoryImpl sessionFactory = emf.unwrap(SessionFactoryImpl.class);
		Session session = sessionFactory.openSession();
		String getQuery = "SELECT * from token_table WHERE email = :email";
		SQLQuery query = session.createSQLQuery(getQuery);
		query.addEntity(TokenBean.class);
		query.setParameter("email", token.getEmail());
		
		List<TokenBean> tokenBeans = query.list();*/
		
		Iterable<TokenBean> tokenBeans = tokenRepo.findAll();
		System.out.println("TokenBeans" + ((tokenBeans != null) ? tokenBeans : "Null"));
		if(tokenBeans == null || !tokenBeans.iterator().hasNext()) {
			System.out.println("No Token-> Add new Record");
			token = tokenRepo.save(token);
			return new ResponseEntity<>(token, HttpStatus.CREATED);
		}
		
		for(TokenBean bean : tokenBeans) {
			if(bean.getDeviceId().equals(token.getDeviceId())) {
				System.out.println("Same Device Id");
				// check for email
				if(bean.getEmail().equalsIgnoreCase(token.getEmail())) {
					System.out.println("Same Device Id-> Same Email");
					if(!bean.getToken().equals(token.getToken())) {
						System.out.println("Same Device Id-> Same Email-> Different Token-> Delete Old record and Add new Record");
						// update token for this email
						tokenRepo.delete(bean.getId());
						tokenRepo.save(token);
						return new ResponseEntity<>(token, HttpStatus.CREATED);
					} else {
						System.out.println("Same Device Id-> Same Email-> Same Token-> Conflict");
						return new ResponseEntity<>(HttpStatus.CONFLICT);
					}
				} else {
					if(!bean.getToken().equals(token.getToken())) {
						System.out.println("Same Device Id-> Different Email-> Different Token-> Delete Old record and Add new Record");
						// update token and email for this token
						tokenRepo.delete(bean.getId());
						tokenRepo.save(token);
						return new ResponseEntity<>(token, HttpStatus.CREATED);
					} else {
						// update email for this token
						System.out.println("Same Device Id-> Different Email-> Same Token-> Delete Old record and Add new Record");
						tokenRepo.delete(bean.getId());
						tokenRepo.save(token);
						return new ResponseEntity<>(token, HttpStatus.CREATED);
					}
				}
			} else {
				continue;
			}
			
			// working code inside for each
			/*if(bean.getToken().equals(token.getToken())) {
				return new ResponseEntity<>(HttpStatus.CONFLICT);
			} else {
				token = tokenRepo.save(token);
				break;
			}*/
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/deleteToken", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TokenBean> deleteToken(@RequestBody String payload) {
		Gson gson = new Gson();
		TokenBean token = gson.fromJson(payload, TokenBean.class);
		
		SessionFactoryImpl sessionFactory = emf.unwrap(SessionFactoryImpl.class);
		Session session = sessionFactory.openSession();
		String deleteQuery = "DELETE FROM token_table WHERE token = :token";
		SQLQuery query = session.createSQLQuery(deleteQuery);
		query.addEntity(TokenBean.class);
		query.setParameter("token", token.getToken());
		
		int result = query.executeUpdate();
		if(result > 0) {
			return new ResponseEntity<>(token, HttpStatus.GONE);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<TokenBean> getTokensForEmail(String email) {
		SessionFactoryImpl sessionFactory = emf.unwrap(SessionFactoryImpl.class);
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM token_table WHERE email = :email";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(TokenBean.class);
		query.setParameter("email", email);
		List<TokenBean> tokenBeans = query.list();
		
		System.out.println("TokenBeansList " + tokenBeans);
		
		return tokenBeans;
	}
	
	@RequestMapping(value = "/sendMessageToNotificationServer", method = org.springframework.web.bind.annotation.RequestMethod.POST)
	public void sendMessageToJavaServer(@RequestBody String payload) {
		Gson gson = new Gson();
		Message message = gson.fromJson(payload, Message.class);
		String email = message.getEmail();
		List<TokenBean> tokenBeans = getTokensForEmail(email);
		
		NotificationBean notificationBean = new NotificationBean();
		notificationBean.setMessage(message.getMessage());
		notificationBean.setTitle("Push Notification");
		
		NotificationDataBean notificationDataBean = new NotificationDataBean();
		notificationDataBean.setNotificationBean(notificationBean);
		
		for(TokenBean tokenBean : tokenBeans) {
			notificationDataBean.setTo(tokenBean.getToken());
			String notificationDataBeanStr = gson.toJson(notificationDataBean, NotificationDataBean.class);
			if(tokenBean.getDevice().equalsIgnoreCase("ANDROID")) {
				sendPushNotificationToFCMServer(notificationDataBeanStr, ANDROID_SERVER_KEY);
			} else if(tokenBean.getDevice().equalsIgnoreCase("iOS")) {
				sendPushNotificationToAPNServer(notificationDataBeanStr);
			}
		}
		
//		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/sendNotification", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NotificationBean> sendPushNotificationToFCMServer(@RequestBody String payload, String serverKey) {
		logger.debug("payload" + payload);
		Gson gson = new Gson();
		NotificationDataBean notificationDataBean = gson.fromJson(payload, NotificationDataBean.class);
		NotificationBean notification = notificationDataBean.getNotificationBean();
		notification.setTimestamp(Calendar.getInstance().getTimeInMillis());
		notificationDataBean.setNotificationBean(notification);
		
		logger.debug("Notification" + notification.toString());
		
//		String payloadData = notification.toString();
		String notificationDataStr = gson.toJson(notificationDataBean, NotificationDataBean.class);
		String payloadData = notificationDataStr;
		java.net.URL obj = null;
		HttpURLConnection con = null;
		try {
			obj = new java.net.URL(URL);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json; charset-utf8");
			con.setRequestProperty("Authorization", "key=" + serverKey);
			
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.write(payloadData.getBytes("UTF-8"));
			wr.flush();
			wr.close();
			
			int responseCode = con.getResponseCode();
//			logger.debug("Response Code : " + responseCode);
//			logger.debug(payloadData);
			System.out.println("Response Code : " + responseCode);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			con.disconnect();
			
//			notification = notificationRepo.save(notification);

			System.out.println("Response : " + response.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(notification, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/sendNotificationToIOS", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NotificationBean> sendPushNotificationToAPNServer(@RequestBody String payload1) {
		BasicConfigurator.configure();
		
		try {            
            Gson gson = new Gson();
    		NotificationDataBean notificationDataBean = gson.fromJson(payload1, NotificationDataBean.class);
    		String to = notificationDataBean.getTo();
    		NotificationBean notification = notificationDataBean.getNotificationBean();
    		notification.setTimestamp(Calendar.getInstance().getTimeInMillis());
    		notificationDataBean.setNotificationBean(notification);
//    		to = "448c975ee60560a1d22d17b4b75cd3ded154c5052debd0b11f175742e8bf3f9d";
    		
    		PushNotificationPayload payload = PushNotificationPayload.complex();
			payload.addAlert(notification.getMessage());
            payload.addBadge(1);
            payload.addSound("default");
            payload.addCustomDictionary("id", "1");
            System.out.println(payload.toString());
    		
            List <PushedNotification> NOTIFICATIONS = Push.payload(payload, "C:/Users/Karthick/AppData/Roaming/Skype/Certificates.p12", "bosslbs123", false, to);
            
            for (PushedNotification NOTIFICATION: NOTIFICATIONS) {
                if (NOTIFICATION.isSuccessful()) {
                    /* APPLE ACCEPTED THE NOTIFICATION AND SHOULD DELIVER IT */
                    System.out.println("PUSH NOTIFICATION SENT SUCCESSFULLY TO: " +
                        NOTIFICATION.getDevice().getToken());
                    return new ResponseEntity<>(notification, HttpStatus.CREATED);
                    /* STILL NEED TO QUERY THE FEEDBACK SERVICE REGULARLY */
                } else {
                    String INVALIDTOKEN = NOTIFICATION.getDevice().getToken();
                    /* ADD CODE HERE TO REMOVE INVALIDTOKEN FROM YOUR DATABASE */
                    /* FIND OUT MORE ABOUT WHAT THE PROBLEM WAS */
                    Exception THEPROBLEM = NOTIFICATION.getException();
                    THEPROBLEM.printStackTrace();
                    /* IF THE PROBLEM WAS AN ERROR-RESPONSE PACKET RETURNED BY APPLE, GET IT */
                    ResponsePacket THEERRORRESPONSE = NOTIFICATION.getResponse();
                    if (THEERRORRESPONSE != null) {
                        System.out.println(THEERRORRESPONSE.getMessage());
                    }
                }
            }
            
		} catch(Exception e) {
			
		}
		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	}
}
