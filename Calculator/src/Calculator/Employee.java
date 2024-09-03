package Calculator;

public class Employee {
	int id=100;
	String name="Shaina";
	int sal=30000;
	
	void bonus(int amt) {
		System.out.println("Start Bonus Method");
		sal=sal+amt;
		System.out.println(sal);
		System.out.println("End Bonus Method");
	}
	
	void monthsal() {
		System.out.println("Start Monthly salary Method");
		System.out.println(sal);
		System.out.println("End Monthly salary Method");
	}

}
