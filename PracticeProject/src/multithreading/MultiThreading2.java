package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class A extends Thread {

	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("A {" + i + "}");
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("B {" + i + "}");
		}
	}

}

class AR implements Runnable {

	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("A {" + i + "}");
		}
	}
}

class BR implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("B {" + i + "}");
		}
	}

}

public class MultiThreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();

		a.start();
		b.start();
	}

}

class MultiThreading3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AR ar = new AR();
		BR br = new BR();

		Thread a = new Thread(ar);
		Thread b = new Thread(br);

		a.start();
		b.start();
	}
}

class MultiThreading4 {
	public static void main(String[] args) {
		// anonymous class
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("A {" + i + "}");
				}
			}
		};

		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 40; i++) {
					System.out.println("B {" + i + "}");
				}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}

class MultiThreading5 {
	public static void main(String[] args) {
		// t.join() joins the t thread to current thread. If t thread completes then
		// only other thread(here main) thread starts
		// lambda expression class
		Runnable r1 = () -> {
			for (int i = 0; i < 20; i++) {
				System.out.println("A {" + i + "}");
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 40; i++) {
				System.out.println("B {" + i + "}");
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		System.out.println("t1.isAlive():" + t1.isAlive());
		System.out.println("t2.isAlive(): " + t2.isAlive());

		System.out.println("Bye");
	}
}

class Shared {

	int count = 0;

	// only one thread can execute the method at a time.
	synchronized void increment() {
		count++;
	}

	@Override
	public String toString() {
		return "Shared [count=" + count + "]";
	}

}

class MultiThreading6 {
	public static void main(String[] args) throws InterruptedException {
		Shared s = new Shared();
		Runnable r1 = () -> {
			for (int i = 0; i < 10000; i++) {
				s.increment();
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 10000; i++) {
				s.increment();
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Bye");

		System.out.println(s);
	}
}

class MultiThreading7 {
	public static void main(String[] args) throws InterruptedException {
		// How join works
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t1: " + i);
			}
		};

		Thread t1 = new Thread(r1);

		t1.start();

		t1.join(5000);

		for (int i = 0; i < 10; i++) {
			System.out.println("main: " + i);
		}

		System.out.println("Bye");

	}
}

class MultiThreading8 {
	public static void main(String[] args) throws InterruptedException {
		// how yield works
		// some platform dosen't provide proper support for yield method. Here in my PC
		// it dosen't support i guess.

		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("t1: " + i);
				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		t1.join(5000);

		for (int i = 0; i < 10; i++) {
			System.out.println("main: " + i);
		}

		System.out.println("Bye");
	}
}

class MyTh extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("t1: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MultiThreading9 {
	public static void main(String[] args) throws InterruptedException {
		// interrupt and sleep demo

		MyTh t1 = new MyTh();
		t1.start();
		t1.interrupt();

		for (int i = 0; i < 10; i++) {
			System.out.println("main: " + i);
		}

		System.out.println("Bye");
	}
}

class Sync {
	Random r = new Random();
	int rn = r.nextInt(100);
	static List<String> sList = new ArrayList<String>();

	static {
		sList.add("a1");
		sList.add("a2");
		sList.add("a3");
		sList.add("a4");
		sList.add("a5");
		sList.add("a6");
	}

	void read() {
		for (String st : sList) {
			System.out.println("st: " + st);
		}
	}

	synchronized void modify() {
		sList.add(Integer.toString(rn));
	}
}

class MultiThreading10 {
	public static void main(String[] args) throws InterruptedException {
		// interrupt and sleep demo
		Sync s = new Sync();
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				s.modify();
				System.out.println("Added by thread.");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		for (int i = 0; i < 20; i++) {
			s.modify();
			System.out.println("Added by main.");
			/*
			 * try { Thread.sleep(500); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}

		s.read();
		System.out.println("size :" + s.sList.size());
		System.out.println("Bye");
	}
}

class AddThread extends Thread {
	int sum = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			this.notify();// recommended
		}
	}
}

class MultiThreading11 {
	public static void main(String[] args) throws InterruptedException {
		// interrupt and sleep demo
		AddThread t1 = new AddThread();
		t1.start();
		// Thread.sleep(1000); not recommended
		// t1.join(); not recommended
		synchronized (t1) {
			t1.wait();// recommended
		}
		System.out.println(t1.sum);

	}
}
