package com.sun;

class Bankresult extends Bank{
	public static void main(String[]args) {
		SBI s1= new SBI();
		ICICI I1= new ICICI();
		HDFC H1= new HDFC();
		System.out.println(s1.rateofinterest());
		System.out.println(I1.rateofinterest());
		System.out.println(H1.rateofinterest());
		}

}
