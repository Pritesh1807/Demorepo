package com.sun;

class Clone{
	int rollno;
	String name;
	
Clone(int rollno,String name){
	this.rollno=rollno;
	this.name=name;
}
	
public Object clone()throws CloneNotSupportedException{
	return super.clone();
}

public static void main(String[]args) {
	try {
		Clone c1=new Clone(110089516,"pritesh");
		Clone c2=(Clone)c1.clone();
		
		System.out.println(c1.rollno+" "+c1.name);
		System.out.println(c2.rollno+ " "+ c2.name);
}
	catch(CloneNotSupportedException c) {
		System.out.println("CloneNotSupportedException occured:" +c.getMessage());
	}
}
}
