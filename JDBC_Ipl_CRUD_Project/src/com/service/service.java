package com.service;

import java.util.List;

import com.dao.dao;
import com.entity.Player;

public class service {
	dao dao=null;
	public List<Player> getAllPlayers() {
		 dao = new dao();
		 
		return dao.getAllPlayers();
		// TODO Auto-generated method stub
		
	}
	public List<Player> getPlayersByTeam(String teamName){
		dao=new dao();
		return dao.getPlayersByTeam(teamName);
		
	}

}
