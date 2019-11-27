package Exceptions;

public class CatchReturn {
	public static void main(String[] args) {
		String s = tryMethod("");
		System.out.println(s);
	}

	private static String tryMethod(String str) {
		String res = "";
		try {
			res = str.toUpperCase();
			return res;
		} catch (Exception e) {
			return "A";
		} finally {
			System.out.println("In finally statement");
		}
	}
}
