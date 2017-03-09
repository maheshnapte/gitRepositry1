package com.app;

class Animal {
	
	static int t = 12;
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {

	@Override
	void eat() {
		System.out.println("Dog eating...");
	}

	void bark() {
		t=23;
		System.out.println("t : "+t);
		System.out.println("barking...");
	}
}

public class InheritancDemoClass {

	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
