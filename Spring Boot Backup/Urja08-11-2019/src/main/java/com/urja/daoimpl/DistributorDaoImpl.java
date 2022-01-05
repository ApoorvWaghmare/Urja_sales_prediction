package com.urja.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.urja.dao.AbstractDao;
import com.urja.dao.IDistributorDao;
import com.urja.model.Distributor;

@Transactional
@Repository("distributorDoa")
public class DistributorDaoImpl extends AbstractDao implements IDistributorDao
{
	@SuppressWarnings("unchecked")
	@Override
	public Distributor getById(int id)
	{
		String hql = "from Distributor where distributorId = ?";
		
		List<Distributor> distributorList = getEntityManager().createQuery(hql).setParameter(0, id).getResultList();
		
		if(distributorList != null && distributorList.size() > 0)
			return distributorList.get(0);
		else
			return new Distributor();
	}
	
	@Override
	public ArrayList<Distributor> getAll()
	{
		String hql = "from Distributor";
		
		ArrayList<Distributor> distributorList = (ArrayList<Distributor>) getEntityManager().createQuery(hql).getResultList();
		
		if(distributorList != null)
			return distributorList;
		else
			return new ArrayList<Distributor>();
	}
}
