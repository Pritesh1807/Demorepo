package com.sun;

class Temp {
	Temp()
	{// default constructor 
		this(10);
		System.out.println("This is a defualt constructor");
	}
	
	Temp(int x){
		//calls constructor 3
		this(5,10);
		System.out.println(x);
	}
	
	//constructor 3
	Temp(int x, int y){
		System.out.println(x*y);
	}
	
	public static void main(String[]args) {
		// invoke default constructor first
		new Temp();
	}
}
