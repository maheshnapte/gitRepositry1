package com.app;

abstract class Bikes {
	static int i = 12;
	final int f = 13;
	int x;

	Bikes() {
		System.out.println("Bikes Constructor .");
	}

	abstract void run();

}

class Honda extends Bikes {
	Honda() {
		System.out.println("Honda Constructor .");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub

	}
}

class Hero {

}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bikes bikes = new Bikes();
		// Honda honda = new Honda();
		Bikes bikes = new Honda();
	}

}
