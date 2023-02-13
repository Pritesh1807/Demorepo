package com.sun;

class Base {
	String name;
	//creating constructor 1
	Base()
	{
		this("");
		System.out.println("No-argument constructor");
		}
	//constructor 2 
	Base(String name)
	{
		this.name=name;
		System.out.println("calling parameterized constructor base of base");
		}
	
}


