package com.urja.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.urja.bean.SaleResponse;
import com.urja.model.Sale;

@RestController
@RequestMapping("/sale")
public class UserSaleConfiguration extends AbstractInterfaceConfiguration
{
	@RequestMapping(value = "/sale/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity <?> getUser(@PathVariable int id)
	{
		SaleResponse response = new SaleResponse();
		
		Sale sale = saleService.getById(id);
		
		if(sale != null)
		{
			response.setId(sale.getSaleId());
			response.setSale(sale.getSale());
		}
		
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/sale}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ArrayList<Sale> getAll()
	{
		SaleResponse response = new SaleResponse();
		
		Sale sale = saleService.getById(1);
		
		if(sale != null)
		{
			response.setId(sale.getSaleId());
			response.setSale(sale.getSale());
		}
		
		return saleService.getAll();
	}
}
