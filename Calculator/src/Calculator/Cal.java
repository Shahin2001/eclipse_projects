package Calculator;

public class Cal {
	void avg(int a, int b) {
		int av=(a+b)/2;
		System.out.println("Average is:"+av);
		
	}
	void getper(int a) {
		int gst=a+a*15/100;
		System.out.println("GST is:"+gst);
	}
    void per(int math, int english,int science) {
    	int total=((math+english+science)*100)/300;
    	System.out.println("Total is:"+total);
    	
    }
}
