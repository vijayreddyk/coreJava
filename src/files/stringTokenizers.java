package files;

import java.text.StringCharacterIterator;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class stringTokenizers {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a%#$^,fsdfasd,fdfasd,fasdf",",");
		StringJoiner sj = new StringJoiner(" : ","[","]");
		sj.add("java").add("string").add("joiners");
		StringJoiner sj1 = new StringJoiner(" % ","{","}");
		sj1.add("java").add("string").add("joiners");
		sj.merge(sj1);
		sj1.merge(sj);
		System.out.println(sj.toString());
		System.out.println(sj1.toString());
	}

}
