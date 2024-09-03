package ThisSuper.com;

public class A {
//	int a=10;
//	void m1() {
//		System.out.println("111");
//	}
	
	String name;
	String city;
	A(){
		System.out.println("111");
	}
	A(String n){
		//this();
		this.name=n;
		System.out.println("222");
	}
	A(String n, String c){
		this(n);
		this.city=c;
		System.out.println("333");
	}

}
