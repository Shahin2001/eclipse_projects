package com.service;

import com.dao.Dao;
import com.entity.Player;

public class Service {
	Dao d1;
	public Player[] s2() {
		d1=new Dao();
		Player[] e1=d1.p(3);
		return e1;
	}

}
