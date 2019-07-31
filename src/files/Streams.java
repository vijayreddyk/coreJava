package files;

import java.util.Date;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		String str = "I want every word of this string to be printed in reverse order";
		Stream s = Stream.of(str.split(" "));
		StringBuilder rev = new StringBuilder();
		s.forEach(word->rev.append(new StringBuilder().append(word).reverse()).append(" "));
		System.out.println(rev.toString().trim());
	}
}
