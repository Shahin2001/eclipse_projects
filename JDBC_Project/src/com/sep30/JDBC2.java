package com.sep30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {

    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/batch1194db";
        String uname = "root";
        String pwd = "root";
        
        Connection conn = null;
        Statement st = null;
        
        
        String createTableQuery = "CREATE TABLE IF NOT EXISTS batch1194db.studentcopy LIKE batch1194db.student";
        
       
        String copyRecordsQuery = "INSERT INTO batch1194db.studentcopy (roll, name, marks) " +
                                  "SELECT roll, name, marks FROM batch1194db.student";
        
        try {
            
            Class.forName(driver);
            System.out.println("1. Driver Loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
           
            conn = DriverManager.getConnection(url, uname, pwd);
            System.out.println("2. Connection Established");
            
            
            st = conn.createStatement();
            System.out.println("3. Statement Created");
            
            
            st.executeUpdate(createTableQuery);
            System.out.println("4. studentcopy Table Created");
            
           
            int rowsAffected = st.executeUpdate(copyRecordsQuery);
            System.out.println("5. Records Copied, Rows Affected: " + rowsAffected);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
