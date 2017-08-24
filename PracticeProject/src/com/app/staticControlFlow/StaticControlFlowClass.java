package com.app.staticControlFlow;

public class StaticControlFlowClass {

	static int i = 10;

	static {
		m1();
		System.out.println("First static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("Main Method");
	}

	static void m1() {
		System.out.println("j: " + j);
	}

	static {
		System.out.println("Second static block");
	}
	static int j = 20;
}
