package com.urja.service;

import java.util.ArrayList;

import com.urja.model.Distributor;

public interface IDistributorService 
{
	public Distributor getById(int id);
	public ArrayList<Distributor> getAll();
}
