package com.sep30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Combo_JDBC {

	public static void main(String[] args) {
		String path="com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3307/batch1194db";
		String uname="root";
		String pwd="root";
		
		Connection conn=null;
		Statement st=null;
		 ResultSet rs=null;
		
		
		String query="select * from batch1194db.student";
		
		String createquery ="create table IF NOT EXISTS batch1194db.student1"
				+ "(roll int primary key,"+" name varchar(45),"+""
				+ "marks int)";
		
		//String insertquery="insert into batch1194db.student1 values(3,'shamo',50)";
		
		String selectquery="select * from batch1194db.shopping where city='satara'";
		
		try {
			Class.forName(path);
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
		conn = DriverManager.getConnection(url, uname, pwd);
			System.out.println("Establish Connection");
			
			 st = conn.createStatement();
			 System.out.println("Statement Created");
			 
			 
			 rs = st.executeQuery(query);
			 System.out.println("Query executed");
			 
			 while(rs.next()) {
				 int sroll = rs.getInt(1);
				 String sname = rs.getString(2);
				 int smarks = rs.getInt(3);
				 
				 System.out.printf("roll %3s  name %3s  marks %3s\n",sroll,sname,smarks );
			 }
			 
			 if (rs != null) rs.close();
			
			 st.executeUpdate(createquery);
			 System.out.println("Table created successfully");


			 
//			 st.executeUpdate(insertquery);
//			 System.out.println("Record Inserted successfully");
			 
			 rs=st.executeQuery(selectquery);
			 System.out.println("generate");
			 
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 int price = rs.getInt(3);
				 
				 String city = rs.getString(4);
				 
				 System.out.printf("id %3s  name %3s  price %3s city %3s\n",id,name,price,city );
			 }
			
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(e.getErrorCode()==1062) {
				System.out.println("Duplicate entry detected");
			}else {
				e.printStackTrace();
			}
			
		}
		finally {
            // Ensure all resources are closed
            try {
                if (rs != null) rs.close(); // Close ResultSet
                if (st != null) st.close(); // Close Statement
                if (conn != null) conn.close(); // Close Connection
            } catch (SQLException e) {
                e.printStackTrace();
            }
	}
}
}
