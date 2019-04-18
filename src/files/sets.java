package files;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class sets {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		addElementsToHashSet(set);
		System.out.println(set.contains(8));
		System.out.println(set.contains(30));
		System.out.println(set);
		set.clear();
		System.out.println(set.isEmpty());
		Iterator<Integer> ite = set.iterator();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		addElementsToLinkedHashSet(linkedHashSet);
		System.out.println(linkedHashSet.remove("c"));
		System.out.println(linkedHashSet);
		for(String str : linkedHashSet) {
			System.out.println(str);
		}
		Set<String> treeSet = new TreeSet<String>();
		addElementsToTreeSet(treeSet);
		System.out.println(treeSet);
	}

	private static void addElementsToTreeSet(Set<String> treeSet) {
		char ch = 'a';
		for(int i = 1;i <= 10;i++) {
			treeSet.add(ch+"");
			ch++;
		}
	}

	private static void addElementsToLinkedHashSet(Set<String> treeSet) {
		char ch = 'a';
		for(int i = 1;i <= 10;i++) {
			treeSet.add(ch+"");
			ch++;
		}
	}

	private static void addElementsToHashSet(Set<Integer> set) {
		for(int i = 1;i <= 10;i++ ) {
			set.add(i);
		}
	}

}
