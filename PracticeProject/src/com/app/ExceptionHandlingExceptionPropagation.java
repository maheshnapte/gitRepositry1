package com.app;

//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
class TestExceptionPropagation2 {
	void m() {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
	}
}

// Rule: By default Unchecked Exceptions are forwarded in calling chain
// (propagated).
class TestExceptionPropagation1 {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}
}

public class ExceptionHandlingExceptionPropagation {

}
