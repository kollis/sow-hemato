package com.sow.hemato.mvc.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sow.hemato.mvc.data.User;


@Controller

public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView home(ModelMap model) {
		
		System.out.println("\n*****in home of HomeController*******");
		
		
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("userDetails.getUsername():" + userDetails.getUsername());
		
		User user1 = new User();
		user1.setName("Sowjanya Kolli");
		user1.setMemberNumber("100");
		user1.setStreet("1047 Southern Artery");
		user1.setCity("Quincy");
		user1.setZipcode("02169");
		
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("home");
		 modelAndView.addObject("user", user1);
		 
		 return modelAndView;
		

		//return "home";
	}
	
}