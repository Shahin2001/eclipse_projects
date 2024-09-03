package ThisSuper.com;

public class B extends A {
//	int p;
//	int a=20;
//	B(int b){
//		this.p=b;
//		
//	}
//	void m1() {
//		int a=30;
//		System.out.println(super.a);
//		System.out.println(this.a);
//		System.out.println(a);
//		super.m1();
//	}
	
	int roll;
	String name;
	String city;
	B(){
		System.out.println("NonPara");
	}
	B(int r){
		this();
		this.roll=r;
		System.out.println("OnePara");
	}
	B(int r, String n){
		this(r);
		this.name=n;
		System.out.println("TwoPara");
	}
	B(int r, String n, String c){
		this(r,n);
		this.city=c;
		System.out.println("ThreePara");
	}
	B( String n, String c){
		
		super(n);
		System.out.println("FourPara");
	}



}
