package com.app;

import java.util.Date;

public class MethodOverloadingClass {
	int p = 10;

	int add(int a, int b) throws Error {
		System.out.println("a :" + a);
		return a + b;
	}

	double add1(int a, int b) {
		this.p=12;
		System.out.println("a :" + a);
		System.out.println(" p : " + p);
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b;
	}

	static void staticMethod() {
//		this.p = 13;
		System.out.println("Welcom to static method ...");
		// p = 11;
		MethodOverloadingClass moc = new MethodOverloadingClass();

		System.out.println("p " + moc.p);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingClass moc = new MethodOverloadingClass();

		System.out.println(" " + moc.add1('a', 3));
		// System.out.println(" " + moc.add(1, 3));

		// Date d = new Date(1, 2, 7);
		staticMethod();
	}

}
