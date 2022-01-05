package com.urja.serviceimpl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.urja.dao.IRegionDao;
import com.urja.model.Region;
import com.urja.service.IRegionService;

@Transactional
@Service("regionService")
public class RegionServiceImpl implements IRegionService
{
	private IRegionDao regionDao;

	public RegionServiceImpl(IRegionDao regionDao)
	{
		this.regionDao = regionDao;
	}
	
	@Override
	public Region getById(int id)
	{
		return regionDao.getById(id);
	}
	
	@Override
	public ArrayList<Region> getAll()
	{
		return regionDao.getAll();
	}
}
