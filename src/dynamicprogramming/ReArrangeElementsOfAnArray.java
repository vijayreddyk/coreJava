package dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
class Key{
	int num;
	int freq;
	public Key(int num,int freq) {
		this.num = num;
		this.freq = freq;
	}
}
class keyComparator implements Comparator<Key>{

	@Override
	public int compare(Key o1, Key o2) {
		if(o1.freq<o2.freq) {
			return 1;
		} else if(o1.freq>o2.freq){
			return -1;
		} else {
			return 0;
		}
	}
	
}
public class ReArrangeElementsOfAnArray {

	public static void main(String[] args) {
		int array[] = {1, 1, 1, 1, 2, 2, 3, 3};
		PriorityQueue<Key> pq = new PriorityQueue<>(new keyComparator());
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<array.length;i++) {
			if(hm.containsKey(array[i])) {
				hm.put(array[i],hm.get(array[i])+1);
			} else {
				hm.put(array[i],1);
			}
		}
		for(Map.Entry<Integer, Integer> key:hm.entrySet()) {
			pq.add(new Key(key.getKey(),key.getValue()));
		}
		int res[] = new int[array.length];
		int index = 0;
		Key prev = new Key(-1,-1);
		while(!pq.isEmpty()) {
			Key key = pq.poll();
			res[index] = key.num;
			if(prev.freq>0) {
				pq.add(prev);
			}
			key.freq = key.freq-1;
			prev = key;
			index++;
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(res));
		
	}

}
