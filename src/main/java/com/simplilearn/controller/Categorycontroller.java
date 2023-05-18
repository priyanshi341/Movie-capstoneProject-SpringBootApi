package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Category;
import com.simplilearn.service.CategoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Categorycontroller {

	@Autowired
   private CategoryService service;
	
	@PostMapping("/category")
	public Category savecategory(@RequestBody Category category)
	{
		return service.save(category);
	}
	
	@GetMapping("/category/{id}")
	public Category getcategory(@PathVariable long id)
	{
		return service.getcategory(id);
	}
	
	@GetMapping("/category")
	public List<Category> getallcategory()
	{
		return service.getallcategory();
	}
	
	@PutMapping("/category/{id}")
	public void updatecategory(@RequestBody Category category,@PathVariable long id)
	{
		service.updatecategory(id, category);
	}
	
	@DeleteMapping("/category/{id}")
	public void deletebyid(@PathVariable long id)
	{
		service.deletebyid(id);
	}
}
