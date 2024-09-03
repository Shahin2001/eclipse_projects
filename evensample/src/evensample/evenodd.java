package evensample;

public class evenodd {
	
	String eveod(int no) {
		if(no%2==0) {
			if(no==0) {
				
				return "zero";
			}
			else {
				return "even";
			}
		}
		else {
			return "odd";
		}
	}
	
	public static void main(String args[]) {
		evenodd e=new evenodd();
		String result=e.eveod(5);
		System.out.println(result);
		
			
		}

}
