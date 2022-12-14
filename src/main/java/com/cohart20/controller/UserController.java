package com.cohart20.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cohart20.dao.UserDAO;
import com.cohart20.service.UserService;
import com.cohart20.to.User;

//@RestController
@Controller
public class UserController {

//	@RequestMapping("/gettUserr/{uid}")
//	public User getUser(@PathVariable String uid) throws Exception {
//		
//		UserDAO userDao = new UserDAO();
//		
//		User user = userDao.getUser(uid);
//		
//		return user;
//	}	
	
//	@RequestMapping("/gettUserr/{uid}")
//	public User getUser(@PathVariable String uid) throws Exception {
//		
//		UserService userService = new UserService();
//		
//		User user = userService.getUser(uid);
//		
//		return user;
//	}	
	
//	@RequestMapping("/gettAllUsers")
//	public List<User> getUsers() throws Exception {
//		
//		UserDAO userDao = new UserDAO();
//		
//		List<User> users = userDao.getAllUsers();
//		
//		return users;
//		
//	}
	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login(String username, String password) throws Exception {
//		
//		System.out.println("inside login"+username+",  "+password);
//		
////		UserDAO userDao = new UserDAO();
////		
////		boolean loginStatus = userDao.loginSuccess(username, password);
//		
//		UserService userService = new UserService();
//		
//		boolean loginStatus = userService.login(username, password);
//		
//		if(loginStatus) {
//			return "welcome";
//		}
//		else {
//			return "index";
//		}
//	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(String username, String password) throws Exception {
		
		System.out.println("inside login"+username+",  "+password);
		
//		UserDAO userDao = new UserDAO();
//		
//		boolean loginStatus = userDao.loginSuccess(username, password);
		
		UserService userService = new UserService();
		
		User user = userService.login1(username, password);
		
		if(user != null) {
			ModelAndView modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("userData", user);
			return modelAndView;
		}
		else {
			ModelAndView modelAndView = new ModelAndView("index");
			return modelAndView;
		}
	}
	
}
