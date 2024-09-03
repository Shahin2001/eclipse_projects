package com.assign9;

public class C {
       private int id;
       private String name;
       
       C(){
    	   id=10;
    	   name="Shaina";
       }

	public C(int sid, String sname) {
		
		id = sid;
		name = sname;
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
	
	public static void main(String[] args) {
		C c=new C();
		C b=new C(2,"shaina");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		
		System.out.println(b.getId());
		System.out.println(b.getName());
		
	}
       
       
}
