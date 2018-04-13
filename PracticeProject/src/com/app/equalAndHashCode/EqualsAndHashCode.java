package com.app.equalAndHashCode;

import java.util.HashSet;

class Stud {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Stud(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
		// return 0;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals()");
		Stud other = (Stud) obj;
		return this == other;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + "]";
	}

}

public class EqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Stud> hs = new HashSet<Stud>();

		Stud s1 = new Stud(1);
		Stud s2 = new Stud(2);

		Stud s3 = new Stud(1);
		// Stud s4 = new Stud(4);
		// Stud s5 = new Stud(4);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		System.out.println("----------------------");
		System.out.println("s1: " + s1.hashCode() + " s2: " + s2.hashCode() + " s3: " + s3.hashCode());

		// hs.add(s1);
		// hs.add(s3);
		// hs.add(s4);
		// hs.add(s5);
		//
		// System.out.println("Size : "+hs.size());
		//
		// for (Stud s : hs) {
		// System.out.println(s);
		// }

//		 if(s1.equals(s1))
//		 {
//		 System.out.println("same");
//		 }else
//		 {
//		 System.out.println("not same");
//		 }
//		 
		 
	
	}

}
