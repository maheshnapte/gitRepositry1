package com.app.serializeDeserialize;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long SerialVersionUID = 1111l;

	{
		System.out.println("Instance block");
	}
	
	//int pp =100;
	int id;
	String name;
	transient int age = 100;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}