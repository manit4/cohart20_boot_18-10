package com.cohart20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/firstPage")
	public String getHomePage() {
		
		return "index";
	}

}
