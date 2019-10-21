package threads;
class A{
	public synchronized void  first(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name+" entered A ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" trying to call last() method in B class");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside last method of A class");
	}
}
class B{
	public synchronized void  first(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name+" entered B ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" trying to call last() method in A class");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside last method of B class");
	}
}
class Deadlock implements Runnable {
	A a = new A();
	B b = new B();
	public Deadlock() {
		Thread.currentThread().setName("Thread Y");
		Thread t = new Thread(this,"Thread Z");
		t.start();
		a.first(b);
	}
	@Override
	public void run() {
		b.first(a);
	}
}
public class DeadlockTest {
	
	public static void main(String[] args) {
		Deadlock d = new Deadlock();
		
	}

}
