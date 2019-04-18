package threads;

public class printNumbers {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		t.setName("First Thread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
