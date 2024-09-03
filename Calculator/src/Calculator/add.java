package Calculator;

public class add {
	double ad(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}
	double average( double a, double b) {
		//add a=new add();
		//double sum=a.ad(n1,n2);
		double sum=ad(a,b);
		double avg=sum/2;
		System.out.println(avg);
		return avg;
		
	}

}

