package InnerClasses;

public class NestedClassesDemo {
	static int staticVar;
	private int nonStaticVar;
	public NestedClassesDemo(int a) {
		nonStaticVar = a;
	}
	class NonStaticNestedClass{
		int nonStaticNestedClassVar;
		public NonStaticNestedClass() {
			nonStaticNestedClassVar = nonStaticVar;
		}
	}
	static class StaticNestedClass{
		int staticNestedClassVar;
		public StaticNestedClass() {
			
		}
	}
	public void classMethod() {
		class NonStaticNestedClass{
			
		}
	}
}
