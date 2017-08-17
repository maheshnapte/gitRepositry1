package com.app;

class Animal11 {

	static int t = 12;

	void eat() {
		System.out.println("eating...");
	}

	static void p() {
		System.out.println("In Anmals p()");
	}
}

class Dog extends Animal11 {

//	@Override
	void eat() {
		System.out.println("Dog eating...");
	}

	void bark() {
		
		eat();
		Dog.p();
//		t = 23;
		System.out.println("t : " + t);
		System.out.println("barking...");
	}
	
	
//	public static void p() {
//		System.out.println("In Dog's p()");
//	}
	
}

public class InheritancDemoClass {

	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		Dog.p();
		System.out.println(Dog.t);
	}
}
