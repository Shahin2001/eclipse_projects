package com.dao;
import com.entity.Player;

public class Dao {
	public Player[] p(int size) {
		Player [] db=new Player[size];
		db[0]= new Player (1,"abc",23);
		db[1]= new Player (2,"abcd",25);
		db[2]= new Player (3,"abcde",24);
		
		return db;
		
	}

}
