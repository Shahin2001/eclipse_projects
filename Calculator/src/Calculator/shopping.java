package Calculator;

public class shopping {
	
	//public static final char[] CalculateTotalBill = null;
	double electronictotal=0;
	double clothstotal=0;
	double foodtotal=0;
	double electronics(double price1, double price2) {
		//String name1,name2;
		//int price1, price2;
		double gst=price1+price1*0.15;
		double gstd=price2+price2*0.15;
		 electronictotal=gst+gstd;
		//System.out.println("Total amount:"+electronictotal);
		//int discount=total-(total*25)/100;
		//System.out.println("Final  amount:"+discount);
		return electronictotal;
		
	}
	
	double cloths(double price) {
	 clothstotal=price+price*0.08;
		//System.out.println("Total amount:"+clothstotal);
		return clothstotal;
		
	}
	
	double food(double price1 ,double price2) {
		double gst=price1+price1*0.05;
	double gstd=price2+price2*0.05;
	 foodtotal=gst+gstd;
		//System.out.println("Total amount:"+foodtotal);
		return foodtotal;
		
	}
	double CalculateTotalBill() {
		//double TotalBill = electronictotal +clothstotal +foodtotal;
		//return TotalBill;
		return electronictotal +clothstotal +foodtotal;
	}
	
	double applyDiscount(double totalBill) {
        double discount = 0.25; // 25% discount
        return totalBill - (totalBill * discount);
    }

}
