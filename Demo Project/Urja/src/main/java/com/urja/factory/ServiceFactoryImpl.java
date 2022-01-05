package com.urja.factory;

import org.springframework.beans.factory.annotation.Autowired;


import com.urja.dao.ICategoryDao;
import com.urja.serviceimpl.CategoryServiceImpl;
import com.urja.utility.ClassUtility;

public class ServiceFactoryImpl implements IServiceFactory {

	@Autowired
	private ICategoryDao categoryDao;
	
	
	
	@Override
	public Object createInstance(String serviceclass) {
		// TODO Auto-generated method stub
		Object serviceObject=null;
		if(serviceclass.equalsIgnoreCase(ClassUtility.getCategoryValue()))
				{
					serviceObject=new CategoryServiceImpl(categoryDao);
				}
			
		return null;
	}

}
