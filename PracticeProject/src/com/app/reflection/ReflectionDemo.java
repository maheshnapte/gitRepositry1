package com.app.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

class A {
	void printName() {
		System.out.println("In A");
	}
}

class B {
	private void printName(int i, int j) {
		System.out.println("In B: i=" + i + " | j=" + j);
	}
}

class Calculate {
	int add(int a, int b) {
		return (a + b);
	}

	int mul(int a, int b) {
		return (b * a);
	}
}

public class ReflectionDemo {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		Scanner s = new Scanner(System.in);
		String className = s.nextLine();
		// String className = args[0]; // "A"

		String fullyQualifiedname = "com.app.reflection." + className;
		Class c = Class.forName(fullyQualifiedname);

		Object cl = c.newInstance();
		A a;
		B b;
		if (cl instanceof A) {
			a = (A) cl;
			Method m = c.getDeclaredMethod("printName", null);
			m.invoke(a, null);
		} else if (cl instanceof B) {
			b = (B) cl;
			Method m = c.getDeclaredMethod("printName", int.class, int.class);
			m.setAccessible(true);
			m.invoke(b, 10, 20);
		}

		System.out.println("--------");

		// Creating object of a class
		Calculate calculate = new Calculate();
		// instantiating Class class
		/*
		 * Class<? extends Calculate> classcls = calculate.getClass();
		 */ // or
		Class<? extends Calculate> classcls = Calculate.class;

		System.out.println(classcls);
		// Getting declared methods inside the Calculate class
		Method[] method = classcls.getDeclaredMethods(); // It returns array of methods
		// Iterating method array
		for (Method method2 : method) {
			System.out.print(method2.getName()); // getting name of method
			// Getting parameters of each method
			Parameter parameter[] = method2.getParameters(); // It returns array of parameters
			// Iterating parameter array
			for (Parameter parameter2 : parameter) {
				System.out.print(" " + parameter2.getParameterizedType()); // returns type of parameter
				System.out.print(" " + parameter2.getName()); // returns parameter name
			}
			System.out.println();
		}
	}
}
