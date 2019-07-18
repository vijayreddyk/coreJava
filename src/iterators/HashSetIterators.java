package iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class compTreeObject implements Comparable<compTreeObject>{
	int var1;
	int var2;
	public compTreeObject(int var1,int var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	public int compareTo(compTreeObject o) {
		if(this.var1>o.var1 && this.var2>o.var2 || this.var1>o.var1 && this.var2<o.var2)
			return 1;
		else if(this.var1<o.var1 && this.var2<o.var2 || this.var1<o.var1 && this.var2>o.var2)
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "[var1="+this.var1+",var2="+this.var2+"]";
	}
}
public class HashSetIterators {

	public static void main(String[] args) {
		TreeSet<compTreeObject> ht = new TreeSet<>();
		for(int i=0;i<100;i++) {
			compTreeObject cto = new compTreeObject((int)(Math.random()*1000)+1, (int)(Math.random()*1000)+1);
			ht.add(cto);
			System.out.println(cto.toString());
		}
		System.out.println(ht.size());
		Iterator<compTreeObject> itr = ht.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}

}
