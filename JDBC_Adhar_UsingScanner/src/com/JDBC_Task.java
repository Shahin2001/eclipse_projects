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

		String createquery = "create table if not exists user_emp(id int primary key auto_increment,full_name varchar(70),username varchar(45),password varchar(45),createdAt DATETIME DEFAULT CURRENT_TIMESTAMP ,aadhar LONGBLOB); ";

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

//			  st = conn.prepareStatement(insertquery);
//			  st.executeUpdate();
//              System.out.println("record inserted successfully...");

			// showAllRecords(conn);

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// Close resources to prevent memory leaks
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
		String query="select id,full_name,createdAt from user_emp";
		
		PreparedStatement st=null;
		 ResultSet rs=null;
		 
		 try {
			// Connection conn = null;
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
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();

        // Dummy blob for aadhar, to be replaced with actual file upload logic
        byte[] aadharFile = "dummyAadharFileContent".getBytes(); 

        String insertQuery = "INSERT INTO user_emp (full_name, username, password, aadhar) VALUES (?, ?, ?, ?)";

        try (PreparedStatement st = conn.prepareStatement(insertQuery)) {
            st.setString(1, fullName);
            st.setString(2, username);
            st.setString(3, password);
            st.setBytes(4, aadharFile);

            st.executeUpdate();
            System.out.println("Sign up successful! User registered.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public static void loginUser(Connection conn) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String inputUsername = sc.next();
        System.out.println("Enter password: ");
        String inputPassword = sc.next();

        String query = "SELECT username, password FROM user_emp WHERE username = ? AND password = ?";

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(query);
            st.setString(1, inputUsername);  // Set the username in the query
            st.setString(2, inputPassword);  // Set the password in the query

            rs = st.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful! Welcome, " + inputUsername);
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