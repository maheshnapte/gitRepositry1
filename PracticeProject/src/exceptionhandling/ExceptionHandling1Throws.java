package exceptionhandling;

//This code shows how throws works

import java.io.IOException;
import java.sql.SQLException;

//Normal program
class Testthrows1 {
	void m() throws IOException {
//		throw new ArithmeticException();
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
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
		Testthrows1 obj = new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}

// trick implementation for concept check.
//Rule: If you are calling a method that declares an exception, you must either caught or declare the exception.
//Note: For Checked exception, you either catch it locally or throw to caller method. And, if a code may generate checked exception you much handle it and if you don't compiler will give error.
class Testthrows2 {
	void m() throws IOException, SQLException{
		if (2 < 3) {
			throw new IOException();
		} else {
			throw new SQLException();
		}

		// System.out.println("Hi");
		// throw new IOException("device error");// checked exception
	}

	void n() throws IOException, SQLException {
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
		Testthrows1 obj = new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}

public class ExceptionHandling1Throws {

	public static void main(String[] args) {

	}

}
