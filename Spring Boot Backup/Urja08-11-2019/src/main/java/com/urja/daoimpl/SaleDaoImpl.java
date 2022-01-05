package com.urja.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.urja.dao.AbstractDao;
import com.urja.dao.ISaleDao;
import com.urja.model.Sale;

@Transactional
@Repository("saleDao")
public class SaleDaoImpl extends AbstractDao implements ISaleDao
{
	@SuppressWarnings("unchecked")
	@Override
	public Sale getById(int id)
	{
		String hql = "from Sale where saleId = ?";
		
		List<Sale> saleList = getEntityManager().createQuery(hql).setParameter(0, id).getResultList();
		
		if(saleList != null && saleList.size() > 0)
			return saleList.get(0);
		else
			return new Sale();
	}
	
	@Override
	public ArrayList<Sale> getAll()
	{
		String hql = "from Sale";
		
		ArrayList<Sale> saleList = (ArrayList<Sale>) getEntityManager().createQuery(hql).getResultList();
		
		if(saleList != null)
			return saleList;
		else
			return new ArrayList<Sale>();
	}
}
