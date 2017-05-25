package com.app;

//Note: If a method returns something then, return should be the last statement of each possible branch of a code execution.And if, some branch does not return anything hen cod will give cmpile error. 

public class ExceptionHandling3TryCatchFinally {

	static int returnCheck(int a, int b) {
		int c = 0;
		if (a < 10) {
			return a;
		} else if (a < 20) {

			return c;
		}

	}

	static int add(int a, int b) {
		int c = 0;
		try {

			c = a + b;
			if (c < 10) {
				return 0;
			}

		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} finally {
			System.out.println("I am in finally.");
		}

		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = add(1, 6);
		System.out.println("t : " + t);

	}

}
