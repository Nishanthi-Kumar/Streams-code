package coll3_streams;

public class Sample extends Thread {
	public void run() {
		System.out.println("Hii");
		
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.start();
	}

}
