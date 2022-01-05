package com.urja.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.urja.bean.DistributorResponse;
import com.urja.model.Distributor;

@RestController
@RequestMapping("/distributor")
public class UserDistributorController extends AbstractInterfaceConfiguration 
{
	@SuppressWarnings( {"rawtypes", "unchecked"} )
	
	@RequestMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity getUser(@PathVariable int id)
	{
		DistributorResponse response = new DistributorResponse();
		
		Distributor distributor = distributorService.getById(id);
		
		if(distributor != null)
		{
			response.setId(distributor.getDistributorId());
			response.setName(distributor.getDistributorName());
		}
		
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ArrayList<Distributor> getDistributors()
	{
		DistributorResponse response = new DistributorResponse();
		
		Distributor distributor = distributorService.getById(1);
		
		if(distributor != null)
		{
			response.setId(distributor.getDistributorId());
			response.setName(distributor.getDistributorName());
		}
		
		return distributorService.getAll();
	}
}
