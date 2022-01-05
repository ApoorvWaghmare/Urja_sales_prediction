package com.urja.dao;

import java.util.ArrayList;


import com.urja.model.Category;

//import java.io.Serializable;

public interface ICategoryDao{
	
	public Category getById(int id);
	public ArrayList<Category> getAll();
	public void deleteCategory(int id);
}
