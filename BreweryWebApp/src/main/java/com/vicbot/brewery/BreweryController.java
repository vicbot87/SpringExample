package com.vicbot.brewery;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;

import com.vicbot.brewery.*;

@Controller
public class BreweryController {
	
	
	@RequestMapping("lookForABrewery")
	public String goToSearchForABreweryPage()
	{
		return "lookForABrewery";
	}
	
	@RequestMapping("lookForABreweryAction")
	public ModelAndView breweryAction(@RequestParam int Id)
	{
		String resourceURL = "https://api.openbrewerydb.org/breweries/5954";
		System.out.println("beforeRestGetRequest");
		//Brewery brewery = restTemplate.getForObject(, Brewery.class);
		//System.out.println(brewery.getCity());
		try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<Brewery> response = restTemplate.exchange(resourceURL, HttpMethod.GET,entity,Brewery.class);
            Brewery brewery = response.getBody();
            System.out.println(brewery.getCity());
            ModelAndView mv = new ModelAndView();
    		mv.setViewName("breweryByIDAction");
    		mv.addObject(brewery);
    		return mv;
        } catch (Exception ex) {
           ex.printStackTrace();

        }
		System.out.println("afterRestGetRequest");
	
		ModelAndView mvError = new ModelAndView();
		return mvError;
		
	}
	
	@RequestMapping("listOfBreweriesAction")
	public ModelAndView breweriesAction(@RequestParam String q)
	{
		String resourceURL = "https://api.openbrewerydb.org/breweries/search?query=" + q;
		System.out.println(resourceURL);
		try {
	
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<Brewery[]> response = restTemplate.exchange(resourceURL, HttpMethod.GET,entity,
            		Brewery[].class);
            Brewery[] breweries = response.getBody();
            
            ModelAndView mv = new ModelAndView();
            mv.addObject("bArr", breweries);
            mv.setViewName("listOfBreweriesAction");
            return mv;
            
        } catch (Exception ex) {
           ex.printStackTrace();
         
        }
		ModelAndView mvError = new ModelAndView();
		return mvError;
	}
}
