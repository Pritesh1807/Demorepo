package com.sun;

//parent class
class Bank {
	int rateofinterest() {
		return 0;
	}
}


//child class
class SBI extends Bank{
	int rateofinterest() {
		return 7;
	}
}

//child class with method overriding
class ICICI extends Bank{
	int rateofinterest() {
		return 8;
	}
}

//child class with method overriding
class HDFC extends Bank{
	int rateofinterest() {
		return 9;
		}
}

