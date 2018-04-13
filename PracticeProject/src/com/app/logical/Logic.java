package com.app.logical;

public class Logic {

	static int fibonacci(int n) {
		if (n == 1) {
			// System.out.print("1, ");
			return 1;
		} else if (n == 2) {
			// System.out.print("1, 1, ");
			return 1;
		} else if (n > 2){
			int x = fibonacci(n - 2) + fibonacci(n - 1);
			System.out.print(x + ", ");
			return x;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonacci(8);
	}

}
