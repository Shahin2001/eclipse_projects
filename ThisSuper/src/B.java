
public class B extends A {
	
	int a=20;
	B(){
		super(100);
		System.out.println("Constructor B");
	}
	void m1() {
		super.m1();
		System.out.println("222");
		System.out.println(a);
		
		System.out.println(super.a);
	}

}
