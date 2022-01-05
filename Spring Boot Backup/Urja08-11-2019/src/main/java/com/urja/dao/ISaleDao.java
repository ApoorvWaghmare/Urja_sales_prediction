package com.urja.dao;

import java.util.ArrayList;

import com.urja.model.Sale;

public interface ISaleDao
{
	public Sale getById(int id);
	public ArrayList<Sale> getAll();
}
