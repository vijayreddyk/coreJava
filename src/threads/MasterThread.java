package threads;
class ChildThread implements Runnable{
	Thread t;
	public ChildThread() {
		t = new Thread(this,"Child THread");
		t.start();
	}
	@Override
	public void run() {
		for(int i = 10;i >=1;i--) {			
			System.out.println("In child Thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MasterThread {

	public static void main(String[] args) {
		new ChildThread();
		try {
			for(int i = 10;i >=1;i--) {
				System.out.println("In Master Thread "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
