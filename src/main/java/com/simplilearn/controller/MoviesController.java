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
import com.simplilearn.entity.Movies;
import com.simplilearn.service.MoviesService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class MoviesController {
	@Autowired
	   private MoviesService service;
	
	@PostMapping("/movie")
	public Movies savecategory(@RequestBody Movies movie)
	{
		return service.save(movie);
	}
	
	@GetMapping("/movie/{id}")
	public Movies getmovie(@PathVariable long id)
	{
		return service.getmovie(id);
	}
	
	@GetMapping("/movie")
	public List<Movies> getallmovies()
	{
		return service.getallmovies();
	}
	
	@PutMapping("/movie/{id}")
	public void updatemovie(@RequestBody Movies movie,@PathVariable long id)
	{
		service.updatemovie(id, movie);
	}
	
	@DeleteMapping("/movie/{id}")
	public void deletebyid(@PathVariable long id)
	{
		service.deletebyid(id);
	}
}
