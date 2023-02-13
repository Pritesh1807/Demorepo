package com.sun;


class Derived extends Base {
	// constructor 3
	Derived()
	{
		System.out.println("no argument constructor of derived class");
	}
	Derived( String name)
	{
		super(name);
		System.out.println("calling parameterized constructor of derived class");
	}
	
	public static void main(String[]args) {
		Derived d1=new Derived("test");
	}
}

