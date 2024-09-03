package Calculator;

public class shop {
	
	void Calprice(int e1, int e2, int c1, int f1, int f2) {
		int gste1=e1+e1*15/100;
		int gste2=e2+e2*15/100;
		int gstc1=c1+c1*8/100;
		int gstf1=f1+f1*5/100;
		int gstf2=f2+f2*5/100;
		
		int totalprice=(gste1+gste2+gstc1+gstf1+gstf2);
		
		System.out.println("Total price is:"+ totalprice);
		
		int finalprice=totalprice-(totalprice*25)/100;
		System.out.println("Final price is:"+ finalprice);
		
	}
//	void electronics(int price1, int price2) {
//		//String name1,name2;
//		//int price1, price2;
//		int gst=price1+price1*15/100;
//		int gstd=price2+price2*15/100;
//		int total=gst+gstd;
//		System.out.println("Total amount:"+total);
//		//int discount=total-(total*25)/100;
//		//System.out.println("Final  amount:"+discount);
//		
//	}
//	
//	void cloths(int price) {
//		int total=price+price*8/100;
//		System.out.println("Total amount:"+total);
//		
//	}
//	
//	void food(int price1 ,int price2) {
//		int gst=price1+price1*5/100;
//		int gstd=price2+price2*5/100;
//		int total=gst+gstd;
//		System.out.println("Total amount:"+total);
//		
//	}

}
