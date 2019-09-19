package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsReduce {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(99);
		li.add(-80);
		li.add(100);
		li.add(-101);
		li.add(101);
		li.add(79);
		//int res=li.stream().reduce(0, (a,b)->a*b);
		int res = li.stream().reduce(0,(a,b)->{
			if(b>0) {
				return a+b;
			} else {
				return a;
			}
		});
		System.out.println(res);
	}

}
