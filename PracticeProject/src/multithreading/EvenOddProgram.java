package multithreading;

public class EvenOddProgram implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 1; i < 100; i++) {
				if ("odd".equals(Thread.currentThread().getName())) {
					if (!(i % 2 == 0)) {
						System.out.println(Thread.currentThread().getName() + " - " + i);
						this.notify();
					} else {
						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if ("even".equals(Thread.currentThread().getName())) {
					if ((i % 2 == 0)) {
						System.out.println(Thread.currentThread().getName() + " - " + i);
						this.notify();
					} else {
						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		EvenOddProgram o = new EvenOddProgram();
		Thread odd = new Thread(o);
		EvenOddProgram e = new EvenOddProgram();
		Thread even = new Thread(e);

		odd.setName("odd");
		even.setName("even");

		even.start();
		odd.start();
	}
}
