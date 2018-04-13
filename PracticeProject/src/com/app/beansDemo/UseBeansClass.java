package com.app.beansDemo;

public class UseBeansClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(args);
		
		Student s = new Student();
		System.out.println(s.getName());
		s.setName("Mahesh");

		System.out.println(s.getName());

	}

}
