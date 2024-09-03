package mock;

public class Test {
	public static void main(String[] args) {
//		int n=4,fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//			
//		}
//		System.out.println(fact); 
		
		
//		int n=123, count=0;
//		for(int i=n;n>0;n/=10) {
//			count++;
//		}
//		System.out.println(count); 

//	    int year=2000;
//	    if(year%4==0 && (year%100!=0 || year%400 ==0)) {
//	    	System.out.println("leap");
//	    }
//	    else {
//	    	System.out.println("Not leap");
//	    }
		
		
//		int n=5,sum=0;
//		for (int i=1;i<=n;i++) {
//			sum+=i;
//		}
//		System.out.println(sum); 
		
//		int n=1222221,rev=0,rem,temp=n;
//		for (int i=n;n>0;n/=10) {
//			rem=n%10;
//			rev=rev*10+rem;
//			
//		}
//		System.out.println( rev);
//		if(rev==temp) {
//			System.out.println("palidrome");
//		}
//		else {
//			System.out.println("not palidrome");
//		}
	
		
//		int n=22,count=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not ");
//		}
	
	    int n=1634,count=0,rev=0,rem,sum=0,temp=n;
	    		for(int i=n;i>0;i/=10) {
	    			count++;
	    		}
	    		for(int i=n;i>0;i/=10) {
	    		 rem=i%10;
	    			rev=rev*10+rem;
	    			sum+= Math.pow(rem , count);
	    		}
	    	
	    	if(temp==sum) {
	    		System.out.println("armstrong");
	    	}
	    	else {
	    		System.out.println("not");
	    	}
	}
	
}
