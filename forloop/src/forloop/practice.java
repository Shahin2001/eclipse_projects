package forloop;

public class practice {

	void table() {
		for (int i = 5; i <= 8; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}

	}
	
	
	void prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		System.out.println(count);
		if(count>2) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("prime");
		}
	}
	
	
	
	

}
