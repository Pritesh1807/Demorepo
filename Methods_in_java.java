package com.sun;

public class Methods_in_java {
	/*
	 * //static void multiply(int n) { //for(int i=1;i<=10;i++) {
	 * //System.out.println(n*i); //} //}
	 * 
	 * //pattern
	 */
	static void pattern(int n) {
		for (int i = 0; i < n + 1; ++i) {
			for (int j = 0; j < i + 1; j++)
				;
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// multiply(19);
		pattern(4);
	}
}
