package com.urja.service;

import java.util.ArrayList;

import com.urja.model.Sku;

public interface ISkuService {
	
	public Sku getById(int id);
	public ArrayList<Sku> getAll();
	public ArrayList<Sku> getAllExisting();
	public ArrayList<Sku> getAllDeleted();
	public void deleteById(int id);
	public ArrayList<Sku> getByIdAndQuant(int id,int quantity);

}
