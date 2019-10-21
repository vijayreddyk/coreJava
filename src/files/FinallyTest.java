package files;
interface abstractExtendedToInt{
	public void methodA();
	default void methodc() {
		System.out.println("In default method");
	}
}
abstract class abstractClassExtendingInt implements abstractExtendedToInt{
	abstract void methodB();
}
public class FinallyTest extends abstractClassExtendingInt{
	{
		System.out.println("In free block 1");
	}
	{
		System.out.println("In free block 2");
	}
	static {
		System.out.println("In free static block 3");
	}
	public static void main(String[] args) {
		try {
			abstractClassExtendingInt aeti = new FinallyTest();
			aeti.methodA();
			aeti.methodB();
			aeti.methodc();
			int a = 2/0;
		} catch(ArithmeticException e) {
			System.out.println("In Arithmetic Exception");
		} catch(Exception e) {
			System.out.println("In Generic Exception");
		} 
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.gc();
	}
	@Override
	public void methodA() {
		System.out.println("In method A");
	}
	@Override
	void methodB() {
		System.out.println("In method B");
	}
}
