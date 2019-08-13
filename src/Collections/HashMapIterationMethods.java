package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterationMethods {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<>();
		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
		GenerateRandomHashMap(hashMap,linkedHashMap);
		//Using iterator keyset and entry set
		System.out.println("------Using iterator keyset and entry set-----------"+hashMap.size());
		System.out.println(hashMap.keySet());
		System.out.println("------Using iterator keyset and entry set-----------"+linkedHashMap.size());
		System.out.println(linkedHashMap.keySet());
		iterateUsingIterator(hashMap);
		System.out.println("--------Using for each loop----------------------");
		iterateUsingforEachLoop(hashMap);
		System.out.println("-------Using for each--------------------------");
		iterateUsingForEach(hashMap);
		System.out.println(hashMap);
		LinkedHashMap<Integer, String> lhm = produceLinkedHashMap(hashMap);
		lhm.forEach((k, v)->{
			System.out.println(k+"=>"+v);
		});
	}

	private static LinkedHashMap<Integer, String> produceLinkedHashMap(HashMap<Integer, String> hashMap) {
		return new LinkedHashMap<>(hashMap);
	}

	private static void iterateUsingForEach(HashMap<Integer, String> hashMap) {
		hashMap.forEach((k,v)->System.out.println(k+"=>"+v));
	}

	private static void iterateUsingforEachLoop(HashMap<Integer, String> hashMap) {
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}
	}

	private static void iterateUsingIterator(HashMap<Integer, String> hashMap) {
		Iterator<Entry<Integer, String>> itr1 = hashMap.entrySet().iterator();
		while(itr1.hasNext()) {
			Entry<Integer, String> entry = (Entry<Integer, String>) itr1.next();
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}	
	}

	private static void GenerateRandomHashMap(HashMap<Integer, String> hashMap, LinkedHashMap<Integer, String> linkedHashMap) {
		for(int i=0;i<100;i++) {
			int key = (int)(Math.random()*100);
			System.out.println(key);
			hashMap.put(key, String.valueOf((int)(Math.random()*100000)));
			linkedHashMap.put(key, String.valueOf((int)(Math.random()*100000)));
		}
	}

}
