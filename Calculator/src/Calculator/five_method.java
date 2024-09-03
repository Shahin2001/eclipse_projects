package Calculator;
import java.util.*;
public class five_method {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		five_class ss=new five_class();
		System.out.println("Enter title");
		String title=sc.next();
		System.out.println("Enter author");
		String author=sc.next();

		System.out.println("Enter price");
		int price=sc.nextInt();

		 ss.book(title,author,price);
		 sc.close();
	}

}
