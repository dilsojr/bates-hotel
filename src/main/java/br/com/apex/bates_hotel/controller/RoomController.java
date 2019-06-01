package br.com.apex.bates_hotel.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.apex.bates_hotel.dao.RoomDAO;
import br.com.apex.bates_hotel.model.Room;
import br.com.apex.bates_hotel.model.RoomType;

@Controller
@Transactional
@RequestMapping("/products")
public class RoomController {

	@Autowired
	private RoomDAO roomDAO;
	
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createform() {
		ModelAndView modelAndView = new ModelAndView("products/forms");
		
		modelAndView.addObject("types", RoomType.values());

		return modelAndView;

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView save(Room room) {
		ModelAndView modelAndView = new ModelAndView("redirect:/products/list");
		
		roomDAO.save(room);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public  ModelAndView listRooms() {
		ModelAndView modelAndView = new ModelAndView("/products/list");
		
		Iterable<Room> rooms = roomDAO.findAll();
		
		modelAndView.addObject("roomsList", rooms);
		
		return modelAndView;
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView room(Integer id) {
		ModelAndView modelAndView = new ModelAndView ("/products/forms");
		
		modelAndView.addObject("room", roomDAO.findOne(id));
		
		return modelAndView;
		
	}
	
	@RequestMapping(value ="/delete", method = RequestMethod.GET)
	public ModelAndView deleteRoom(Integer id) {
		ModelAndView modelAndView = new ModelAndView ("redirect:/products/list");
		
		roomDAO.delete(id);
		
		return modelAndView;
				
		}
	
	
	
	
	
	
}
