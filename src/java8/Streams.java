package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			nums.add(i);
		}
		Stream<Integer> parallelStream = nums.parallelStream().filter(i->i>90);
		parallelStream.forEach(i->{
			System.out.println(i);
		});
	}

}
