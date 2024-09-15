package com.entity;

public class Student {
	private String name;
	private int roll;
	private double sal;

	public Student() {
		super();
	}

	public Student(String name, int roll, double sal) {
		super();
		this.name = name;
		this.roll = roll;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", sal=" + sal + "]";
	}

}
