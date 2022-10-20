package com.cohart20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
//	@RequestMapping("/firstPage")
//	public String getHomePage() {
//		
//		return "index";
//	}

	@RequestMapping("/")//   forward slash "/" in the RequestMapping suggests the system to execute API if there is nothing in the URL
						//except the "localhost:8081". So we follow this way if you have decided any API needs to be executed and rendering
						//index or Home page in response to user...
	public String getHomePage() {
		
		return "index";
	}
	
	@RequestMapping("/registrationPage")
	public String registrationPage() {
		
		return "registration";
	}
}
