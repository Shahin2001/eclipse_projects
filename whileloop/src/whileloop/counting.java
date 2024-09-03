package whileloop;

public class counting {
	
	
		public static void main(String[] args) {
	//  count no of digits in given number
			
//			int n=123456667;
//			int  count=0;
//			while(n>0) {
//				n/=10;
//				count++;
//			}
//			System.out.println(count);
			
			
			
			
//	     Factorial of given no
			
//			int n=5,fact=1;
//			while(n>0) {
//				fact=fact*n;
//				n--;
//			}
//			System.out.println(fact);
			
			
			
//	      Addition of n natural numbers upto n		
//			int n=5;
//			int sum=0;
//			while(n>0) {
//				sum=sum+n;
//				n--;
//			}
//			System.out.println(sum);
			
			
			
	//  Reverse a given no	
			
//			int n=123,i=1,rev=0,rem;
//			while(n!=0) {
//				rem=n%10;
//				rev=rev*10+rem;
//				n=n/10;
//				
//			}
//			System.out.println(rev);
//			
			
			
//	      Given no is palindrome or not
			
			int n=1001, rev=0,rem;
			int temp=n;
			while(n>0) {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(temp==rev) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
			
			
			
			
			
//	      given no prime or not
			
//			int i=1, n=2, count =0;
//			while(i<=n) {
//				if(n%i==0) {
//					count++;
//				}
//				i++;
//			}
//				if(count==2) {
//					System.out.println("prime");
//				}
//				else {
//					System.out.println("not prime");
//				}
			
			
			
			
			
//	        Given no is armstrong or not
			
//		 int n=1634, digits=0, sum=0;
//		 int temp=n;	
//			while(temp>0) {
//				digits++;
//				temp=temp/10;
//			}
//			temp=n;
//			while(temp>0) {
//				int total=temp%10;
//				sum+=Math.pow(total, digits);
//				temp/=10;
//			}
//			if(sum==n) {
//				System.out.println("armstrong");
//			}
//			else {
//				System.out.println("Not armstrong");
//			}
////			 
//			 
		}

	}



