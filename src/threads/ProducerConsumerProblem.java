package threads;
class SharedClass{
	int data;
	boolean flag;
	public synchronized int getData() {
		while(!flag) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
		flag = false;
		notify();
		System.out.println("Consumer Consuming Value "+this.data);
		return data;
	}
	public synchronized void setData(int data) {
		while(flag) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
		flag = true;
		this.data = data;
		System.out.println("Producer producing value "+this.data);
		notify();
	}
	
}
class Producer extends Thread{
	SharedClass s;
	public Producer(SharedClass s) {
		this.s = s;
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			s.setData(i);
		}
	}
}
class Consumer extends Thread{
	SharedClass s;
	public Consumer(SharedClass s) {
		this.s = s;
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			s.getData();
		}
	}
}
public class ProducerConsumerProblem {

	public static void main(String[] args) {
		SharedClass s1 = new SharedClass();
		Producer p = new Producer(s1);
		Consumer c = new Consumer(s1);
		c.start();
		p.start();
		
	}

}
