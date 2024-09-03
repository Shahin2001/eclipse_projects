package com.entity;

public class Employee {
	private int id;
	private String name;
	private String role;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String role, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", sal=" + sal + "]";
	}
	
	public void showAllEmp() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", role=" + role + ", sal=" + sal + "]");
	}

}
