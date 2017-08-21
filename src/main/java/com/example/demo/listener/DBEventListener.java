package com.example.demo.listener;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;
import org.springframework.stereotype.Component;

import com.example.demo.datasource.mysql.domain.MySql;
import com.example.demo.datasource.sqlserver.domain.SQLServer;
import com.example.demo.datasource.sqlserver.domain.SQLServerTestTable;

@Component
public class DBEventListener implements PostInsertEventListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void onPostInsert(PostInsertEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("\n\n\nNEW RECORD INSERTED");
		System.out.println("------------------------------------------------------------");
		
		if(arg0.getEntity() instanceof MySql) {
			System.out.println("\nPOSTINSERT ENTITY OBJECT FIELDS => " + ((MySql)arg0.getEntity()).getId() + "\t" + ((MySql)arg0.getEntity()).getName());
		}
		
		if(arg0.getEntity() instanceof SQLServer) {
			System.out.println("\nPOSTINSERT ENTITY OBJECT FIELDS => " + ((SQLServer)arg0.getEntity()).getId() + "\t" + ((SQLServer)arg0.getEntity()).getName());
		}
		
		if(arg0.getEntity() instanceof SQLServerTestTable) {
			System.out.println("\nPOSTINSERT ENTITY OBJECT FIELDS => " + ((SQLServerTestTable)arg0.getEntity()).getId() + "\t" + ((SQLServerTestTable)arg0.getEntity()).getName());
		}
		
		System.out.println("POSTINSERT PERSISTER TABLE NAME" + arg0.getPersister().getEntityName());
//		System.out.println("POSTINSERT PERSISTER IDENTIFIER FIELD NAME" + arg0.getPersister().getIdentifierPropertyName());
//		System.out.println("POSTINSERT PERSISTER IDENTIFIER ROOT NAME" + arg0.getPersister().getRootEntityName());
		
//		for(Object o : arg0.getState()) {
//			System.out.println("POSTINSERT OBJECT " + o.toString());
//		}
	}

	@Override
	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
