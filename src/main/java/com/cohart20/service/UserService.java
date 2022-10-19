package com.cohart20.service;

import com.cohart20.dao.UserDAO;
import com.cohart20.pojo.User;

public class UserService {
	
	public User getUser(String uid) throws Exception {
		
		UserDAO userDao = new UserDAO();
		
		User user = userDao.getUser(uid);
		
		return user;
	}

}
