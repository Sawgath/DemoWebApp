package com.Jahan.DemoWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InputMovieController {
	
	
	@RequestMapping(value="/Input", method=RequestMethod.GET)
	public String getRecommendMovie(Model model) 
	{
		
		
		return "MoiveInput";
		
	}

}
