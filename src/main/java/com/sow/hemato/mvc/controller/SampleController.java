package com.sow.hemato.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SampleController {
	
	@RequestMapping("/sample")
	public String printWelcome(ModelMap model) {
		
		System.out.println("\n*****in printWelcome of SampleController*******");

		return "sample";
	}
	
	@RequestMapping("/sample1")
	public String printWelcome1(ModelMap model) {
		
		System.out.println("\n*****in printWelcome1 of SampleController*******");

		return "sample1";
	}
	
}