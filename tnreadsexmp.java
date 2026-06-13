package practiceJava;
class MyThread extends Thread{
	
	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Transaction processed by: " + Thread.currentThread().getName());
    }

}
public class tnreadsexmp {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("sai");
		MyThread t2 = new MyThread("Teja");
		t1.start();
		t2.start();

	}

}
