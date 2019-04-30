package files;

//A1n example of deadlock.
class A1 {
	synchronized void foo(B1 b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A1.foo");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println("A1 Interrupted");
		}
		System.out.println(name + " trying to call B1.last()");
		b.last();
	}
	synchronized void last() {
		System.out.println("Inside A1.last");
	}
}
class B1 {
	synchronized void bar(A1 a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B1.bar");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println("B1 Interrupted");
		}
		System.out.println(name + " trying to call A1.last()");
		a.last();
	}
	synchronized void last() {
		System.out.println("Inside A1.last");
	}
}
class Deadlock implements Runnable {
	A1 a = new A1();
	B1 b = new B1();
	Deadlock() {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		a.foo(b); // get lock on a in this thread.
		System.out.println("B1ack in main thread");
	}
	public void run() {
		b.bar(a); // get lock on b in other thread.
		System.out.println("B1ack in other thread");
	}
	public static void main(String args[]) {
		new Deadlock();
	}
}