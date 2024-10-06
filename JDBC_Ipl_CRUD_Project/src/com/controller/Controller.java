package com.controller;

import java.util.List;

import com.entity.Player;
import com.service.service;

public class Controller {
	service service=null;
	public List<Player> getAllPlayers() {
		service = new service();
		
		return service.getAllPlayers();
		// TODO Auto-generated method stub
		
	}
	 public List<Player> getPlayersByTeam(String teamName) {
	        service = new service();
	        return service.getPlayersByTeam(teamName);
	    }

}
