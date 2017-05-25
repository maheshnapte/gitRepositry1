package com.app;

import java.io.*;
import java.sql.SQLException;

//Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
class Parent1 {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild extends Parent1 {
	void msg() throws IOException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent1 p = new TestExceptionChild();
		p.msg();
	}
}

public class ExceptionHandling4WithMethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
