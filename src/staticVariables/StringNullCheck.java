package staticVariables;

public class StringNullCheck {

	public static void main(String[] args) {
		String str1 = null;
		String str = new String(str1);
		System.out.println(str==null);
	}

}
