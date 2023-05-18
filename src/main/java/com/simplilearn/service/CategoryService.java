package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Category;
import com.simplilearn.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository catetgoryrepository;
	
	public Category save(Category category)
	{
		return catetgoryrepository.save(category);
	}
	
	public Category getcategory(long id)
	{
		return catetgoryrepository.findById(id).get();
	}
	
	public List<Category> getallcategory()
	{
		return catetgoryrepository.findAll();
	}
	
	public void updatecategory(long id,Category category)
	{
		Category ref=catetgoryrepository.findById(id).get();
		ref.setName(category.getName());
		catetgoryrepository.save(ref);
	}
	
	public void deletebyid(long id)
	{
		catetgoryrepository.deleteById(id);
	}
}
