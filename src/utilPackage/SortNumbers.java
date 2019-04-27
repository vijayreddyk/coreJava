package utilPackage;

import java.util.TreeSet;

public class SortNumbers {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>(new MyComparator());
		list.add(8);
		list.add(1);
		list.add(9);
		list.add(6);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(7);
		System.out.println(list);
	}

}
