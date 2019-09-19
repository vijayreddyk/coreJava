package files;
interface AbClassA{
	public  void methodA();
	public  void methodB();
}
class NoClassA{
	public void methodA() {
		System.out.println("heyyy");
	}
}
abstract class AbClassB extends NoClassA implements AbClassA {
	public abstract void methodC();
}
public class anstractclassexps extends AbClassB{

	public static void main(String[] args) {
		anstractclassexps ac = new anstractclassexps();
		ac.methodA();
		ac.methodB();
	}

	@Override
	public void methodB() {
		methodC();
	}

	@Override
	public void methodC() {
		System.out.println("yooooooo");
	}

}
