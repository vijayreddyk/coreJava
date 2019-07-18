package files;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.BitSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		@SuppressWarnings("unused")
		AbstractSet<String> abstractSet = new AbstractSet<String>() {
			@Override
			public Iterator<String> iterator() {
				return null;
			}

			@Override
			public int size() {
				return 0;
			}
		};
		BitSet bitSet = new BitSet();
		addElementstohashSet(hashSet);
		addElementstotreeSet(treeSet);
		addElementstoLinkedhashSet(linkedHashSet);
		addElementstoBitSet(bitSet);
	}

	@SuppressWarnings("unchecked")
	private static void addElementstoBitSet(BitSet bitSet) {
		for(int i=1;i<=10;i++) {
			((Set<String>) bitSet).add(i+"");
		}
	}

	private static void addElementstoLinkedhashSet(LinkedHashSet<String> linkedHashSet) {
		for(int i=1;i<=10;i++) {
			linkedHashSet.add(i+"");
		}
	}

	private static void addElementstotreeSet(TreeSet<String> treeSet) {
		for(int i=1;i<=10;i++) {
			treeSet.add(i+"");
		}
	}

	private static void addElementstohashSet(HashSet<String> hashSet) {
		for(int i=1;i<=10;i++) {
			hashSet.add(i+"");
		}
	}

}
