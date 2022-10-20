package com.cohart20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cohart20.dao.UserDAO;
import com.cohart20.service.UserService;


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
		System.out.println("inside getHomepage()");
		return "index";
	}
	
	@RequestMapping("/registrationPage")
	public String registrationPage() {
		
		return "registration";
	}
	
	@RequestMapping("/register")
	public String register(String username, String password, String firstName, String lastName, String email) throws Exception {
		
		System.out.println(username+", "+lastName+", "+firstName+", "+password+", "+email);//Sysout is used for debugging purpose and the 
							//output is printed on the server' console but never be the part of the response.... 
		
		UserService userService = new UserService();
		
		userService.save(username, password, firstName, lastName, email);
		
		
//		UserDAO userDao = new UserDAO();
//		
//		userDao.saveUser(username, password, firstName, lastName, email);
		
		return "index";
	}
}
