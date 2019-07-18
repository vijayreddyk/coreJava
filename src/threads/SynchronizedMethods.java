package threads;
class ThreadClass extends Thread{
	int time;
	public ThreadClass(int time) {
		this.time = time;
	}
	@Override
	public void run() {
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread()+"  "+i);	
				try {
					wait(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
public class SynchronizedMethods {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		ThreadClass thread1 = new ThreadClass(500);
		ThreadClass thread2 = new ThreadClass(200);
		thread1.start();
		thread2.start();
	}

}
