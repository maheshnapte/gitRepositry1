package com.app.beansDemo;

strictfp abstract class P {

}

strictfp final class Q {

}

// this code is to demo clone() method of object class.
strictfp class Student18 implements Cloneable {
	int rollno;
	String name;

	Student18(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	strictfp void check() {
		System.out.println("Inside Check ...");
	}

	// public Object clone() throws CloneNotSupportedException {
	// return super.clone();
	// }

	strictfp public static void main(String args[]) {
		try {
			System.out.println("args[0]: " + args[0]);
			System.out.println("args[1]: " + args[1]);

			Student18 s1 = new Student18(101, "amit");

			Student18 s2 = (Student18) s1.clone();

			Student18 s3 = new Student18(101, "amit");

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

			if (s1.equals(s2)) {
				System.out.println("equals");
			} else {
				System.out.println("not equals");
			}

			if (s1.equals(s3)) {
				System.out.println("equals");
			} else {
				System.out.println("not equals");
			}

			if (s1 == s2) {
				System.out.println("equals");
			} else {
				System.out.println("not equals");
			}

			if (s1 == s3) {
				System.out.println("equals");
			} else {
				System.out.println("not equals");
			}

			System.out.println("s1 hashcode :" + s1.hashCode());
			System.out.println("s2 hashcode :" + s2.hashCode());
			System.out.println("s3 hashcode :" + s3.hashCode());

		} catch (CloneNotSupportedException c) {
		}

	}
}
