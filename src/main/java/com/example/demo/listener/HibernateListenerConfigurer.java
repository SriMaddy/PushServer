package com.example.demo.listener;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.internal.SessionFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HibernateListenerConfigurer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HibernateListenerConfigurer.class.getName());

	@PersistenceUnit(unitName = "MySql")
    private EntityManagerFactory emf;
	
	@Autowired
	private DBEventListener listener;
	
	@PostConstruct
    public void init() {
		System.out.println("HIBERNATE CONFIGURER INIT");
		LOGGER.debug("HIBERNATE CONFIGURER INIT");
        SessionFactoryImpl sessionFactory = emf.unwrap(SessionFactoryImpl.class);
        
        EventListenerRegistry registry = sessionFactory.getServiceRegistry().getService(EventListenerRegistry.class);
        
        registry.getEventListenerGroup(EventType.POST_INSERT).appendListener(listener);
//        registry.getEventListenerGroup(EventType.POST_UPDATE).appendListener(listener);
//        registry.getEventListenerGroup(EventType.POST_DELETE).appendListener(listener);
    }
}
