package com.sun;

class Defaultconstruct {
	int number;
	String name;
	Defaultconstruct(){
		System.out.println("This is a default constructor");
	}
}

class Defaultconstructor{
	public static void main(String[]args) {
		Defaultconstruct d1=new Defaultconstruct();
		System.out.println(d1.name);
		System.out.println(d1.number);
		
	}
}
