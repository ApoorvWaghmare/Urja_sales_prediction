package com.urja.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.urja.factory.IServiceFactory;
import com.urja.service.ICategoryService;
import com.urja.service.IDistributorService;
import com.urja.service.IRegionService;
import com.urja.service.ISaleService;
import com.urja.service.ISkuService;
import com.urja.utility.ClassUtility;

public abstract class AbstractInterfaceConfiguration 
{
	@Autowired
	protected ICategoryService categoryService;
	
	@Autowired
	protected IDistributorService distributorService;
	
	@Autowired
	protected IRegionService regionService;
	
	@Autowired
	protected ISaleService saleService;
	
	@Autowired
	protected ISkuService skuService;
	
	public void setDatabaseService(IServiceFactory serviceFactory)
	{
		this.distributorService = (IDistributorService) serviceFactory.createInstance(ClassUtility.DISTRIBUTOR);
		this.regionService = (IRegionService) serviceFactory.createInstance(ClassUtility.REGION);
		this.saleService = (ISaleService) serviceFactory.createInstance(ClassUtility.SALE);
	}
}
