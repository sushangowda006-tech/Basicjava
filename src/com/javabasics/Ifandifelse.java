package com.javabasics;

public class Ifandifelse {
	public static void main(String[] args) {
		
		int money=120;
		if(money>=100)
			{
			System.out.println("Watch movie have fun");
			}
		
		int drivingage=28;
		if(drivingage>=22 && drivingage<=32) {
			System.out.println("Eligible for Marriage");
			
		}else {
			System.out.println("Not eligible for Marriage");
		}
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
