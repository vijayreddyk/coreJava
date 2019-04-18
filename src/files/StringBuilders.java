package files;

import java.util.HashMap;
import java.util.stream.IntStream;

public class StringBuilders {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		try {
			//sb.setLength(20);
			sb.append("Exception in thread \"main\" java.lang.Error: Unresolved compilation problem: ");
			//sb.setLength(40);
			sb.append(254);
			sb.append(false);
			sb.setCharAt(0, 'z');
			System.out.println(sb.codePointBefore(6));
			StringBuilder temp = sb;
			sb.reverse();
			System.out.println(sb.toString());
			System.out.println(temp.toString());
		} catch(IndexOutOfBoundsException iobe){
			iobe.printStackTrace();
		} finally {
			System.out.println(sb.toString());
		}
	}

}
