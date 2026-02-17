package com.staticmethods;

public class Add {
 public static void main(String[] args) {
		Add.addition(1,2,3);
	

	}

	private static void addition(int i, int j, int k) {
		int sum = i+j+k;
		System.out.println("Addition:"+sum);
		
	}

}
