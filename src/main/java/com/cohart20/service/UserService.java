package com.cohart20.service;

import com.cohart20.dao.UserDAO;
import com.cohart20.to.User;

public class UserService {

	//	public User getUser(String uid) throws Exception {
	//		
	//		UserDAO userDao = new UserDAO();
	//		
	//		User user = userDao.getUser(uid);
	//		
	//		return user;
	//	}

	//	public void save(String username, String password, String firstName, String lastName, String email) throws Exception {
	//		
	//		UserDAO userDao = new UserDAO();
	//		
	//		userDao.saveUser(username, password, firstName, lastName, email);
	//	}

	//	public void save(String username, String password, String firstName, String lastName, String email) throws Exception {
	//
	//		UserDAO userDao = new UserDAO();
	//
	//		userDao.saveUser(username, password, firstName, lastName, email);
	//	}

	public void save(User user) throws Exception {

		UserDAO userDao = new UserDAO();

		userDao.saveUser(user);
	}

	//	public boolean login(String username, String password) throws Exception {
	//		
	//		UserDAO userDao = new UserDAO();
	//		
	//		boolean loginSuccess = userDao.loginSuccess(username, password);
	//		
	//		return loginSuccess;
	//	}

	public User login1(String username, String password) throws Exception {

		UserDAO userDao = new UserDAO();

		User user = userDao.loginSuccess1(username, password);

		return user;
	}

	public User getUser(String username, String password) throws Exception {

		UserDAO userDao = new UserDAO();

		User user = userDao.getUser(username, password);

		return user;
	}


}
