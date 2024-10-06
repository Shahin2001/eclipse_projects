package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Player;

public class dao {

	public List<Player> getAllPlayers() {
        String path="com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3307/batch1194db";
		String uname="root";
		String pwd="root";
		
		Connection conn=null;
		Statement st=null;
		 ResultSet rs=null;
		 List<Player> playerList = new ArrayList<>();
		
		String query="SELECT * FROM player";
		//String insertquery="insert into player values(8, 'Jadeja', 2500, 300, 'CSK')";
		
		try {
			Class.forName(path);
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
		conn = DriverManager.getConnection(url, uname, pwd);
			System.out.println("Connection Establish");
			
			 st = conn.createStatement();
			 System.out.println("Statement");
			 
//			 st.executeUpdate(insertquery);
//			 System.out.println("Insert Query Successfully");
			 
			 rs = st.executeQuery(query);
			 System.out.println("Execute Query");
			 
			
			 
			 
			 
			 while(rs.next()) {
				 int jn = rs.getInt(1);
				 String name = rs.getString(2);
				 int runs = rs.getInt(3);
				 int wickets = rs.getInt(4);
				 String tname = rs.getString(5);
				 
				 Player player = new Player(jn,name,runs,wickets,tname);
				 playerList.add(player);
			 }
			//System.out.println();
			
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(e.getErrorCode()==1062) {
				System.out.println("Duplicate entry detected");
			}else {
				e.printStackTrace();
			}
			
		}
			
		finally {
            // Close the resources in the reverse order of their creation
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		return playerList;
		// TODO Auto-generated method stub
		
	}
	
	public List<Player>getPlayersByTeam(String teamName){
		
		 String path="com.mysql.cj.jdbc.Driver";
			
			String url = "jdbc:mysql://localhost:3307/batch1194db";
			String uname="root";
			String pwd="root";
			
			Connection conn=null;
			Statement st=null;
			 ResultSet rs=null;
			 List<Player> playerList = new ArrayList<>();
			
			String query="SELECT * FROM player where tname='"+teamName+"'";
			
			try {
				Class.forName(path);
				System.out.println("Driver Loaded");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				 conn = DriverManager.getConnection(url,uname,pwd);
				 System.out.println("Establish Connection");
				 
				 st=conn.createStatement();
				 System.out.println("Statement");
				 
				 rs = st.executeQuery(query);
				 System.out.println("Execute query");
				 
				  while (rs.next()) {
		                int jn = rs.getInt(1);
		                String name = rs.getString(2);
		                int runs = rs.getInt(3);
		                int wickets = rs.getInt(4);
		                String tname = rs.getString(5);

		                Player player = new Player(jn, name, runs, wickets, tname);
		                playerList.add(player);
		            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return playerList;
		
	}

	

}
