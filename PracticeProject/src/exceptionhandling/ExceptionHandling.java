package exceptionhandling;

import java.io.FileNotFoundException;

//Java checked exceptions are handled at compile time. You must handle java checked Exceptions.
//Java unchecked exceptions(Error)and untime Exceptions are not handled at compile time. You choose not to handle java checked Exception.

class Abc {

	void m1() throws FileNotFoundException {
		try {
			System.out.println("Checking whether Error can be catched or not ... ");
			throw new Error("Error Message ");
		} catch (Error r) {
			System.out.println("I am catching error ... : " + r.getMessage());
		}
		int p = 12 / 1;
		System.out.println("In Method m1() ...");
		// throw new ArithmeticException("Arith");
	}
}

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Abc abc = new Abc();
		try {
			abc.m1();
		} catch (Error e) {
//			System.out.println("I am handling error ...");
			System.out.println(e);
		}
		// try {
		// abc.m1();
		// } catch (Exception e) {
		// // TODO: handle exception
		// System.out.println(e);
		// }

	}

}
