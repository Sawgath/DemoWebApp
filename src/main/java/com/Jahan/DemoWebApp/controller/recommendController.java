package com.Jahan.DemoWebApp.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Jahan.DemoWebApp.helper.movie1Helper;
import com.Jahan.DemoWebApp.model.Movies;

@Controller
@SessionAttributes("MoiveID")
public class recommendController {
	
	

	
	@RequestMapping(value="/recommend", method=RequestMethod.GET)
	public String getRecommendMovie(Model model,@ModelAttribute("MoiveID") String MoiveID) 
	{
		
		if(!MoiveID.equals(null) || !MoiveID.equals("")) 
		{
			
			String mID = MoiveID;
			Movies aMovie= new Movies();
			
		    movie1Helper aHelper= new movie1Helper();
			
			aMovie=aHelper.findRecommendedMovie(mID);
			model.addAttribute("aMovie", aMovie);
			
		}else {
			Movies aMovie= new Movies();
			model.addAttribute("aMovie", aMovie);
		}
		return "test1";
		
	}
	
	
	@RequestMapping(value="/recommend/{ID}",method=RequestMethod.GET)
	public String getRecommendMovie2(Model model,@PathVariable(value="ID") String id) 
	{
		
		String mID =id.toString();
		Movies aMovie= new Movies();
		
	    movie1Helper aHelper= new movie1Helper();
		
		aMovie=aHelper.findRecommendedMovie(mID);
		model.addAttribute("aMovie", aMovie);
		model.addAttribute("MoiveID",mID);
		
		return "test1";
		
	}

}
