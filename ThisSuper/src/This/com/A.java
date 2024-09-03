package This.com;

public class A {
	int a;
	A(){
		this(100);
		System.out.println("111");
	}
	A(int a){
		//this();
		System.out.println("1111111");
	}
	void m1(int a) {
		this.a=a;
		System.out.println(a);
	}

}
