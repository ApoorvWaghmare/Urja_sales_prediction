package com.urja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

public abstract class AbstractDao {
	
	@PersistenceContext
	private EntityManager entitymanager;

	public Session getSession() {
		return entitymanager.unwrap(org.hibernate.Session.class);
	}

	public EntityManager getEntitymanager() {
		return this.entitymanager;
	}
	
	

}
