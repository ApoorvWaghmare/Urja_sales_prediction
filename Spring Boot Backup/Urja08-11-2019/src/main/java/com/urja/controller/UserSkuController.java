package com.urja.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.urja.bean.CategoryResponse;
import com.urja.bean.SkuResponse;
import com.urja.model.Category;
import com.urja.model.Sku;


@RestController
@RequestMapping("/sku")
public class UserSkuController extends AbstractInterfaceConfiguration{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	
	@RequestMapping(value="/get", produces = MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public ArrayList<Sku> getSkus() {		
		return skuService.getAll();
	}

	@RequestMapping(value="/get/{id}",produces = MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ResponseEntity<?> getSkubyId(@PathVariable int id) {
		SkuResponse response = new SkuResponse();
	Sku sku=skuService.getById(id);
		if(sku!=null)
		{
			response.setCatId(sku.getCatId());
			response.setIsDeleted(sku.getIsDeleted());
			response.setPiecesPerBox(sku.getPiecesPerBox());
			response.setQuantity(sku.getQuantity());
			response.setQuantityUnit(sku.getQuantityUnit());
			
			response.setSkuId(sku.getSkuId());
		}
			
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getexisting",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ArrayList<Sku>getExistingSkus(){
		return skuService.getAllExisting();
	}
	@RequestMapping(value="/getdeleted",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ArrayList<Sku>getDeletedSkus(){
		return skuService.getAllDeleted();
	}	
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deleteSkuById(@PathVariable int id)
	{
		skuService.deleteById(id);
	}

}
