package com.cohart20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cohart20.db.DBUtils;
import com.cohart20.to.User;

@RestController
public class Third_19_10 {
	
//	@RequestMapping("/getUserr/{uid}")
//	public User getUser(@PathVariable String uid) throws Exception {
//		
//		Connection conn = DBUtils.getConnection();
//		
//		PreparedStatement pstmt = conn.prepareStatement("select * from user where id = ?");
//		
//		pstmt.setString(1, uid);
//		
//		User user = null;
//		
//		ResultSet rs = pstmt.executeQuery();
//		
//		if(rs.next()) {
//			String id = rs.getString(1);
//			String password = rs.getString(2);
//			String name = rs.getString(3);
//			String email = rs.getString(4);
//			
//			user = new User(id, password, name, email);
//		}
//		else {
//			user = null;
//		}
//		return user;
//	}
	
	
//	@RequestMapping("/getAllUserss")
//	public List<User> getDBUsers() throws Exception {
//		
//		Connection conn = DBUtils.getConnection();
//		
//		PreparedStatement pstmt = conn.prepareStatement("select * from user");
//		
//		ResultSet rs = pstmt.executeQuery();
//		
//		List<User> users = new ArrayList<User>();
//		
//		while(rs.next()) {
//			
//			String id = rs.getString(1);
//			String password = rs.getString(2);
//			String name = rs.getString(3);
//			String email = rs.getString(4);
//			
//			User user = new User(id, password, name, email);
//			
//			users.add(user);
//		}
//		
//		return users;	
//	}

}
