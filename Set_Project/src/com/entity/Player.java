package com.entity;

public class Player {
	private String name;
	private int jerseyno;
	private int runs;
	private int wickets;
	private String teamname;
	public Player() {
		super();
	}
	public Player(String name, int jerseyno, int runs, int wickets, String teamname) {
		super();
		this.name = name;
		this.jerseyno = jerseyno;
		this.runs = runs;
		this.wickets = wickets;
		this.teamname = teamname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", jerseyno=" + jerseyno + ", runs=" + runs + ", wickets=" + wickets
				+ ", teamname=" + teamname + "]";
	}
	
	
	

}
