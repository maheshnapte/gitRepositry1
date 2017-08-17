package com.app.accessModifier;

class Employee {

	private int privId = 1;
	int defId = 2;
	protected int proId = 3;
	public int pubId = 4;

}

public class SameClass {
	private int privId = 1;
	int defId = 2;
	protected int proId = 3;
	public int pubId = 4;

	void accessPrivate() {

		System.out.println(privId);// accessible
	}

	//local access modifier
	void checkMedhodLeveAccessModifier() {
		int a;

		// private int b; // Not allowed
		// protected int c; // Not allowed
		// public int d; // Not allowed
		// static int e; // Not allowed

		final int f; // Allowed allowed

		// Note: You can define only default and final variables in a method;
		// also called local variables
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();

		// System.out.println(e.privId);// not accessible
		System.out.println(e.defId);
		System.out.println(e.proId);
		System.out.println(e.pubId);

	}

}
