package com.feedback;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CustomerDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Login validation---------------------------------------------------------
	public static boolean validate(String username , String password){
		
		
		try {
			
			con = DBConnect.getConnection();
			
			stmt = con.createStatement();
			
			String sql = "select * from userlogin where username = '"+username+"'and upassword ='"+password+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				isSuccess = true;
			    
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	
		return isSuccess;
	}
	
	
//Get login Data
public static List<User> getUser(String userName){
		
		ArrayList<User> customer = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from userlogin where username ='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				User cus = new User(id , name , email , phone , username , password);
				
				customer.add(cus);
				
				
			}
			
		}catch(Exception e){
			
		}
		return customer;
	}
}
