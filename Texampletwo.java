class Morning implements Runnable {

	public synchronized void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 != 0) {
					System.out.println("Thread 1: " + "4 * " + i + "= " + 4 * i);
					System.out.println();
					Thread.sleep(2000);
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

class Evening implements Runnable {

	public synchronized void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					Thread.sleep(2000);
					System.out.println("Thread 2: " + "4 * " + i + "= " + 4 * i);
					System.out.println();
					

				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

public class Texampletwo {

	public static void main(String[] args) throws Exception {
		Morning a = new Morning();
		Thread t1 = new Thread(a);

		Evening b = new Evening();
		Thread t2 = new Thread(b);
		t1.start();

		t2.start();

	}

}
