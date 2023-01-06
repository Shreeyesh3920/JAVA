package com.WebScrappingJAVA;


import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class App 
{
	   public static void getData(String c) throws Exception{
	    	String url="https://www.worldometers.info/coronavirus/country/"+c+"/";
	    	Document doc=Jsoup.connect(url).get();
	    	
			Elements elements=doc.select("div#maincounter-wrap");
			
		elements.forEach((e) -> {
	  		String text=e.select("h1").text();
	  		String counter=e.select("div.maincounter-number>span").text();
	  		System.out.println(text+" "+counter);
	  	
    	});
	    }

    public static void main( String[] args ) throws Exception
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the Country name: ");
        String country=scan.nextLine();
        getData(country);
    }
    
    
    
    
    
    
 





	
}
