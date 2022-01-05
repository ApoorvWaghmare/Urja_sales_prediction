package com.urja.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.urja.dao.AbstractDao;
import com.urja.dao.ISkuDao;
import com.urja.model.Category;
import com.urja.model.Sku;

@Repository("skuDao")
@Transactional
public class SkuDaoImpl extends AbstractDao implements ISkuDao {

	@Override
	public Sku getById(int id) {
		String hql = "from Sku where skuId=?";
		List<Sku> skuList = (List<Sku>) getEntityManager().createQuery(hql).setParameter(0, id).getResultList();
		if (skuList != null)
			return skuList.get(0);
		else
			return new Sku();
	}

	@Override
	public ArrayList<Sku> getAll() {
		String hql = "from Sku";
		ArrayList<Sku> skuList = (ArrayList<Sku>) getEntityManager().createQuery(hql).getResultList();
		if (skuList != null)
			return skuList;
		else
			return new ArrayList<Sku>();
	}

	@Override
	public ArrayList<Sku> getAllExisting() {
		String hql = "from Sku where isDeleted=?";
		ArrayList<Sku> skuList = (ArrayList<Sku>) getEntityManager().createQuery(hql).setParameter(0, 0)
				.getResultList();
		if (skuList != null)
			return skuList;
		else
			return new ArrayList<Sku>();
	}

	@Override
	public ArrayList<Sku> getAllDeleted() {
		String hql = "from Sku where isDeleted=?";
		ArrayList<Sku> skuList = (ArrayList<Sku>) getEntityManager().createQuery(hql).setParameter(0, 1)
				.getResultList();
		if (skuList != null) {
			return skuList;
		} else {
			return new ArrayList<Sku>();
		}
	}

	@Override
	public void deleteById(int id) {
		String hql = "update Sku set isDeleted=1 where skuId=?";
		javax.persistence.Query query = getEntityManager().createQuery(hql);
		query.setParameter(0, id);

		query.executeUpdate();
	}

	@Override
	public ArrayList<Sku> getByIdAndQuant(int id, int quantity) {
		String hql = "from Sku where isDeleted=1 and skuId=? and quantity=?";

		javax.persistence.Query query = getEntityManager().createQuery(hql);
		query.setParameter(0, id);
		query.setParameter(1, quantity);

		ArrayList<Sku> skuList = (ArrayList<Sku>) query.getResultList();

		if (skuList != null)
			return skuList;
		else
			return new ArrayList<Sku>();
	}

}
