package com.app.inheritance;

interface I {

}

class A {
	{
		System.out.println("I am in instance initializer block A...");
	}

	A() {
		System.out.println("A");
	}

	public static void m() {

	}
}

class B extends A {

	{
		System.out.println("I am in instance initializer block B...");
	}

	B() {
		System.out.println("B");
	}

	public static void m() {

	}
}

class C extends B {
	C() {
		System.out.println("C");
	}
}

// cyclic inheritance is not allowed in java
/*
 * class X{
 * 
 * }
 * 
 * class X extends X{
 * 
 * }
 * 
 * class Q {
 * 
 * }
 * 
 * class P extends Q {
 * 
 * }
 * 
 * class Q extends P{
 * 
 * }
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		System.out.println("S");

		// I i = new I();
	}

}
