package com.feedback;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 


public class FeedbackDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	
	//Insert feedback
	
	 
	public static boolean insertfeedback(String uname, String email, String about, String feedback, String service) {
		 
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();	
			
			String sql ="insert into feedback values(0,'"+uname+"','"+email+"','"+about+"','"+feedback+"','"+service+"')";
			
			int rs = stmt .executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	//Output 
 
	public static List<Feedback> getFeedback(String userName){
		
		 		
		ArrayList<Feedback> feed = new ArrayList<>();
		
		try {
			
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "select * from feedback where fusername = '"+userName+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				   
				 int id = rs.getInt(1);
				 String username = rs.getString(2);
				 String email = rs.getString(3);
				 String about = rs.getString(4);
				 String feedback = rs.getString(5);
				 String service =rs.getString(6);

				Feedback c = new Feedback(id,username,email,about,feedback,service);
				 
				feed.add(c);
				 
			 }
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return feed;
	}
	
	
	//Update
	
	public static boolean updatefeedback(String id , String name , String email , String about , String feedback , String service) {

		try {
			
			con = DBConnect.getConnection(); 
			stmt = con.createStatement();
			String sql = "update feedback set fusername ='"+name+"' ,femail = '"+email+"',fsummary='"+about+"',feedback ='"+feedback+"', fabout = '"+service+"'" +"where fid ='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			 
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	//get feedback table details
	
	public static List<Feedback> getFeedbackDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Feedback> feed = new ArrayList<>();
		
		try {
			
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "select * from feedback where fid = '"+convertedID+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				   
				 int id = rs.getInt(1);
				 String uname = rs.getString(2);
				 String email = rs.getString(3);
				 String about = rs.getString(4);
				 String feedback = rs.getString(5);
				 String service =rs.getString(6);

				Feedback c = new Feedback(id,uname,email,about,feedback,service);
				
				feed.add(c);
				 
			 }
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return feed;
	}

//Delete

public static boolean deleteFeedback(String id) {
		
		int convId = Integer.parseInt(id);
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from feedback where fid ='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}

}
