package arraypractice;

public class LargestNo {
	public static void main(String[] args) {
		int a[]= {2,7,8,9,5,3,6};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
