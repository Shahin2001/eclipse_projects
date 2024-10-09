package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Example {
	public static void main(String[] args) {
		String path="com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3307/";
		String url2 = "jdbc:mysql://localhost:3307/college";
		
		
		String uname="root";
		String pwd="root";
		
		Connection conn =null;
		
		PreparedStatement st=null;
		
		
		
		String query="create database if not exists college";
		
		String createquery="create table if not exists employee(id int primary key auto_increment,name varchar(45),salary int,createdAt datetime ); ";
			
		String insertquery="insert into employee (name,salary) values('Shaina',40000);";


		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		try {
			 conn = DriverManager.getConnection(url,uname,pwd);
			 st = conn.prepareStatement(query);
			 st.executeUpdate();
			  System.out.println("database created successfully...");
			  st.close();
//			  conn.close();
			 
			  conn = DriverManager.getConnection(url2,uname,pwd);
			  st = conn.prepareStatement(createquery);
			  st.executeUpdate();
              System.out.println("table created successfully...");

			  
			  st = conn.prepareStatement(insertquery);
			  st.executeUpdate();
              System.out.println("record inserted successfully...");
			  
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
            // Close resources to prevent memory leaks
            try {
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}

}







