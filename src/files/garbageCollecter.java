package files;

public class garbageCollecter {

	public static void main(String[] args) throws InterruptedException {
		test a = new test(1,2);
		String str = "str";
		str = null;
		a = null;
		Thread.sleep(1000);
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called by garbage collecter before freeing the memory of str variable");
	}
}
