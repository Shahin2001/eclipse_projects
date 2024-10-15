package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
		String createquery="create table if not exists employee(id int primary key auto_increment, name varchar(45),salary int, createdAt DATETIME DEFAULT CURRENT_TIMESTAMP); ";
		 
		String insertquery = "insert into college.employee (name, salary) values ('Shap', 40000)";
                 
//                + "('Ramesh', 40000),"
//                + "('Rahul', 40000);";
		 
		//String insertquery="insert into employee (name,salary,createdAt) values(('Shap',40000,now()),('Ramesh',40000,now()),('Rahul',40000,now()));";


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
              
              showAllRecords(conn);
			  
			
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
	
	public static void showAllRecords(Connection conn) {
		String selectquery="select* from employee";
		PreparedStatement st=null;
		 ResultSet rs=null;
		 
		 try {
			 st = conn.prepareStatement(selectquery);
			 rs = st.executeQuery();
			 
			 while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                int salary = rs.getInt("salary");

	                String createdAt = rs.getString("createdAt");

	                System.out.println(id + "\t" + name + "\t" + salary + "\t" + createdAt);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (rs != null) rs.close();
	                if (st != null) st.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	      }
		}







