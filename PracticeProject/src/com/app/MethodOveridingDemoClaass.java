package com.app;

class Parent {
	int qq = 13;

	int sum(int a, int b, int c) {
		return a + b + c;
	}

}

class Child extends Parent {

	public int pp = 12;

	int sum(int a, int b, int c) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	String check() {
		System.out.println("In private check Method ...");
		return "hi";
	}
}

public class MethodOveridingDemoClaass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Child();

		int addition = p.sum(1, 2, 3);
		System.out.println("addition : " + addition);

		// int addition = p.sum(1, 2);
		// System.out.println("addition : " + addition);

		Child c = new Child();
		int subtraction = c.sub(4, 2);
		System.out.println("subtraction : " + addition);
//		System.out.println(p.check());
	}

}
