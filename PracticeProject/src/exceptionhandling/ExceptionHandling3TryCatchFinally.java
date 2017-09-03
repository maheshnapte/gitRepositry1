package exceptionhandling;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.sql.SQLException;

//Note: If a method returns something then, return should be the last statement of each possible branch of a code execution.And if, some branch does not return anything then code will give compile error. 
public class ExceptionHandling3TryCatchFinally {

	static int returnCheck(int a, int b) {
		int c = 0;
		if (a < 10) {
			return a;
		} else if (a < 20) {

			return c;
		} else {
			return c;
		}
	}

	// If method catch's return is always overridden by finally's return.
	static int add(int a, int b) {
		int c = 0;
		try {

			c = a + b;
			if (c < 10) {
				return 9;
			} else {
				throw new Exception();
			}

		} catch (Exception e) {

			System.out.println("Exception : " + e);
			return 1000;
		} finally {
			System.out.println("I am in finally.");
			return 10;
		}

	}

	// When we throws an exception in a method as well as handles it locally (It
	// is allowed)
	// 1. if both exceptions are same local exception handling code is executed
	// 2. if thrown exception is parent exception or unrelated exception with
	// the handled exception then the exception is handled by caller.
	static int add1(int a, int b) throws Exception {
		int c = 0;
		try {

			c = a + b;
			if (c < 10) {
				return 9;
			} else {
				System.out.println("Before throwing Exception ...");
				throw new Exception();
				// throw new SQLException();
			}

		} catch (ArithmeticException e) {
			System.out.println("Exception : " + e);
			return 1000;
		} finally {
			System.out.println("I am in finally.");
			// return 10;
		}

	}

	static int add2(int a, int b) throws Exception {
		int c = 0;
		try {
			c = a + b;
			if (c < 10) {
				return 9;
			} else {
				System.out.println("Before throwing Exception ...");
				throw new ArithmeticException();
			}

		} catch (ArithmeticException e) {
			System.out.println("Exception handled locally Exception : " + e);
			return 1000;
		} finally {
			System.out.println("I am in finally.");
			// return 10;
		}
	}

	// if you are throws an exception which is not handled locally in a method
	// which has return type and if you are returning same return value that
	// method is throwing then the caller's exception is not catched even though
	// called is asked to catch the exception.
	static int add3() throws Exception {
		try {
			System.out.println("Before throwing Exception ...");
			throw new Exception();

		} finally {
			System.out.println("I am in finally.");
			return 10;
		}
	}

	private static void div(int a, int b) {
		int c = a / b;

		System.out.println("c: " + c);
	}

	private static void div1(int a, int b) {
		try {
			int c = a / b;
			if (c == 1)
				throw new IOException();
			else {
				System.out.println("Hi ...");
				throw new SQLException();

			}
		} catch (SQLException | IOException ex) {

			System.out.println(ex.getMessage());
		}
		// System.out.println("c: " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// int t = add(1, 1);
		// System.out.println("t : " + t);

		// int t = 0;
		// try {
		// t = add1(11, 1);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// System.out.println("Here Exception: " + e);
		// }
		// System.out.println("t : " + t);

		// int t = 0;
		// try {
		// t = add2(11, 1);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// System.out.println("Exception handled by caller: " + e);
		// }
		// System.out.println("t : " + t);

		int t = 0;

		try {
			t = add3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled by caller: " + e);
		}

		// try {
		// div(3, 0);
		//
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// System.out.println(ManagementFactory.getRuntimeMXBean().getVmVersion()
		//
		// );

		// System.out.println(System.getProperty("java.version"));
		// div(3, 0);
	}

}
