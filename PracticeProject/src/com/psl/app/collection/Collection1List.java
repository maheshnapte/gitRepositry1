package com.app;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

// Program demonstrate ArrayList and its properties.
class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		System.out.println(l.size());
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);

		l.remove(2);
		System.out.println(l);
		l.add(2, "M");
		l.add("N");
		System.out.println(l);

	}
}

// Program demonstrate LinkedList and its properties.
class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");

		l.set(0, "Software");
		l.add(0, "venky");

		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);

	}
}

// Program demonstrate LinkedList and its properties.
class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println(v.capacity());// note: default capacity is 10.

		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);

	}
}

// Program demonstrate Stack and its properties.
class StackDemo {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);// Note: [A,B,C] will be printed not [C,B,A] as it
								// is a List's subclass insertion order is
								// maintained like list.

		System.out.println(s.peek());
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
	}
}

class IteratorAndForEachLoopDemo {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator itr = al.iterator();

		// Traversing using iterator loop.

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------------------");
		// Traversing using For-each loop.
		for (String obj : al)
			System.out.println(obj);

		System.out.println(" --- Enumeration --");

	}
}

class EnumerationDemo {
	public static void main(String args[]) {

		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}

		Enumeration<Integer> en = v.elements();

		while (en.hasMoreElements()) {
			Integer i = en.nextElement();
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("=---------------------=");
		Iterator<Integer> itr = v.iterator();

		// Traversing using iterator loop.

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---------- for each loop -------------------");
		// Traversing using For-each loop.
		for (Integer obj : v) {
			System.out.println(obj);
		}
	}
}

// ListIteratorDemo
class ListIteratorDemoDemo {
	public static void main(String args[]) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("balakrishna");
		l.add("venky");
		l.add("chiru");
		l.add("nag");

		System.out.println(l);

		ListIterator<String> itr = l.listIterator();

		// Traversing using iterator loop.

		while (itr.hasNext()) {
			String s = itr.next();

			if (s.equals("venky")) {
				itr.remove();
			} else if (s.equals("nag")) {
				itr.add("chaitu");
			} else if (s.equals("chiru")) {
				itr.set("charan");
			}
		}
		System.out.println(l);

	}
}

public class Collection1List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
