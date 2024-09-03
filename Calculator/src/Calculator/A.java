package Calculator;
import java.util.*;
public class A{
	

public static class Calculator {
	 void add(int a, int b) {
		 System.out.println(a+b);
	 }
       
       
	 /*int sub(int a, int b) {
		 return a-b;
	 }
	 
	 int mul(int a, int b) {
		 return a*b;
	 }
	 
	 int div(int a, int b) {
		 return a/b;
	 }*/
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
	Calculator ab=new Calculator();
	 ab.add(a,b);
	//int res2=ab.sub(a,b);
//	int res3=ab.mul(a,b);
	//int res4=ab.div(a,b);
	//System.out.println(res1);
	//System.out.println(res2);
	//System.out.println(res3);
	//System.out.println(res4);
	 sc.close();
	
}

}