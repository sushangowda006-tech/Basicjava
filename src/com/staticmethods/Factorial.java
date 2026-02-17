package com.staticmethods;

public class Factorial {

	public static void main(String[] args) {
		Factorial.fact(5);

	}

	private static void fact(int i) {
	    int num = 5;
		int prod=1;
		for(i=1;i<=num;i++) {
			prod=prod*i;
			System.out.println("Factorial="+prod);
		}
		
	}

}
