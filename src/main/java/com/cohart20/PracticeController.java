package com.cohart20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cohart20.service.UserService;
import com.cohart20.to.User;

@Controller
public class PracticeController {

	@RequestMapping("/index")
	public String indexPage() {
		
		return "index";
		
	}
	
//	@RequestMapping("/welcome")
//	public String welcomePage() {
//		
//		return "welcome";
//	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() throws Exception {
		
		ModelAndView modelAndView = new ModelAndView("welcome");
		
		UserService userService = new UserService();
		
		User user = userService.getUser("Fal@123", "1234");
		
		modelAndView.addObject("userObject", user);
		
		return modelAndView;
	}
}
