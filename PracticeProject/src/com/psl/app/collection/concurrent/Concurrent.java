package com.psl.app.collection.concurrent;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentHashMapDemo {
	public static void main(String[] args) {

	}
}

public class Concurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer>[] array = new ArrayList<Integer>()[10];
		HashMap hm = new HashMap();
		hm.put(1, "Mahesh");
		hm.put(2, "Kasturi");
		Set s = hm.entrySet();

		Iterator hItr = s.iterator();
		while (hItr.hasNext()) {
			Map.Entry e = (Entry) hItr.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		// CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		Vector al = new Vector();

		// Set s = new HashSet();

		// s.iterator();

		// LinkedList ll = new LinkedList();

		// al.listIterator();

		// ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(7);
		al.add(null);
		al.add(null);
		al.add(null);

		// Iterator itr = al.iterator(); // iterator();
		// ListIterator<Integer> itr = al.listIterator();

		Enumeration itr = al.elements();
		int i = 0;
		while (itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
			// itr.remove();
			// al.add(3);
			// al.remove(3);
			i++;

			if (i == 1) {
				al.add(800);

			} // al.set(5, 5*(i++));
				// itr.add(22);
				// itr.remove();
				// itr.add(5);
				// itr.set(55);
		}

		System.out.println("ArrayList :" + al + " size: " + al.size());
	}

}
