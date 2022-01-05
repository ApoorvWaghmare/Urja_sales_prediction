package com.urja.serviceimpl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.urja.dao.ICategoryDao;
import com.urja.model.Category;
import com.urja.service.ICategoryService;


@Transactional
@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

	
	private ICategoryDao categoryDao;
	
	public CategoryServiceImpl(ICategoryDao categoryDao) {

		this.categoryDao=categoryDao;
	}

	@Override
	public Category getById(int id) {
		
		
		return this.categoryDao.getById(id);

	}

	@Override
	public ArrayList<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryDao.getAll();
	}

}
