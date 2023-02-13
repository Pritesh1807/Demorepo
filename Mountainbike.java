package com.sun;

class Mountainbike extends Bicycle {
	public int setheight;

	public Mountainbike(int gear, int speed, int setheight){
		super(gear, speed);
		;
	}
	
	public void setheight(int newvalue) 
	{
		setheight=newvalue;
	}
	
	public String tostring() 
	{
		return (super.tostring() + "\n setheight is:" + setheight);
	}
}
