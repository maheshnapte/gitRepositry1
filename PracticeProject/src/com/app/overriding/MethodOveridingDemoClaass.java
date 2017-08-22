package com.app.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Parent {
	int qq = 13;

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	// Co-varient return type is allowed in method overriding.s
	Parent covariantCheck() {
		return new Parent();
	}

	Number covariantCheck1() {
		return 10;
	}

	// check final overriding; It is no allowed. Gets compile time error.
	// void final finalOverriding()
	// {
	//
	// }
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

	Child covariantCheck() {
		return new Child();
	}

	// int covariantCheck1() {
	// return 10;
	// }

	Integer covariantCheck1() {
		return 10;
	}

	// check final overriding
	void finalOverriding() {

	}
}

//
class P {
	void m() {
		System.out.println("In P: m()");
	}

	static void m1() {
		System.out.println("P: m()");
	}
}

abstract class C extends P {

	abstract void m();

}

class StaticDemoP {
	static void m1() throws IOException {
		System.out.println("P: m()");
	}
	
	public void p()
	{
		System.out.println("P");
	}
}

// Method hiding demo
class StaticDemoC extends StaticDemoP {
	static void m1() throws FileNotFoundException, RuntimeException {
		System.out.println("C: m()");

	}
}

public class MethodOveridingDemoClaass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Parent p = new Child();
		 * 
		 * int addition = p.sum(1, 2, 3); System.out.println("addition : " +
		 * addition);
		 * 
		 * // int addition = p.sum(1, 2); // System.out.println("addition : " +
		 * addition);
		 * 
		 * Child c = new Child(); int subtraction = c.sub(4, 2);
		 * System.out.println("subtraction : " + addition); //
		 * System.out.println(p.check());
		 */

		StaticDemoP p = new StaticDemoC();

		try {
			p.m1();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StaticDemoC c = new StaticDemoC();
		c.p();

	}

}
