package practice;

public class prime {
	public static void main(String[] args) {
		int n=13;
		boolean isprime=false;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isprime=true;
				break;
				
			}
		}
		if(!isprime && n>1) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
