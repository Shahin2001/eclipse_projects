package com.sep30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Example {

	public static void main(String[] args) {
		String path="com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3307/batch1194db";
		String uname="root";
		String pwd="root";
		
		Connection conn=null;
		Statement st=null;
		 ResultSet rs=null;
		
		
		String query="select * from batch1194db.student";
		
		try {
			Class.forName(path);
			System.out.println(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
		conn = DriverManager.getConnection(url, uname, pwd);
			System.out.println(2);
			
			 st = conn.createStatement();
			 System.out.println(3);
			 
			 rs = st.executeQuery(query);
			 System.out.println(4);
			 
			 while(rs.next()) {
				 int sroll = rs.getInt(1);
				 String sname = rs.getString(2);
				 int smarks = rs.getInt(3);
				 
				 System.out.printf("roll %3s  name %3s  marks %3s\n",sroll,sname,smarks );
			 }
			//System.out.println();
			
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
