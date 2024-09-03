package firstproject;

public class palindrome {
	//int no=231;
	int temp;
	int reverse=0;
	int rem;
	int no=121;
	boolean pal() {
		temp=no;
		while(no>0) {
			rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		return temp==reverse;
		
	}

}
