package InnerClasses;

public class MethodLocalInnerClassDemo {
	public void methodA() {
		@SuppressWarnings("unused")
		class MethodLocalInnerClass {
			public MethodLocalInnerClass(String a,String b) {
				System.out.println(a+" "+b);
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
