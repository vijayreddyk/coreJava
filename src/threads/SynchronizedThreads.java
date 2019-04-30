package threads;
class ThreadExample implements Runnable{
	Thread t;
	public ThreadExample() {
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		for(int i=5;i>0;i--) {
			try {
				synchronized (t) {
					System.out.println(t+" In Runnable thread "+i);
				}
				//t.setPriority(1);
				t.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class SynchronizedThreads {

	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		ThreadExample te1 = new ThreadExample();
		/*for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread()+" Main Thread "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}

}
