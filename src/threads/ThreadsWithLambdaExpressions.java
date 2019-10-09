package threads;

public class ThreadsWithLambdaExpressions {
	public static void main(String[] args) {
		int outerVar = 1;
		Runnable r1 = ()->{
			for(int i=0;i<100;i++) {
				System.out.println(i);
			}
		};
		Runnable r2 = ()->{
			for(int i=0;i<100;i++) {
				System.out.println((char)i);
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		new Thread(r2).start();
	}
}
