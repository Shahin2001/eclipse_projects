package com.controller;

import java.util.Set;

import com.dao.PlayerDao;
import com.entity.Player;
import com.service.PlayerService;

public class PlayerController {

	PlayerService service = null;

	public Set<Player> getAllPlayerController() {

		service = new PlayerService();
		Set<Player> db = service.getAllPlayerService();

		return db;
	}

	public Set<Player> getCSKPlayerController() {

		service = new PlayerService();
		Set<Player> db = service.getAllPlayerCSK();

		return db;
	}

}
