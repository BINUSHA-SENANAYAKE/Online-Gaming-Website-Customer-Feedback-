package com.feedback;

import java.util.List;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

 


public class FeedbackGameDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	
	//Insert feedback
	
	 
	public static boolean insertgamefeedback(String uname, String email, String about, String feedback, String service , String gname) {
		 
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();	
			
			String sql ="insert into gamefeedback values(0,'"+uname+"','"+email+"','"+about+"','"+feedback+"','"+service+"','"+gname+"')";
			
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
 
	public static List<FeedbackGame> getFeedback(String userName){
		
		 		
		ArrayList<FeedbackGame> feed = new ArrayList<>();
		
		try {
			
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "select * from gamefeedback where fusername = '"+userName+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				   
				 int id = rs.getInt(1);
				 String username = rs.getString(2);
				 String email = rs.getString(3);
				 String about = rs.getString(4);
				 String feedback = rs.getString(5);
				 String service =rs.getString(6);
				 String gname = rs.getString(7);

				FeedbackGame c = new FeedbackGame(id,username,email,about,feedback,service,gname);
				 
				feed.add(c);
				 
			 }
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return feed;
	}
	
	
	//Update
	
	public static boolean updateGamefeedback(String id , String name , String email , String about , String feedback , String service , String gname1) {

		try {
			
			con = DBConnect.getConnection(); 
			stmt = con.createStatement();
			String sql = "update gamefeedback set fusername ='"+name+"' ,femail = '"+email+"',fsummary='"+about+"',feedback ='"+feedback+"', fabout = '"+service+"' , gname ='"+gname1+"'" +"where fid ='"+id+"'" ;
			
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
	
	//get feedback details
	
	public static List<FeedbackGame> getFeedbackDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<FeedbackGame> feed = new ArrayList<>();
		
		try {
			
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "select * from gamefeedback where fid = '"+convertedID+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				   
				 int id = rs.getInt(1);
				 String uname = rs.getString(2);
				 String email = rs.getString(3);
				 String about = rs.getString(4);
				 String feedback = rs.getString(5);
				 String service =rs.getString(6);
				 String gname =rs.getString(7);

				FeedbackGame c = new FeedbackGame(id,uname,email,about,feedback,service,gname);
				
				feed.add(c);
				 
			 }
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return feed;
	}

//Delete

public static boolean deleteGameFeedback(String id) {
		
		int convId = Integer.parseInt(id);
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from gamefeedback where fid ='"+convId+"'";
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

