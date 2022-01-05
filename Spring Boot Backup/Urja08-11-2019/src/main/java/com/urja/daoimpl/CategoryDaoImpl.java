package com.urja.daoimpl;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.urja.dao.AbstractDao;
import com.urja.dao.ICategoryDao;
import com.urja.model.Category;

@Transactional
@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractDao implements ICategoryDao {

	@SuppressWarnings("unchecked")
	@Override
	public Category getById(int id) {
		String hql = "from Category where catId=?";

		List<Category> categoryList = (List<Category>) getEntityManager().createQuery(hql).setParameter(0, id)
				.getResultList();

		if (categoryList != null && categoryList.size() > 0)
			return categoryList.get(0);
		else
			return new Category();
	}

	@Override
	public ArrayList<Category> getAll() {
		String hql = "from Category";

		ArrayList<Category> categoryList = (ArrayList<Category>) getEntityManager().createQuery(hql).getResultList();

		if (categoryList != null)
			return categoryList;
		else
			return new ArrayList<Category>();
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub

		Category object = new Category();
		object.setCatId(id);
		// getSession().remove(object);
		getEntityManager().remove(getEntityManager().contains(object) ? object : getEntityManager().merge(object));

	}

}
