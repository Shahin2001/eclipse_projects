package forloop;

public class fibonacci {
	void fibb(int n) {
		int a=0, b=1,c=0;
		//System.out.print("Fibonacci series is:"+a+" "+b);
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			 c=a+b;
			//System.out.print(" "+c+" ");
			a=b;
			b=c;
			
		}
		
	}
	

}
