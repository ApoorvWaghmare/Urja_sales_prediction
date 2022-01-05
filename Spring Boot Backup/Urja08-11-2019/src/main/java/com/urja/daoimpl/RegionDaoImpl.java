package com.urja.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.urja.dao.AbstractDao;
import com.urja.dao.IRegionDao;
import com.urja.model.Region;

@Transactional
@Repository("regionDao")
public class RegionDaoImpl extends AbstractDao implements IRegionDao
{
	@SuppressWarnings("unchecked")
	
	@Override
	public Region getById(int id)
	{
		String hql = "from Region where regionId = ?";
		
		List<Region> regionList = getEntityManager().createQuery(hql).setParameter(0, id).getResultList();
		
		if(regionList != null && regionList.size() > 0)
			return regionList.get(0);
		else
			return new Region();
	}
	
	@Override
	public ArrayList<Region> getAll()
	{
		String hql = "from Region";
		
		ArrayList<Region> regionList = (ArrayList<Region>) getEntityManager().createQuery(hql).getResultList();
		
		if(regionList != null)
			return regionList;
		else
			return new ArrayList<Region>();
	}
}
