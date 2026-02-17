package com.staticmethods;

public class Communication {

	public static void main(String[] args) {
	
		Communication.call("Rukmini Vasanth","Sushan_Gowdru");
		
		Communication.call("Nishvikha Naidu","Abhi");

	}

	private static void call(String heroine, String hero) {
		System.out.println("Heroine:"+heroine+"is continuosly talking in mobile with "+hero);
		
	}

}
