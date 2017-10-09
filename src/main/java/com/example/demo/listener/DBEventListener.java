package com.example.demo.listener;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.datasource.controller.NotificationController;
import com.example.demo.datasource.mysql.domain.MySql;
import com.example.demo.datasource.mysql.domain.NotificationBean;
import com.example.demo.datasource.mysql.domain.NotificationDataBean;
import com.example.demo.datasource.mysql.domain.TokenBean;
import com.google.gson.Gson;

@Component
public class DBEventListener implements PostInsertEventListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String ANDROID_SERVER_KEY = "AIzaSyBy_ulhbjiuoiUPr3dAp9TjnsxACmw4exw";
	private static final String IOS_SERVER_KEY = "";

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private NotificationController notificationController;

	@Override
	public void onPostInsert(PostInsertEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("\n\n\nNEW RECORD INSERTED");
		System.out.println("------------------------------------------------------------");

		if (arg0.getEntity() instanceof MySql) {
			System.out.println("\nPOSTINSERT ENTITY OBJECT FIELDS => " + ((MySql) arg0.getEntity()).getId() + "\t"
					+ ((MySql) arg0.getEntity()).getName());
		}

		/*if (arg0.getEntity() instanceof NotificationBean) {
			System.out.println("\nPOSTINSERT ENTITY OBJECT FIELDS => " + ((NotificationBean) arg0.getEntity()).getId()
					+ "\t" + ((NotificationBean) arg0.getEntity()).getMessage());

			long id = ((NotificationBean) arg0.getEntity()).getId();
			String message = ((NotificationBean) arg0.getEntity()).getMessage();
			String title = ((NotificationBean) arg0.getEntity()).getTitle();
			long timestamp = ((NotificationBean) arg0.getEntity()).getTimestamp();

			NotificationBean notificationBean = new NotificationBean();
			notificationBean.setId(id);
			notificationBean.setMessage(message);
			notificationBean.setTitle(title);
			notificationBean.setTimestamp(timestamp);

			List<TokenBean> tokenBeans = notificationController.getTokensForEmail("sridhar@bosslbs.com");

			NotificationDataBean notificationDataBean = new NotificationDataBean();
			notificationDataBean.setNotificationBean(notificationBean);
			
			if(tokenBeans != null && !tokenBeans.isEmpty()) {
				for(TokenBean tokenBean : tokenBeans) {
					notificationDataBean.setTo(tokenBean.getToken());
					
					Gson gson = new Gson();
					String payload = gson.toJson(notificationDataBean, NotificationDataBean.class);

					if(tokenBean.getDevice().equalsIgnoreCase("Android")) {
						// implement FCM Server side script here for sending push notification to Android
						notificationController.sendPushNotificationToFCMServer(payload, ANDROID_SERVER_KEY);
					} else if(tokenBean.getDevice().equalsIgnoreCase("iOS")){
						// implement APN Server side script here for sending push notification to iOS
						notificationController.sendPushNotificationToAPNServer(payload, IOS_SERVER_KEY);
					} else {
						System.out.println("Device is null");
					}
					
					System.out.println(payload + " in DBListener");
				}
			} else {
				System.out.println("ToList null");
			}
		}*/

		System.out.println("POSTINSERT PERSISTER TABLE NAME" + arg0.getPersister().getEntityName() + " at " + new Date());
		// System.out.println("POSTINSERT PERSISTER IDENTIFIER FIELD NAME" +
		// arg0.getPersister().getIdentifierPropertyName());
		// System.out.println("POSTINSERT PERSISTER IDENTIFIER ROOT NAME" +
		// arg0.getPersister().getRootEntityName());

		// for(Object o : arg0.getState()) {
		// System.out.println("POSTINSERT OBJECT " + o.toString());
		// }
	}

	@Override
	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
