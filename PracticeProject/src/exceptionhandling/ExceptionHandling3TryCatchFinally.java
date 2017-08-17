package exceptionhandling;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.sql.SQLException;

//Note: If a method returns something then, return should be the last statement of each possible branch of a code execution.And if, some branch does not return anything hen cod will give cmpile error. 

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
			// return 1000;
		} finally {
			System.out.println("I am in finally.");
			return 10;

		}

	}

	static int add1(int a, int b) throws Exception {
		int c = 0;
		try {

			c = a + b;
			if (c < 10) {
				return 9;
			} else {
				System.out.println("Before throwing Exception ...");
				throw new Exception();
			}

		} catch (ArithmeticException | SQLException e) {
			System.out.println("Exception : " + e);
			return 1000;
		} finally {
			System.out.println("I am in finally.");
			// return 10;
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//
		// int t = add(1, 1);
		// System.out.println("t : " + t);

		// try {
		// div(3, 0);
		//
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// System.out.println(ManagementFactory.getRuntimeMXBean().getVmVersion()
		//
		// );

		System.out.println(System.getProperty("java.version"));
		// div(3, 0);
	}

}
