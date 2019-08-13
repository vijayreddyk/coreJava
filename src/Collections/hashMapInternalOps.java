package Collections;

import java.util.HashMap;
class MyObject{
	int a;
	int b;
	public MyObject(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
public class hashMapInternalOps {

	public static void main(String[] args) {
		HashMap<MyObject,String> hm = new HashMap<>();
		MyObject mo1 = new MyObject(1, 2);
		MyObject mo2 = mo1;
		MyObject mo3 = new MyObject(1, 2);
		System.out.println(mo1.hashCode());
		System.out.println(mo2.hashCode());
		System.out.println(mo3.hashCode());
		hm.put(mo1, "aaa");
		hm.put(mo2, "bbb");
		hm.put(mo3, "ccc");
		System.out.println(hm);
	}

}
