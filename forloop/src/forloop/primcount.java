package forloop;

public class primcount {
	public static void main(String args[]) {
		//int cnt=0;
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					//break;
					
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		//System.out.println(cnt);
	
	}

}
