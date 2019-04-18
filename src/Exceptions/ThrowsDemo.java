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
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
