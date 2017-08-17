package com.psl.app.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.NetworkInterface;
import java.util.*;

class MapHashMap {

	// Note: Access specifier of a method must be before the return
	// type(definition of a method)
	static void newStyle() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	// old style
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();

		ht.put(1, "Mahesh");
		ht.put(2, "Raj");
		Enumeration enu = ht.elements();

		while (enu.hasMoreElements()) {
			Object e = enu.nextElement();
			System.out.println(e);
		}

		System.out.println("-----------");

		// Demo HasMap
		Map map = new HashMap();

		// demo LinkedHasMap
		// Map map = new LinkedHashMap();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map

		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value
			// separately
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		newStyle();
	}
}

class IdentityHashMapDemo {

	public static void main(String[] args) {

		// JVM uses equals() method for comparison
		HashMap<Integer, String> m = new HashMap<Integer, String>();

		// JVM user == operator for comparison
		// IdentityHashMap<Integer, String> m = new IdentityHashMap<Integer,
		// String>();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		m.put(i1, "Mahesh");
		m.put(i2, "Mahesh");
		System.out.println(m);

	}
}

class Temp {
	public String toString() {
		return "Temp";
	}

	public void finalize() {
		System.out.println("Finalize method is called ...");
	}

}

class WeakHashMapDemo {

	public static void main(String[] args) {

		// gc does not clear object from HashMap
		HashMap<Temp, String> m = new HashMap<Temp, String>();

		// gc clears object from WeakHashMap
		// WeakHashMap<Temp, String> m = new WeakHashMap<Temp, String>();

		Temp t1 = new Temp();
		// Integer i2 = new Integer(1);

		m.put(t1, "Mahesh");
		System.out.println(m);
		t1 = null;
		System.gc();// calling it explicitly because gc is called after 5
					// seconds.
		System.out.println(m);
		System.out.println(t1);

	}
}

// TreeMap Demo
class TreeMapDemo {
	public static void main(String args[]) {
		// Create and populate tree map
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(102, "Let us C");
		map.put(103, "Operating System");
		map.put(101, "Data Communication and Networking");
		map.put(null, "xyz");// null not accepted as a key in TreeSet and
								// TreeMap.
		System.out.println("Values before remove: " + map);
		// Remove value for key 102
		map.remove(102);
		System.out.println("Values after remove: " + map);
	}
}

class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("credentials.properties");
		// any file extension
		// FileInputStream fis = new FileInputStream("credentials.xml");
		p.load(fis);
		System.out.println(p);

		String s = p.getProperty("venky");
		System.out.println(s);

		p.setProperty("nag", "888888888");

		FileOutputStream fos = new FileOutputStream("credentials.properties");
		// FileOutputStream fos = new FileOutputStream("credentials.xml");

		p.store(fos, "File updated with new credentials");

	}
}

public class Collection3Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
