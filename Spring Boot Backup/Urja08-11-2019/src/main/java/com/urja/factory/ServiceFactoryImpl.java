package com.urja.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.urja.dao.ICategoryDao;
import com.urja.dao.IDistributorDao;
import com.urja.dao.IRegionDao;
import com.urja.dao.ISaleDao;
import com.urja.dao.ISkuDao;
import com.urja.serviceimpl.CategoryServiceImpl;
import com.urja.serviceimpl.DistributorServiceImpl;
import com.urja.serviceimpl.RegionServiceImpl;
import com.urja.serviceimpl.SaleServiceImpl;
import com.urja.utility.ClassUtility;

public class ServiceFactoryImpl implements IServiceFactory 
{
	@Autowired
	private ICategoryDao categoryDao;
	@Autowired
	private IDistributorDao distributorDao;
	@Autowired
	private IRegionDao regionDao;
	@Autowired
	private ISaleDao saleDao;
	@Autowired
	private ISkuDao skuDao;
	
	public Object createInstance(String serviceClass)
	{
		Object serviceObject = null;
		
		if(serviceClass.equalsIgnoreCase(ClassUtility.getCategoryValue()))
			serviceObject = new CategoryServiceImpl(categoryDao);
		else if(serviceClass.equalsIgnoreCase(ClassUtility.getDistributorValue()))
			serviceObject = new DistributorServiceImpl(distributorDao);
		else if(serviceClass.equalsIgnoreCase(ClassUtility.getRegionValue()))
			serviceObject = new RegionServiceImpl(regionDao);
		else if(serviceClass.equalsIgnoreCase(ClassUtility.getSaleValue()))
			serviceObject = new SaleServiceImpl(saleDao);
		else if(serviceClass.equalsIgnoreCase(ClassUtility.getSku()));
		
		return null;
	}
}
