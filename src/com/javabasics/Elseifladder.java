package com.javabasics;

public class Elseifladder {

	public static void main(String[] args) {
		int age=23;
		if(age>=22 && age<=32)
		  {
			System.out.println("Eligible for marriage");
			
		  }else if(age<22) {
			  System.out.println("Have Some Patience come when you are 22");
		    }else
		{
			System.out.println("You have lot of patience try  your best");
		}
		System.out.println("============================================================");
		int range=50;
		if(range>=22 && range<=32 )
		{
			System.out.println("In the range");
		}
		else if(range>=33 && range<=43) {
			System.out.println("Less than range");
		}
		else {
			System.out.println("Out of range");
		}
		
	}

}
