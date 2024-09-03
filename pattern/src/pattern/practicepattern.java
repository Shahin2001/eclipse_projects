package pattern;

public class practicepattern {
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				String str="INDIA";
//				System.out.print(str.charAt(j-1) );
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<i;j++) {
//				System.out.print("  ");
//			}
//			for(int k=5;k>=i;k--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=5-i;j>0;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		for (int i = 5; i >= 1; i--) {
		    // Print spaces to align stars to the right
		    for (int j = 5 - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    // Print stars
		    for (int k = 1; k <= i; k++) {
		        System.out.print("* ");
		    }
		    System.out.println(); // Move to the next line after each row
		}

		
	}

}
