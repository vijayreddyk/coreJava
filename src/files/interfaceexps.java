package files;
class nestedClass{
	
}
public class interfaceexps {
	int a;
	static class nestedClass{
		public void printA() {
			nestedStaticClass ncs = new nestedStaticClass();
			ncs.printAA();
		}
		public void printB() {
			System.out.println("hello");
		}
	}
	static class nestedStaticClass{
		public void printAA() {
			nestedClass nc = new nestedClass();
			System.out.println("hhh");
			nc.printB();
		}
	}
	public void methodA() {
		int b;
		class MethodLocalInnerClass{
			
		}
	}
	public static void methodB() {
		
	}
	public static void main(String[] args) {
		interfaceexps.nestedClass nc = new  nestedClass();
		nc.printA();
		interfaceexps.nestedStaticClass nc1 = new nestedStaticClass();
		nc1.printAA();
	}
	
}
