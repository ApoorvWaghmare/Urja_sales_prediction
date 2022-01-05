package com.urja.service;

import java.util.ArrayList;

import com.urja.model.Category;

public interface ICategoryService {
	
	public Category getById(int id);
	public ArrayList<Category> getAll();
}
