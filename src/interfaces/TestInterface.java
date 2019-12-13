package interfaces;

public interface TestInterface {
	public int a=10;
	default String abstractMethod(String str) {
		return str.toUpperCase();
	}
	static String staticMethod(String str) {
		return toLower(str);
	}
	static String toLower(String str) {
		return str.toLowerCase();
	}
}
