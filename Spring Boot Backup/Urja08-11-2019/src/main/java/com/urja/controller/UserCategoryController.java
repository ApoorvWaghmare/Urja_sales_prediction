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
import com.urja.model.Category;

@RestController
@RequestMapping("/category")
public class UserCategoryController extends AbstractInterfaceConfiguration {

	@SuppressWarnings({ "rawtypes", "unchecked" })

	@RequestMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable int id) {
		
		CategoryResponse response = new CategoryResponse();

		Category category = categoryService.getById(id);
		
		if (category != null) {
			response.setId(category.getCatId());
			response.setName(category.getCatName());
		}

		return new ResponseEntity(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)

	public ArrayList<Category> getCategories() {
		CategoryResponse response = new CategoryResponse();
		
		Category category = categoryService.getById(1);
		
		if(category != null)
		{
			response.setId(category.getCatId());
			response.setName(category.getCatName());
		}

		return categoryService.getAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deletecategory(@PathVariable int id) {
		categoryService.deleteCategory(id);
	}

}
