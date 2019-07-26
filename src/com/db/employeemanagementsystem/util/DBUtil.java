package com.db.employeemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public final static String USER_NAME = "root";
	public final static String PASSWORD = "root";
	public final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final static String URI ="jdbc:mysql://localhost:3306/sample";	
	//jdbc -java data base connector (protocol)

	public static Connection getConnection() {
		
		//steps to get the connection to the database
		
		//1. we have to load the driver  class
		//2. get the connection from getConnection() method of driver manager class
		Connection connection = null;
		try {
			Class.forName(DRIVER_NAME);
			
			connection = DriverManager.getConnection(URI, USER_NAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection ) {
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
