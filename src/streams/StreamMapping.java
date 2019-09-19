package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapping {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(99);
		li.add(80);
		li.add(100);
		String str="";
		System.out.println();
		li.add(101);
		li.add(101);
		li.add(79);
		li.parallelStream().map((a)->a*3).filter((a)->a%2==0).forEach(
				(n)->System.out.println(n)
		);
		
	}

}
