package com.aug9;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee(2, "Jay", 34000, "CSE");
		// e.setEid(23);
//		System.out.println(e.getEid());
//		System.out.println(e.setEid(23);

		System.out.println("Initial Employee ID: " + e.getEid());
        e.setEid(23);
        System.out.println("Updated Employee ID: " + e.getEid());
        System.out.println();
        
		System.out.println("Initial Employee ID: " + e.getEname());
        e.setEname("Shaina");
        System.out.println("Updated Employee ID: " + e.getEname());
        System.out.println();
        
        System.out.println("Initial Employee ID: " + e.getEsal());
        e.setEsal(50000);
        System.out.println("Updated Employee ID: " + e.getEsal());
        System.out.println();
        
        System.out.println("Initial Employee ID: " + e.getEdept());
        e.setEdept("IT");
        System.out.println("Updated Employee ID: " + e.getEdept());
        System.out.println();
        
		System.out.println(e);
	}

}
