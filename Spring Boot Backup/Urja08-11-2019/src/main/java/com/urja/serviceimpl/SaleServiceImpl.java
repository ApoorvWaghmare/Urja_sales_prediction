package com.urja.serviceimpl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.urja.dao.ISaleDao;
import com.urja.model.Sale;
import com.urja.service.ISaleService;

@Transactional
@Service("saleService")
public class SaleServiceImpl implements ISaleService
{
	private ISaleDao saleDao;
	
	public SaleServiceImpl(ISaleDao saleDao)
	{
		this.saleDao = saleDao;
	}
	
	@Override
	public Sale getById(int id)
	{
		return saleDao.getById(id);
	}
	
	@Override
	public ArrayList<Sale> getAll()
	{
		return saleDao.getAll();
	}
}
