package Collections;

import java.util.HashMap;

class KeyObject{
	int a;
	String b;
	public KeyObject(String b,int a) {
		this.b = b;
		this.a = a;
	}
	@Override
	public int hashCode() {
		return a;
	}
	@Override
	public boolean equals(Object obj) {
		KeyObject obj1 = (KeyObject) obj;
		if(this.a==obj1.a) {
			return true;
		}
		return false;
	}
}
public class HashMaps {

	public static void main(String[] args) {
		HashMap<KeyObject,Integer> hm = new HashMap<>();
		hm.put(new KeyObject("a",1), 1);
		hm.put(new KeyObject("b",1), 2);
		hm.put(new KeyObject("a",2), 3);
		hm.put(new KeyObject("b",3), 4);
		System.out.println(hm.size());
	}

}
