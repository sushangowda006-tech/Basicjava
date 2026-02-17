package com.classmethods;

public class AllGlobalMembers {

	static int value = 3;
	int num = 45;

	void run() {
		System.out.println("Non static run method");
	}

	static void execute() {
		System.out.println("Static execute method");

	}

	public static void main(String[] args) {
		int num = 3;
		System.out.println("Local variable:n=" +num);
		System.out.println("============================================");
		System.out.println("Global static value:" +value);
		AllGlobalMembers.execute();
		System.out.println("====================");
		
//		object creation
		AllGlobalMembers object =new AllGlobalMembers();
		object.run();
		System.out.println("No static num="+num);
		
	}

}
