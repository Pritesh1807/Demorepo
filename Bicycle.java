package com.sun;

public class Bicycle {
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applybreak(int decrement) 
	{
		speed-=decrement;
	}

	public void increasespeed(int increment) 
	{
		speed+=increment;
	}
	

	public String tostring() 
	{
		return("no of gear are:"+ gear+ "\n" +"speed of bicycle is:" +speed);
	}
}
