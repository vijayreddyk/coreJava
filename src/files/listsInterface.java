package files;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class listsInterface {
	static final String FINAL_STRING = "final_string";
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list4 = new LinkedList<Integer>();
		addElementsToList(list);
		addElementsToList(list2);
		list.addAll(4,list2);
		System.out.println(list);
		System.out.println("value at Index 5 is "+list.get(5));
		System.out.println("Index of value 1 "+list.indexOf(1));
		System.out.println("Last Index of value 1 "+list.lastIndexOf(1));
		Iterator<Integer> iterator = list.listIterator(5);
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		list.remove(0);
		System.out.println(list);
		List<Integer> list3 = list.subList(3, 13);
		list3.set(0, 150);
		System.out.println(list3);
	}

	private static void addElementsToList(List<Integer> list) {
		for(int i = 1 ; i <= 10 ; i++) {
			list.add(i);
		}
	}

}
