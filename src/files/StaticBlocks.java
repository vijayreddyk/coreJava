package files;
class EmptyBlackClass{
	public EmptyBlackClass() {
		
		System.out.println("In constructor A");
	}
	{
		System.out.println("Block A");
	}
	{
		System.out.println("Block B");
	}
	static{
		System.out.println("In static Block A");
	}
}

class EmptyBlackClass1 extends EmptyBlackClass{
	public EmptyBlackClass1() {
		System.out.println("In constructor C");
	}
	{
		System.out.println("Block C");
	}
	{
		System.out.println("Block D");
	}
	
}

public class StaticBlocks{
	static int a = 2;
	static {
		System.out.println(++a);
		System.out.println(a);
		System.out.println("%%%%%%%%%%%%%%%%");
	}
	public static void main(String[] args) {
		EmptyBlackClass1 b = new EmptyBlackClass1();
		System.out.println("bbbbbbbbbbbbbbbbb");
	}

}
