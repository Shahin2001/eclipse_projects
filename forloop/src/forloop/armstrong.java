package forloop;

public class armstrong {
	void arm(int n) {
		int rem,  sum=0, digits=0;
		for(int i=n;i>0;i/=10) {
			digits++;
			
		}
		for(int i=n;i>0;i/=10) {
			rem=i%10;
			int power=1;
			
			
		
		for(int j=1;j<=digits;j++) {
			power=power*rem;
			
		}
		sum+=power;
		
		}
		if(n==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
		
	}

}
