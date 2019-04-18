package files;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		List<Integer> collec = new ArrayList<Integer>();
		List<Integer> collec2 = new ArrayList<Integer>();
		addElementstocollection(collec);
		addElementstocollection(collec2);
		collec.addAll(collec2);
		System.out.println(collec.contains(3));
		collec2.clear();
		collec2.add(9);
		collec2.add(0);
		collec2.add(11);
		collec2.clear();
		addElementstocollection(collec2);
		addElementstocollection(collec2);
		System.out.println(collec.equals(collec2));
		System.out.println(collec.containsAll(collec2));
		collec.clear();
		System.out.println(collec.isEmpty());
		System.out.println(collec.retainAll(collec2));
		System.out.println(collec.size());
		Object[] array = collec.toArray(); 
		Object[] array1 = collec.toArray(array);
	}

	private static void addElementstocollection(List<Integer> collec) {
		for(int i=0;i<10;i++) {
			collec.add(i);
		}
	}

}
