package Constructor;

public class Personn {
	
	
	void m1() {
		System.out.println( "static");
		Personn.m2();
	}
	
	static void m2() {
		System.out.println( "------static");
	}

}
