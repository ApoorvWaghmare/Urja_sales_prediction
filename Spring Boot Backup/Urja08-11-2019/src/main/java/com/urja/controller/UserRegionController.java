package com.urja.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.urja.bean.RegionResponse;
import com.urja.model.Region;

@RestController
@RequestMapping("/region")
public class UserRegionController extends AbstractInterfaceConfiguration
{
	@SuppressWarnings( {"rawtypes", "unchecked"} )
	
	@RequestMapping(value = "/region/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity <?> getUser(@PathVariable int id)
	{
		RegionResponse response = new RegionResponse();
		
		Region region = regionService.getById(id);
		
		if(region != null)
		{
			response.setId(region.getRegionId());
			response.setName(region.getRegionName());
		}
		
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/region", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ArrayList<Region> getAll()
	{
		RegionResponse response = new RegionResponse();
		
		Region region = regionService.getById(1);
		
		if(region != null)
		{
			response.setId(region.getRegionId());
			response.setName(region.getRegionName());
		}
		
		return regionService.getAll();
	}
}
