package com.app;

import java.io.IOException;
import java.sql.SQLException;

//Note: It is allowed to declare an exception using throws ad handle it in locally both at a same time and locally handled exception will be excecuted
class Testthrows3 {
	void m() throws IOException {
		System.out.println("In m()");
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// throw new IOException();
			System.out.println("exception handled in m");
		}

		// System.out.println("Hi");
		// throw new IOException("device error");// checked exception
	}

	void p() {
		try {
			m();
			// System.out.println("Hi Mahesh...");
		} catch (IOException e) {
			System.out.println("exception handled in p");
		}
	}

	public static void main(String args[]) {
		Testthrows3 obj = new Testthrows3();
		obj.p();
		System.out.println("normal flow...");
	}
}

// Rethrowing a Exception
class Testthrows4 {
	void m() throws IOException {
		System.out.println("In m()");
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw e;
		}

	}

	void p() {
		try {
			m();
			// System.out.println("Hi Mahesh...");
		} catch (IOException e) {
			System.out.println("exception handled in p");
		}
	}

	public static void main(String args[]) {
		Testthrows4 obj = new Testthrows4();
		obj.p();
		System.out.println("normal flow...");
	}
}

// Nesting of Exceptions
class Testthrows5 {
	void m() throws IOException {
		System.out.println("In m()");
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw e;
		}finally
		{
			try {
				throw new SQLException();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				throw new ArithmeticException();
			}
		}

	}

	void p() {
		try {
			m();
			// System.out.println("Hi Mahesh...");
		} catch (IOException e) {
			System.out.println("exception handled in p");
		}
	}

	public static void main(String args[]) {
		Testthrows5 obj = new Testthrows5();
		obj.p();
		System.out.println("normal flow...");
	}
}

public class ExceptionHandling5ThrowandCatchBothImplemented {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
