package com.app;

public class OverloadingCalculator {

	void sum(int d, int b) {
		System.out.println("a method invoked");
	}

	void sum(int d, long b) {
		System.out.println("b method invoked");
	}

	void sum(long a, int b) {
		System.out.println("c method invoked");
	}

	public static void main(String args[]) {
		OverloadingCalculator obj = new OverloadingCalculator();
		obj.sum(20, 20);// now ambiguity
	}

}
