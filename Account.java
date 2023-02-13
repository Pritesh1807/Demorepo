package com.sun;

public class Account{
	private int acc_number;
	private String name,email;
	private float salary;
	public int getAcc_number(){
		return acc_number;
	}
	public void setacc_number(int acc_number){
		this.acc_number=acc_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
}
