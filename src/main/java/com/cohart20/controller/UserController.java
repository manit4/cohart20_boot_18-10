package com.cohart20.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cohart20.dao.UserDAO;
import com.cohart20.service.UserService;
import com.cohart20.to.User;

@RestController
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
	
	@RequestMapping("/gettUserr/{uid}")
	public User getUser(@PathVariable String uid) throws Exception {
		
		UserService userService = new UserService();
		
		User user = userService.getUser(uid);
		
		return user;
	}	
	
	@RequestMapping("/gettAllUsers")
	public List<User> getUsers() throws Exception {
		
		UserDAO userDao = new UserDAO();
		
		List<User> users = userDao.getAllUsers();
		
		return users;
		
	}
}
