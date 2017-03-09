package com.app;

class Animal1 {
	Animal1() {
		System.out.println("animal is created");
	}
}

class Dog1 extends Animal1 {
	Dog1() {
//		this(7);
		System.out.println("dog is created");
	}

	Dog1(int i) {
		
		this();
		
		System.out.println("dog is created : i = " + i);
	}
}

class TestSuper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dog1 d = new Dog1();
		Dog1 d = new Dog1(3);
	}
}
