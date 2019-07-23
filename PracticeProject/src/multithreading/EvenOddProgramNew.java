package multithreading;

class Count {
	static int CNT = 1;
	static Count count = null;

	public static Count getInstance() {
		if (count == null) {
			synchronized (Count.class) {
				return new Count();
			}
		} else {
			return count;
		}
	}

}

class OddTh implements Runnable {

	@Override
	public void run() {
		synchronized (Count.class) {
			while (Count.CNT <= 100) {
				if (!(Count.CNT % 2 == 0)) {
					System.out.println(this.getClass() + " :" + Count.CNT);
					Count.getInstance().notify();
				} else {
					try {
						Count.getInstance().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Count.CNT++;
			}
		}
	}
}

class EvenTh implements Runnable {

	@Override
	public void run() {
		synchronized (Count.class) {
			while (Count.CNT <= 100) {
				if ((Count.CNT % 2 == 0)) {
					System.out.println(this.getClass() + " :" + Count.CNT);
					Count.getInstance().notify();
				} else {
					try {
						Count.getInstance().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Count.CNT++;
			}
		}
	}
}

public class EvenOddProgramNew {

	public static void main(String[] args) {

		OddTh o = new OddTh();
		EvenTh e = new EvenTh();
		Thread odd = new Thread(o);
		Thread even = new Thread(e);

		odd.start();
		even.start();
	}

}
