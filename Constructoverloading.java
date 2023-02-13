package com.sun;

class Constructor {
	Constructor(String name){
		System.out.println("constructor with one argument:" + name);
	}
	
	Constructor (String name, int num){
		System.out.println("Constructor with two arguments:" + name + " "+ num);
	}
	
	Constructor(long id){
		System.out.println("constructor with long id:" + id);
	}
}

class Constructoverloading{
	public static void main(String[]args) {
		Constructor c1= new Constructor("pritesh patel");
		Constructor c2= new Constructor("pritesh", 18);
		Constructor c3= new Constructor(110089516);
		
	}
	
}
