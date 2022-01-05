package com.urja.service;

import java.util.ArrayList;

import com.urja.model.Sale;

public interface ISaleService 
{
	public Sale getById(int id);
	public ArrayList<Sale> getAll();
}
