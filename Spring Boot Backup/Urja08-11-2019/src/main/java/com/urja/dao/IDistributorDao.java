package com.urja.dao;

import java.util.ArrayList;

import com.urja.model.Distributor;

public interface IDistributorDao 
{
	public Distributor getById(int id);
	public ArrayList<Distributor> getAll();
}
