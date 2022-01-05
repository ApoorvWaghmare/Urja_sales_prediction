package com.urja.service;

import java.util.ArrayList;

import com.urja.model.Region;

public interface IRegionService 
{
	public Region getById(int id);
	public ArrayList<Region> getAll();
}
