package com.urja.serviceimpl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.urja.dao.IDistributorDao;
import com.urja.model.Distributor;
import com.urja.service.IDistributorService;

@Transactional
@Service("distributorService")
public class DistributorServiceImpl implements IDistributorService 
{
	private IDistributorDao distributorDao;
	
	public DistributorServiceImpl(IDistributorDao distributorDao)
	{
		this.distributorDao = distributorDao;
	}
	
	@Override
	public Distributor getById(int id)
	{
		return distributorDao.getById(id);
	}
	
	@Override
	public ArrayList<Distributor> getAll()
	{
		return distributorDao.getAll();
	}
}
