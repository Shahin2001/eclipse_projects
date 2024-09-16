package com.dao;

import java.util.HashSet;
import java.util.Set;

import com.entity.Player;

public class PlayerDao {
	
	public Set<Player>getAllPlayers() {
		
		Set<Player> db=new HashSet();
		
		db.add(new Player("abc",2,400,3,"CSK"));
		db.add(new Player("abcd",9,600,2,"MI"));
		db.add(new Player("abcde",88,500,1,"AUS"));
		
		
		
		return db;
		
	}

}
