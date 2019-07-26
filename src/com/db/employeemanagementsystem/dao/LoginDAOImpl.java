package com.db.employeemanagementsystem.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.util.DBUtil;

public class LoginDAOImpl implements LoginDAO {
	

	public boolean authenticate(LoginBean login) {
		String query = "select * from login_table where username=? and password=?";
		
		Connection connection = null;
		
		PreparedStatement preparedStatement = null;
		connection = DBUtil.getConnection();
		ResultSet resultset = null;
		
		
		
		
		// statement / preparedstatements / callablestatements 
		try {
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, login.getUsername());
			preparedStatement.setString(2, login.getPassword());
			
			resultset = preparedStatement.executeQuery();
			
			if(resultset.next()) {
				
				return true;
				
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			DBUtil.closeConnection(connection);
			
			
		}
		
		
		// TODO Auto-generated method stub
		return false;
	}

}
