package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(99);
		li.add(80);
		li.add(100);
		li.add(101);
		li.add(101);
		li.add(79);
		li.forEach((val)->{
			System.out.println(val);
		});
		Stream<Integer> stream = li.stream();
		Optional<Integer> minVal = stream.min(Integer::compare);
		stream = li.stream();
		Optional<Integer> maxVal = stream.max(Integer::compare);
		System.out.println(minVal+" "+maxVal);
		Stream<Integer> sortedStream = li.stream().sorted();
		sortedStream.forEach((n)->System.out.println(n));
		Stream<Integer> oddStream = li.stream().sorted().filter((n)->(n%2 == 1));
		oddStream.forEach((n)->System.out.println(n));
		li.stream().parallel().forEach((n)->{
			System.out.println(n);
		});
		
	}

}
