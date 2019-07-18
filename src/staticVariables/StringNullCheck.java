package staticVariables;

public class StringNullCheck {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = str1;
		str2 = "ef";
		String str = new String("abc");
		System.out.println(str2==str1);
	}

}
