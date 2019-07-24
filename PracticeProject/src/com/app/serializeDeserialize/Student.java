package com.app.serializeDeserialize;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Student extends ParentSer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6641008165882552818L;

	{
		System.out.println("Instance block");
	}

	int pp = 100;
	int id;
	String name;
	transient int age = 100;

	public Student(int id, String name, int age, int i/* , int pp */) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.i = i;
		/*
		 * this.pp= pp;
		 */ }

	Object writeReplace() throws ObjectStreamException {
		System.out.println("Object writeReplace() throws ObjectStreamException");
		return this;
	}

	Object readResolve() throws ObjectStreamException
	{
		System.out.println("readResolve");
		return this;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", i=" + i + ", pp= ]";
	}

}