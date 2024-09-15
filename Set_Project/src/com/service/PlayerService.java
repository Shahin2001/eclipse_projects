package com.service;

import java.util.HashSet;
import java.util.Set;

import com.dao.PlayerDao;
import com.entity.Player;

public class PlayerService {
	PlayerDao dao = null;

	public Set<Player> getAllPlayerService() {

		dao = new PlayerDao();

		Set<Player> db = dao.getAllPlayers();

		return db;

	}

	public Set<Player> getAllPlayerCSK() {

		dao = new PlayerDao();

		Set<Player> db = dao.getAllPlayers();
		Set<Player> db1 = new HashSet<>();
		
		for(Player p:db
				){
			if("CSK".equals(p.getTeamname())) {
				db1.add(p);
				
			}
			
		}
		

		return db1;

	}

}
