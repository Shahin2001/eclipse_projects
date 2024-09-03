package firstproject;

public class palindrometest {
	public static void main(String[] args) {
		palindrome p= new palindrome();
		//Object no;
		//p.pal(123);
		if(p.pal()) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
