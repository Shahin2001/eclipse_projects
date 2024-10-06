package com.sep30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class example {

    public static void main(String[] args) {
        String path = "com.mysql.cj.jdbc.Driver";
        
        String url = "jdbc:mysql://localhost:3307/batch1194db";
        String uname = "root";
        String pwd = "root";
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM batch1194db.student";
        
        String createquery = "CREATE TABLE IF NOT EXISTS batch1194db.student1 (" +
                             "roll INT PRIMARY KEY, " +
                             "name VARCHAR(45), " +
                             "marks INT)";
        
        // String insertquery = "INSERT INTO batch1194db.student1 VALUES(3, 'shamo', 50)";
        
        String selectquery = "SELECT * FROM batch1194db.shopping WHERE city = 'satara'";
        
        try {
            Class.forName(path);
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            conn = DriverManager.getConnection(url, uname, pwd);
            System.out.println("Connection Established");
            
            st = conn.createStatement();
            System.out.println("Statement Created");
            
            // Execute the first query (Student table)
            rs = st.executeQuery(query);
            System.out.println("Query executed");
            
            // Process the ResultSet for student records
            while (rs.next()) {
                int sroll = rs.getInt(1);
                String sname = rs.getString(2);
                int smarks = rs.getInt(3);
                
                System.out.printf("roll %3s  name %3s  marks %3s\n", sroll, sname, smarks);
            }
            
            // Close the ResultSet after processing
            if (rs != null) rs.close(); // **Line 43 Correction: Close rs here after processing**

            // Execute the create table query
            st.executeUpdate(createquery);
            System.out.println("Table created successfully");
            
            // Execute the second query (Shopping table)
            rs = st.executeQuery(selectquery);
            System.out.println("Shopping Query Executed");
            
            // Process the ResultSet for shopping records
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                String city = rs.getString(4);
                
                System.out.printf("id %3s  name %3s  price %3s city %s\n", id, name, price, city); // **Line 54 Correction: Change %3 to %s for city**
            }
            
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                System.out.println("Duplicate entry detected");
            } else {
                e.printStackTrace();
            }
        } finally {
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
