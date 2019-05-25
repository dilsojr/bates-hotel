package br.com.apex.bates_hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping ("/")
	public String index() {
			System.out.println("Olá");
			
			return "home/index";
	}

}
