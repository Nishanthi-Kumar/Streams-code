package coll3_streams;

public class Sample1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Hii");

	}

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		Thread t = new Thread(s);
		t.start();
	}

}
