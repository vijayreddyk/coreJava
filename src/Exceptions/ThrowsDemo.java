package Exceptions;

public class ThrowsDemo {
	public static void someMethod(int i) throws ArithmeticException,StringIndexOutOfBoundsException{
		int a = 40/1;
		String str = "a";
		System.out.println(str.charAt(3));
	}
	public static void main(String[] args) {
		try {
			someMethod(12);
		} catch (ArithmeticException e) {
			System.out.println(e.getCause());
		} catch(StringIndexOutOfBoundsException siobe) {
			System.out.println(siobe.getCause());
		}
	}

}
