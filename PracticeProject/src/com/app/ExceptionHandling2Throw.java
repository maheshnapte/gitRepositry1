package com.app;

//In this example, we have created the validate method that takes integer value as a parameter. If the age is less than 18, we are throwing the ArithmeticException/LessThan18Exception otherwise print a message welcome to vote.

class LessThan18Exception extends Exception {
	String erorMessage;

	public LessThan18Exception(String str) {
		// TODO Auto-generated constructor stub
		erorMessage = str;
	}

	@Override
	public String toString() {
		return erorMessage;
	}

}

class TestThrow1 {
	static void validate(int age) throws LessThan18Exception {
		if (age < 18)
			throw new LessThan18Exception("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (LessThan18Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
	}
}

public class ExceptionHandling2Throw {

	public static void main(String[] args) {

	}
}
