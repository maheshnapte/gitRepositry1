package multithreading;

//Checks for daemon thread whether it finishes after execution of non daemon thread.
public class TestDaemonThread1 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread

			for (int i = 0; i < 1000; i++) {
				System.out.println("d: " + i);
			}
		} else {
			for (int i = 0; i < 10; i++) {
				System.out.println("nd: " + i);

			}
		}
	}

	public static void main(String[] args) {
		TestDaemonThread1 t1 = new TestDaemonThread1();// creating thread
		TestDaemonThread1 t2 = new TestDaemonThread1();
		TestDaemonThread1 t3 = new TestDaemonThread1();

		t1.setDaemon(true);// now t1 is daemon thread

		t1.start();// starting threads
		t2.start();
//		t3.start();
	}
}
