package com.urja.dao;

import java.util.ArrayList;

import com.urja.model.Region;

public interface IRegionDao
{
	public Region getById(int id);
	public ArrayList<Region> getAll();
}
