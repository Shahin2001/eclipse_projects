package com.assign9;

public class BB extends AA {
    BB(){
    	System.out.println("Sub");
    }
    BB(int n){
    	System.out.println("Subb");
    }
    
    void display() {
    	System.out.println("Hello");
    }
    public static void main(String[] args) {
//		BB b=new BB();
//		b.display();
		
		BB b1=new BB(10);
		b1.display();
	}
}
