package com.Jahan.DemoWebApp.helper;

import java.util.ArrayList;
import java.util.List;

import com.Jahan.DemoWebApp.model.Movies;

public class movie1Helper {

	public List<Movies> getMovielist()
	{
		List<Movies> aMovie= new ArrayList<Movies>();
		
		Movies aMovie1=new Movies();
		
		aMovie1.setID("1");
		aMovie1.setTitle("People Places Things");
		aMovie1.setRelease_date("14/08/2015");
		aMovie1.setDuration("85 minutes");
		aMovie1.setGenre("Comedy");
		aMovie1.setSynopsis("Will Henry is a newly single graphic novelist balancing parenting his\r\n" + 
				"young twin daughters and a classroom full of students while exploring\r\n" + 
				"and navigating the rich complexities of new love and letting go of the\r\n" + 
				"woman who left him.\r\n" + 
				"");
			
		Movies aMovie2=new Movies();
		
		aMovie2.setID("2");
		aMovie2.setTitle("The Dark Knight");
		aMovie2.setRelease_date("18/07/2008");
		aMovie2.setDuration("1h 15 minutes");
		aMovie2.setGenre(" Action, Crime, Drama");
		aMovie2.setSynopsis("When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham, the Dark Knight must accept one of the greatest psychological and physical tests of his ability to fight injustice.");
		
		
		Movies aMovie3=new Movies();
		
		aMovie3.setID("3");
		aMovie3.setTitle("World War Z");
		aMovie3.setRelease_date("14/08/2012");
		aMovie3.setDuration("1h 56 minutes");
		aMovie3.setGenre("Advanture");
		aMovie3.setSynopsis("Former United Nations employee Gerry Lane traverses the world in a race against time to stop the Zombie pandemic that is toppling armies and governments, and threatening to destroy humanity itself.");
		
	    Movies aMovie4=new Movies();
		
	    aMovie4.setID("4");
	    aMovie4.setTitle("I Am Legend");
	    aMovie4.setRelease_date("4/12/2007");
	    aMovie4.setDuration("1h 41 minutes");
	    aMovie4.setGenre(" Drama, Horror, Sci-Fi ");
	    aMovie4.setSynopsis("Years after a plague kills most of humanity and transforms the rest into monsters, the sole survivor in New York City struggles valiantly to find a cure.");
		
	    
	    Movies aMovie5=new Movies();
		
	    aMovie5.setID("5");
	    aMovie5.setTitle("Avatar");
	    aMovie5.setRelease_date("18/12/2009");
	    aMovie5.setDuration("2h 42 minutes");
	    aMovie5.setGenre(" Action, Adventure, Fantasy ");
	    aMovie5.setSynopsis("A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.");
		
		aMovie.add(aMovie1);
		aMovie.add(aMovie2);
		aMovie.add(aMovie3);
		aMovie.add(aMovie4);
		aMovie.add(aMovie5);
		return aMovie;
	}
	

	
	
	public Movies findRecommendedMovie(String ID)
	{
		
		List<Movies> aMovielist= new ArrayList<Movies>();
		Movies aMovie= new Movies();
		aMovielist=this.getMovielist();
		
	    for (Movies movies : aMovielist) {
	    	String tempID=movies.getmID();
	    	if(tempID.equals(ID)) 
	    	{
	    		aMovie=movies;
	    		
	    	}
	    	
		}
		
		
		return aMovie;
		
	}
	
}
