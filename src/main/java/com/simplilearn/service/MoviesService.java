package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.simplilearn.entity.Movies;

import com.simplilearn.repository.MoviesRepository;

@Service
public class MoviesService {
	@Autowired
	private MoviesRepository movierepository;
	
	public Movies save(Movies movie)
	{
		return movierepository.save(movie);
	}
	
	public Movies getmovie(long id)
	{
		return movierepository.findById(id).get();
	}
	
	public List<Movies> getallmovies()
	{
		return movierepository.findAll();
	}
	
	public void updatemovie(long id,Movies movie)
	{
		Movies ref=movierepository.findById(id).get();
		ref.setCategory(movie.getCategory());
		ref.setEnabled(movie.isEnabled());
		ref.setMoviename(movie.getMoviename());
		ref.setImage(movie.getImage());
		ref.setPrice(movie.getPrice());
		ref.setSeats(movie.getSeats());
		ref.setTime1(movie.getTime1());
		ref.setTime2(movie.getTime2());
		ref.setTime3(movie.getTime3());
		ref.setTime4(movie.getTime4());
		movierepository.save(ref);
		
	}
	
	public void deletebyid(long id)
	{
		movierepository.deleteById(id);
	}
}
