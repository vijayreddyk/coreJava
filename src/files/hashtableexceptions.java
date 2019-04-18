package files;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class hashtableexceptions {
	
	public static void main(String[] args) {
		generateRandomStringht(100);
	}
	public static Hashtable<Integer,String> generateRandomStringht(int num){
		Hashtable<Integer,String> ht = new Hashtable<>();
		for(int i=1;i<=num;i++) {
			String randomText = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder value = new StringBuilder();
			for(int j=0;j<10;j++) {
				try {
					int index = (int) (Math.random()*26);
					value.append(randomText.charAt(index));
				}
				catch(Exception e) {
					
				}
			}
			ht.put(i, value.toString());
		}
		Enumeration<Integer> keySet = ht.keys();
		System.out.println(ht);
		return ht;
	}
}
