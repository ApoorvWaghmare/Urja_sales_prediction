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
		String hql="from Category where catId=?";
		List<Category> categoryList=(List<Category>)getEntitymanager().createQuery(hql).setParameter(0,id).getResultList();
		if(categoryList!=null&&categoryList.size()>0)
		{
			return categoryList.get(0);
		}
		else
		{
			return new Category();
			
		}
		
		
		
	}
	
	
	public ArrayList<Category> getAll()
	{
		String hql="from Category";
		ArrayList<Category> categoryList=(ArrayList<Category>)getEntitymanager().createQuery(hql).getResultList();
		if(categoryList!=null)
		{
			return categoryList;
		}
		else
		{
			return new ArrayList<Category>();
		}

	}

}
