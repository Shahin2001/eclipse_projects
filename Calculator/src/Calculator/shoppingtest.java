package Calculator;

public class shoppingtest {
	public static void main(String[] args) {
		shopping sh=new shopping();
		sh.electronics(500,600);
		sh.cloths(200);
		sh.food(600,600);
		double TotalBill =sh.CalculateTotalBill();
		System.out.println(TotalBill);
		 double finalPrice = sh.applyDiscount(TotalBill);
	     System.out.println("Final Price (after 25% discount): " + finalPrice);
	}

}
