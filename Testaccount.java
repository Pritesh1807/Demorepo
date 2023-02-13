package com.sun;
import com.mycode.patterns.*;

public class Testaccount{
	public static void main(String[]args) {
		Account a1=new Account();
		a1.setEmail("pritesh180799@gmail.com");
		a1.setName("Pritesh patel");
		a1.setacc_number(110089516);
		a1.setSalary(12500);
		System.out.println(a1.getAcc_number());
		System.out.println(a1.getEmail());
		System.out.println(a1.getName());
		System.out.println(a1.getSalary());
		
		// we can also write like this for print 
		System.out.println(a1.getAcc_number() +"\n"+a1.getEmail()+"\n" + a1.getName()+"\n" + a1.getSalary());
	}
}


