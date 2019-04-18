package files;
abstract class abstractClass {
	private int abstractClassVar1;
	private int abstractClassVar2;
	public abstractClass() {
		
	}
	public abstractClass(int a,int b) {
		this.abstractClassVar1 = a;
		this.abstractClassVar2 = b;
	}
	abstract void abstractMethod();
	public void generalMethod() {
		System.out.println("Inside general method of abstract class");
	}
}
class D extends abstractClass{

	public D(int a, int b) {
		super(a, b);
	}

	public D() {
		
	}

	@Override
	void abstractMethod() {
		System.out.println("Inside abstractMethod() of class D");
	}
	
}
public class abstractClassTest {

	public static void main(String[] args) {
		D d = new D();
		d.abstractMethod();
		d.generalMethod();
	}

}
