package com.app.inheritance;

public class Main2Class extends Main1Class{

	void callMain() {
//		Main2Class.
		
		System.out.println(i);
		System.out.println(si);
	}

	
	public static void main(String[] args) {
		
//		Main1Class.m1Static();
		
		
		m1Static();
		Main2Class m2 = new Main2Class();
		m2.callMain();
		
		// TODO Auto-generated method stub
//		System.out.println("I am in Main1 class' main method.");
	}
}

