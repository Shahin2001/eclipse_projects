package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Task {
	public static void main(String[] args) {

		String path = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3307/";
		String url2 = "jdbc:mysql://localhost:3307/college";

		String uname = "root";
		String pwd = "root";

		Connection conn = null;

		PreparedStatement st = null;

		String query = "create database if not exists college";

		String createquery = "create table if not exists user_employee(id int primary key auto_increment,full_name varchar(70),username varchar(45),password varchar(45),createdAt DATETIME DEFAULT CURRENT_TIMESTAMP ); ";

		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, uname, pwd);
			st = conn.prepareStatement(query);
			st.executeUpdate();
			System.out.println("database created successfully...");
			st.close();
//			  conn.close();

			conn = DriverManager.getConnection(url2, uname, pwd);
			st = conn.prepareStatement(createquery);
			st.executeUpdate();
			System.out.println("table created successfully...");

			Scanner sc = new Scanner(System.in);
			System.out.println("1.Sign Up");
			System.out.println("2.Show Users");
			System.out.println("3.Login");
			System.out.println("Enter a choice:");
			int ch = sc.nextInt();
			
			JDBC_Task a=new JDBC_Task();

			switch (ch) {
			case 1:
				System.out.println("Sign Up");
				
				a.signUp(conn);
				break;

			case 2:
				System.out.println("Show Users");
				a.showUsers(conn);
				break;

			case 3:
				System.out.println("Login");
				a.loginUser(conn);
				break;

			default:
				System.out.println("Invalid choice");

			}



		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			
			try {
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void showUsers(Connection conn) {
		String query="select id,full_name,createdAt from user_employee";
		
		PreparedStatement st=null;
		 ResultSet rs=null;
		 
		 try {
			 //Connection conn = null;
			st = conn.prepareStatement(query);
			 rs = st.executeQuery();
			 
			 while(rs.next()) {
				 int id = rs.getInt("id");
	             String name = rs.getString("full_name");
	             String createdAt = rs.getString("createdAt");

	             System.out.println(id);  
	             System.out.println(name);  
	             System.out.println(createdAt);  
			 }
		 } catch (SQLException e) {

				e.printStackTrace();
		 } 


	}

	public static void signUp(Connection conn) {
		String insertquery = "insert into college.user_employee (full_name, username,password) values ('Shap Momin', 'shap123','shap')";
		 //Connection conn=null;
		 PreparedStatement st=null;
	      try {
			st = conn.prepareStatement(insertquery);
			st.executeUpdate();
	         System.out.println("record inserted successfully...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}

	public static void loginUser(Connection conn) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter username: ");
	        String uname = sc.next();
	        System.out.println("Enter password: ");
	        String pass = sc.next();

	        String query = "SELECT username, password FROM user_employee WHERE username = ? AND password = ?";

	        PreparedStatement st = null;
	        ResultSet rs = null;

	        try {
	            st = conn.prepareStatement(query);
	            st.setString(1, uname); 
	            st.setString(2, pass);  

	            rs = st.executeQuery();

	            if (rs.next()) {
	                System.out.println("Login successful!" );
	            } else {
	                System.out.println("Login failed! Invalid username or password.");
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


