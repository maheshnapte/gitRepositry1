package com.app.string;

class A implements Cloneable {

	int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	protected A clone() throws CloneNotSupportedException {
		return (A) super.clone();
	}

	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}

}

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hs1 = new String("Mahesh");
		String hs2 = new String("Mahesh");

		String s1 = "Mahesh";
		String s2 = "Mahesh";

		System.out.println(hs1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		if (hs1 == hs2) {
			System.out.println("equal hashcode");
		} else {
			System.out.println("not equal hashcode");
		}

		if (hs1 == s1) {
			System.out.println("equal hashcode");
		} else {
			System.out.println("not equal hashcode");
		}

		if (s1 == s2) {
			System.out.println("equal hashcode");
		} else {
			System.out.println("not equal hashcode");
		}

		// System.out.println(s2.hashCode());

		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");

		if (sb1.equals(sb2)) {
			System.out.println("equal ....");
		} else {
			System.out.println("not equal ....");
		}

		A a = new A();
		a.setI(5);

		try {
			A b = a.clone();

			System.out.println(b);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Integer i = 10;
		Integer j = 10;
		int a1 = 10;
		int b1 = 10;

		// if(a1.equals(b1))
		// {
		if (i.equals(j)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");

		}

		checkifStringIsImmutableInJava();
	}

	static void checkifStringIsImmutableInJava() {
		String s1 = new String("Haha");

		System.out.println(s1.concat("s2"));

		System.out.println(s1);
	}
}
