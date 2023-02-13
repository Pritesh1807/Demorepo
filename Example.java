package com.sun;
import java.util.function.*;    //this is built in package in java 

public class Example {
	private int number;
	private String name;
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void printdetails() {
		System.out.println("number:" + number);
		System.out.println("name:" + name);
	}
	
	public static void main(String[]args) {
		Example ex1=new Example();
		ex1.setNumber(5);
		ex1.setName("Pritesh patel");
		ex1.printdetails();
	}

	
}
