package com.cohart20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cohart20.pojo.User;

@RestController
public class First {
	
	@RequestMapping("/message")
	public String getMessage() {
		return "Hello SpringBoot Developers :)";
	}
	
	@RequestMapping("/getTodayWeather")
	public String getWeather() {
		
		return "Today, the weather will be really hot and keep your sun-screen along...";
	}
	
	@RequestMapping("/getTemperature")
	public Double getTemp() {
		return 35.56;
	}
	
	@RequestMapping("/getUser")
	public User gertUserDetails() {
		return new User("100", "ama@123", "Ama Gunasekhara", "ama@yahoo.com");
				
	}
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		
		User user1 = new User("1", "dan@123", "Danielle", "dani@gmail.com");
		User user2 = new User("2", "fal@234", "Falguni", "fal@gmail.com");
		User user3 = new User("3", "adam@345", "Adam", "ada@yahoo.com");
		
		List<User> users = new ArrayList<User>();
		users.add(user1);   users.add(user2);  users.add(user3);
		
		return users;	
	}
	
	@RequestMapping("/getDBUsers")
	public List<User> getDBUsers() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/second_assignment", "root", "root");
		
		PreparedStatement pstmt = conn.prepareStatement("select * from user");
		
		ResultSet rs = pstmt.executeQuery();
		
		List<User> users = new ArrayList<User>();
		
		while(rs.next()) {
			
			String id = rs.getString(1);
			String password = rs.getString(2);
			String name = rs.getString(3);
			String email = rs.getString(4);
			
			User user = new User(id, password, name, email);
			
			users.add(user);
		}
		
		return users;
		
	}

}
