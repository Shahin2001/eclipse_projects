package com;

public class Zomato {
	
	public void otpEnter(int otp)  {
		if(otp==12345) {
			System.out.println("Success");
		}
		else {
			//System.out.println("unsuccess");
			throw new OtpNotMatch("OTP did not match");
		}
		
		
	}

}
