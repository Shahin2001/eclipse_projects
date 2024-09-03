package com.test;

import com.controller.Controller;
import com.entity.Player;

public class Test {
	public static void main(String[] args) {
		Controller c = new Controller();
		
		
		
		
		
		
		System.out.println("Detail of multiple entities:");
		Player e[] = c.controll();

//		for (int i = 0; i < e.length; i++) {
//			System.out.println(e[i]);
//		}
		
		
		
		for(Player e1:e) {
			System.out.println(e1);
			
			
		}

	}
}
