package Constructor;

public class Para {
	int age;
	String nm;
	int marks;
	
	Para(int a,String b, int c){
		System.out.println("Parametrized");
		System.out.println(a+" " + b+" "+ c);
		age=a;
		nm=b;
		marks=c;
	}
	
	public void display() {
		System.out.println("Name:"+nm);
		System.out.println("Age:"+age);
		System.out.println("Marks:"+marks);
		System.out.println("=================================");
	}

	


}
