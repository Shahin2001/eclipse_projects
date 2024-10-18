package com.client;

import java.util.List;

import com.controller.Controller;
import com.entity.Player;

public class IPLClient {
	
	public static void main(String[] args) {
		Controller controller=null;
		 controller = new Controller();
		List<Player> player=controller.getAllPlayers();
		for(Player p:player) {
			System.out.println(p);
		}
		
		System.out.println("CSK Players");
		List<Player> cskPlayers=controller.getPlayersByTeam("CSK");
		for(Player p:cskPlayers) {
			System.out.println(p);
		}
	}

}
