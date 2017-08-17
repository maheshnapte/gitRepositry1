package com.app;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Species {

	String name;

	public Species(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Species [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode called ..");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("Result : " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called ..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Species other = (Species) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

// Example: HashSet
class HashSetDemo {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));

		System.out.println(h);

		System.out.println("User defined objects in a HashSet ..");

		HashSet hs = new HashSet();

		Species s = new Species("Dog");
		Species s1 = new Species("Dog");

		// scene 1
		// System.out.println(hs.add(s));
		// System.out.println(hs);
		// s.setName("cat");
		//
		// System.out.println(hs.add(s));
		//
		// System.out.println(hs);

		// scene2

		hs.add(s);
		hs.add(s1);
		System.out.println(hs);

	}
}

// Example : LinkedHashSet
class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));

		System.out.println(h);
	}
}

// Example : TreeSet Demo1
class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add("a");
		t.add("F");
		t.add("D");
		t.add("Z");
		// t.add(null); // NullPointerException
		// t.add(10); // can not add need homogeneous datatype.
		System.out.println(t.add("Z"));

		System.out.println(t);
	}
}

// Example : TreeSet Demo 2
class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("C"));

		System.out.println(t);// ClassCastException because StringBuffer does
								// not implement StringBuffer.
	}
}

// Example : CompareTo Demo
class CompareTODemo {

	public static void main(String[] args) {
		// As all Wrapper classes already implements Comparable interface like
		// String.
		System.out.println("a".compareTo("z"));
		System.out.println("z".compareTo("a"));
		System.out.println("a".compareTo("a"));
		// System.out.println("a".compareTo(null));// NullPointerException

	}
}

// Example : Comparator Demo
class MyComparator implements Comparator {

	// sorting as per descending order.
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) arg0;
		Integer i2 = (Integer) arg1;

		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -1;
		} else {
			return 0;
		}

		// if you want default natural sorting order using compare method then
		// do following:
		// return i1.compareTo(i2);

		// if you want to preserve insertion order then do folllowing:
		// return 1;

		// only first element will be inserted and all other elements are
		// considered as duplicates.
		// return 0;
	}

}

// Example : Comparator Demo
class MyComparatorHeteregeneousObjects implements Comparator {

	// sorting as per descending order.
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String i1 = arg0.toString();
		String i2 = arg1.toString();

		if (i1.length() < i2.length()) {
			return -1;
		} else if (i1.length() > i2.length()) {
			return 1;
		} else {
			return i1.compareTo(i2);
		}

	}

}

// Example : Comparator Demo
class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(11);
		t.add(15);
		t.add(12);

		System.out.println(t);

		System.out.println("-------------------------");

		TreeSet ts = new TreeSet(new MyComparatorHeteregeneousObjects());
		ts.add("z");
		ts.add("a");
		ts.add(new StringBuffer("ac"));
		ts.add(new StringBuffer("kk"));

		System.out.println(ts);
	}
}

// This is user defined data for comparison
class Book implements Comparable<Book> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int compareTo(Book b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

// Customized sorting according to user here it is by quantity.
class MyBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		Integer i1 = o1.quantity;
		Integer i2 = o2.quantity;
		return i1.compareTo(i2);
	}

}

class TreeSetExample {
	public static void main(String[] args) {
		// Set<Book> set = new TreeSet<Book>();// Invokes default sorting using
		// Comparable Interface.
		Set<Book> set = new TreeSet<Book>(new MyBookComparator());// Invokes
																	// customized
																	// sorting
																	// as per
																	// user's
																	// requirement
																	// using
																	// Comparator
																	// Interface.

		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 14);
		// Adding Books to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing TreeSet
		for (Book b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}

public class Collection2Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
