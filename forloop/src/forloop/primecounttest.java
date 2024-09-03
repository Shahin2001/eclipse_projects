package forloop;

public class primecounttest {
	public static void main(String[] args) {
		primecount p=new primecount();
		int cnt=0;
		for(int j=1;j<=100;j++) {
			if(p.prime(j)) {
				cnt++;
			}
			
		}
		System.out.println("Count is:"+cnt);
	}

}
