package files;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.Hashtable;
public class maps {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer, String>();
		WeakHashMap<Integer, String> whm = new WeakHashMap<Integer, String>();
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		addElementsToMap(tm);
		addElementsToMap(hm);
		addElementsToMap(lhm);
		addElementsToMap(ihm);
		addElementsToMap(whm);
		addElementsToMap(ht);
		iterateMap(tm);
		iterateMap(hm);
		iterateMap(lhm);
		iterateMap(ihm);
		iterateMap(whm);
		iterateMap(ht);
		System.out.println(tm.higherKey(5));
		Entry<Integer, String> temp = tm.firstEntry();
		System.out.println(temp);
	}

	private static void iterateMap(Map<Integer, String> tm) {
		for(Entry<Integer, String> entry : tm.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.print(key + "=>" + value+" ");
		}
		System.out.println();
		Set<Integer> keySet = tm.keySet();
		Collection<String> valueSet = tm.values();
		System.out.println(keySet+"  "+valueSet+" "+(tm instanceof IdentityHashMap));
	}

	private static void addElementsToMap(Map<Integer, String> map) {
		for(int i=1;i<=10;i++) {
			map.put(i, (i*i)+"");
		}
		System.out.println(map);
	}

}
