package arraypractice;

public class SmallestNo {
	public static void main(String[] args) {
		int a[]= {2,7,8,9,5,3,6};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
