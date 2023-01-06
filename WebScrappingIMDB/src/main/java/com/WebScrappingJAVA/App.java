package com.WebScrappingJAVA;


import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class App 
{
	   public static void getData() throws Exception{
	    	String url="https://www.imdb.com/chart/toptv/";
	    	Document doc=Jsoup.connect(url).get();
	    	Elements elements=doc.select("div.lister");
	    	
	    	
	    	elements.forEach((e) -> {
	    		String text=e.select("th").text();
	    		System.out.println(text+"\n");
	    		String title=elements.select("td.titleColumn>a").text();
	    		
		    	String year=elements.select("td.titleColumn>span").text();
		    	
		    	String rate=elements.select("td.ratingColumn.imdbRating>strong").text();
		    	System.out.println(title+" "+year+" "+rate);
	    	});
    } 
	 
	  		
   	
	    
		
	  

    public static void main( String[] args ) throws Exception
    {
  
        getData();
    }
    
    




	
}
