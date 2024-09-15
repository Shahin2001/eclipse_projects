package com.client;

import java.util.Set;

import com.controller.PlayerController;
import com.entity.Player;

public class PlayerTest {

	public static void main(String[] args) {

		PlayerController p = new PlayerController();
		Set<Player> s = p.getAllPlayerController();
		
		
		Set<Player> s1=p.getCSKPlayerController();
		System.out.println(s1);
		// TODO Auto-generated method stub
		
		for(Player p1:s) {
			System.out.println(p1);
		}
		
		
		
	}

}
