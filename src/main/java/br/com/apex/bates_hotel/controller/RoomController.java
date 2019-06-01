package br.com.apex.bates_hotel.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.apex.bates_hotel.model.Roomtype;

@Controller
@Transactional
public class RoomController {

	
	@RequestMapping("/products/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("products/form");
		
		modelAndView.addObject("types", Roomtype.values());
		
		return modelAndView;

}
}

