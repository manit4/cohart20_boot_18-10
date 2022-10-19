package com.cohart20.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cohart20.db.DBUtils;
import com.cohart20.pojo.User;

public class UserDAO {

	public User getUser(String uid) throws Exception {

		Connection conn = DBUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from user where id = ?");

		pstmt.setString(1, uid);

		User user = null;

		ResultSet rs = pstmt.executeQuery();

		if(rs.next()) {
			String id = rs.getString(1);
			String password = rs.getString(2);
			String name = rs.getString(3);
			String email = rs.getString(4);

			user = new User(id, password, name, email);
		}
		return user;
	}
	
	public List<User> getAllUsers() throws Exception {
		
		Connection conn = DBUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from user");
		
		List<User> users = new ArrayList<User>();

		ResultSet rs = pstmt.executeQuery();

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
