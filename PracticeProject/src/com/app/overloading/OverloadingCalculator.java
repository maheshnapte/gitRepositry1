package com.app.overloading;

public class OverloadingCalculator {

	void sum(int a, int b) {
		System.out.println("a method invoked");
	}

	void sum(int a, long b) {
		System.out.println("b method invoked");
	}

	void sum(long a, int b) {
		System.out.println("c method invoked");
	}

	int sub(int a, int b) {
		System.out.println("float sub");
		return a + b;
	}

	// It is not allowed to define method signature same with different return
	// type. Although, the method which is defined earlier gets
	// executed(Strange).
	float sub(int a, int b) {
		System.out.println("float sub");
		return (float) a + b;
	}

	int sub(int a, int b) {
		System.out.println("int sub");
		return a + b;
	}

	public static void main(String args[]) {
		OverloadingCalculator obj = new OverloadingCalculator();
		// obj.sum(20, 20);// now ambiguity

		System.out.println(obj.sub(20, 10));
	}

}
