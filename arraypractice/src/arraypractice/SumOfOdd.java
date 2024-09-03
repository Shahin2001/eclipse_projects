package arraypractice;

public class SumOfOdd {
	public static void main(String[] args) {
		int a[]= {2,7,8,9,5,3,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				sum=sum+a[i];
				
			}
		}
		System.out.println(sum);
		
	}

}
