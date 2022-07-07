package com.feedback;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect { 
	
	private static String url = "jdbc:mysql://localhost:3305/games";
	private static String userName = "root";
	private static String password = "Binu98";
	
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con =  DriverManager.getConnection(url, userName, password);
			
			
		}catch(Exception e) {
			
			System.out.println("DEatabase connection is not success!!!!!");
			
		}
		
		return con;
	}
}
