package forloop;

public class palindrome {
	int rem,rev=0;
	void pal(int n) {
		for(int i=n;i>0;i/=10) {
			rem=i%10;
			rev=rev*10+rem;
		}
		if(n==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
	}

}
