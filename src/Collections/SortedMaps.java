package Collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class TrainBox /*implements Comparable<TrainBox>*/{
	private int serialno;
	private int strength;
	public TrainBox(int serialno,int strength) {
		this.serialno = serialno;
		this.strength = strength;
	}
	/*public int compareTo(TrainBox o) {
		int prev = o.strength;
		int thisOne = this.strength;
		if(prev>thisOne) {
			return -1;
		} else if(prev<thisOne) {
			return 1;
		} else {
			return 0;
		}
	}*/
	
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "||"+this.serialno+"==>"+this.strength+"||";
	}
}
class TrainBoxStrengthComparator implements Comparator<TrainBox>{

	@Override
	public int compare(TrainBox o1, TrainBox o2) {
		int prevStrength = o1.getStrength();
		int currStrength = o2.getStrength();
		if(prevStrength < currStrength) {
			return -1;
		} else if(prevStrength > currStrength) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
public class SortedMaps {
	
	public static void main(String[] args) {
		Map<Integer,Integer> tmap = new TreeMap<>();
		tmap.put(new Integer(22), 1);
		tmap.put(new Integer(25), 1);
		tmap.put(new Integer(25), 2);
		tmap.put(new Integer(25), 3);
		tmap.put(new Integer(27), 1);
		tmap.forEach((k,v)->{
			System.out.println(k.toString()+" "+v);
		});
		Map<TrainBox,Integer> tmap1 = new TreeMap<>(new TrainBoxStrengthComparator());
		tmap1.put(new TrainBox(1, 79), 1);
		tmap1.put(new TrainBox(3, 48), 2);
		tmap1.put(new TrainBox(3, 48), 3);
		tmap1.forEach((k,v)->{
			System.out.println(k.toString()+" "+v);
		});
	}

}
