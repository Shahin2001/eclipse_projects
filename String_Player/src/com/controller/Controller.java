package com.controller;

import com.entity.Player;
import com.service.Service;

public class Controller {
	Service service1;
	public Player[] controll() {
		service1=new Service();
		Player[] e2=service1.s2();
		return e2;
	}

}
