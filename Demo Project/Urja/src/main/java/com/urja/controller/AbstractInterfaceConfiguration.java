package com.urja.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.urja.factory.IServiceFactory;
import com.urja.service.ICategoryService;
import com.urja.utility.ClassUtility;

public abstract class AbstractInterfaceConfiguration {
	
	@Autowired
	protected ICategoryService categoryService;
	
	
	public void setDatabaseService(IServiceFactory servicefactory)
	{
		this.categoryService=(ICategoryService)servicefactory.createInstance(ClassUtility.CATEGORY);
	}
	

}
