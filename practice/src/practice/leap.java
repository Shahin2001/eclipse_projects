package practice;

public class leap {
	
	boolean checkleap(int y) {
		if(y%4==0 && (y%100!=0 || y%400==0)) {
			//System.out.println("leap year");
			return true;
		}
		else {
			//System.out.println("not leap year");
			return false;
		}
	}
	
	String checkmax(int a, int b, int c) {
		if(a>b && a>c) {
			return "a is max";
		}
		else if(b>a && b>c) {
			return "b is max";
		}
		else if(a==b && b==c && a==c) {
			return " same age";
		}
		else {
			return c +" is max";
		}
	}
	
	public static void main(String args[]) {
		leap l=new leap();
		//l.checkleap(2024);
		boolean result =l.checkleap(1900);
		System.out.println(result);
//		if(result) {
//			System.out.println("leap year");
//		}
//		else {
//			System.out.println("not leap year");
//		}
		
		///////////////////////////////////
		
		leap c=new leap();
		String res=c.checkmax(8,8,8);
		System.out.println(res);
	}

}
