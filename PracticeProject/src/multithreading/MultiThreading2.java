package multithreading;

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