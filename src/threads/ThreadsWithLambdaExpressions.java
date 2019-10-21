package threads;

public class ThreadsWithLambdaExpressions {
	public static void main(String[] args) throws InterruptedException {
		int outerVar = 1;
		Runnable r1 = ()->{
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		};
		Runnable r2 = ()->{
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName()+" "+(char)i);
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		t2.join();
		t1.join();
		
	}
}
