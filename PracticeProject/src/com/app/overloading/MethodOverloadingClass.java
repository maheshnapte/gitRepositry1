package com.app.overloading;

import java.util.Date;

public class MethodOverloadingClass {
	int p = 10;

	int add(int a, int b) throws Error {
		System.out.println("a :" + a);
		return a + b;
	}

	double add1(int a, int b) {
		this.p = 12;
		System.out.println("a :" + a);
		System.out.println(" p : " + p);
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b;
	}

	static void staticMethod() {
		// this.p = 13;
		System.out.println("Welcom to static method ...");
		// p = 11;
		MethodOverloadingClass moc = new MethodOverloadingClass();

		System.out.println("p " + moc.p);

	}

	static void div(float a, int b) {
		System.out.println("---------------- in div() ----------------");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		float c = a / b;
		System.out.println("div : " + c);
	}

	static void div(int a, float b) {
		System.out.println("---------------- in div() ----------------");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		float c = a / b;
		System.out.println("div : " + c);
	}

	// static void m1(int a) {
	// System.out.println("int");
	// }

//	static void m1(double a) {
//		System.out.println("double");
//	}

//	static void m1(float a) {
//		System.out.println("float");
//	}

	static void m1(long a) {
		System.out.println("long");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingClass moc = new MethodOverloadingClass();

		/*
		 * System.out.println(" " + moc.add1('a', 3)); // System.out.println(" "
		 * + moc.add(1, 3));
		 * 
		 * // Date d = new Date(1, 2, 7); staticMethod();
		 */

		// Note: Here, we are allowed to declare mehod's as above div(float,int)
		// and div(int, float) but when we give call and it can be handled by two
		// methods then we will get error at compile time only for the calling
		// method.
		/*
		 * div(12.99f, 2); div(12, 2);
		 */
		// div('a', 2);

		// v. imp: upcasting happens in java if exact matching parameters does
		// not exist. I above case and following case, if you comment one of
		// (int, float) and
		// (float, int) you can see the demo.

//		m1('c');
		m1(100.4f);

		/*
		 * Integer i=0; String ii = String.valueOf(44);
		 * System.out.println(ii.concat("pp"));
		 */

	}

}
