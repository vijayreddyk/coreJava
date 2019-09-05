package lambdaExpressions;
interface functionalInterface{
	public String method1(String str);
	default String method2(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	static String method3(String str) {
		return new StringBuffer(str).reverse().toString();
	}
}
public class LambdaexpressionasMethodArgument {

	public static void main(String[] args) {
		functionalInterface fi = (str)->{
			return new StringBuilder(str).reverse().toString();
		};
		functionalInterface fi1 = (str)->{
			return str.trim();
		};
		String str = localMethod(fi, " history => ");
		System.out.println(fi.method2("got"));
		System.out.println(functionalInterface.method3("friends"));
		System.out.println(str);
	}
	static String localMethod(functionalInterface fi,String str) {
		return fi.method1(str);
	}
}
