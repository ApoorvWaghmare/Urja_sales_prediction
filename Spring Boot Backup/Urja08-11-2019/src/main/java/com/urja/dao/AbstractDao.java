package com.urja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.h2.engine.Session;

public abstract class AbstractDao 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	public Session getSession()
	{
		return (Session) entityManager.unwrap(org.hibernate.Session.class);
	}
	
	public EntityManager getEntityManager()
	{
		return entityManager;
	}
}
