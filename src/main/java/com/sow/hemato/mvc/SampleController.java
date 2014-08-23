package com.sow.hemato.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SampleController {
	
	@RequestMapping("/sample.htm")
	public String printWelcome(ModelMap model) {
		
		System.out.println("\n*****in printWelcome of SampleController*******");

		return "sample";
	}
	
}