package com.Jahan.DemoWebApp.controller;

import java.util.ArrayList;
import java.util.List;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.Jahan.DemoWebApp.helper.movie1Helper;
import com.Jahan.DemoWebApp.model.Movies;

@Controller
@RequestMapping(value="/movielist")
//@SessionAttributes({"moviestr"})
public class MovieListController {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String getMovie(Model model) 
	{
		//@ModelAttribute String moviest
		List<Movies> aMovie= new ArrayList<Movies>();
		
		movie1Helper aHelper= new movie1Helper();
		
		aMovie=aHelper.getMovielist();
		
		model.addAttribute("MovieList", aMovie);
		
		return "Movie";
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String>  postMovie(Model model,@RequestParam String name) 
	{
		
		
		Movies aMovie= new Movies();
		
	    movie1Helper aHelper= new movie1Helper();
		
		aMovie=aHelper.findRecommendedMovie(name);
		
		
	
		return new ResponseEntity<String>("{ \"Status\":\"OK\"}",HttpStatus.OK);
		
	}
	


}
