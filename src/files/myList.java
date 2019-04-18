package files;
import java.util.HashMap;

public class myList{
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"a");
		hm.put(2,"b");
		@SuppressWarnings("unchecked")
		HashMap<Integer,String> hm1 = (HashMap<Integer, String>) hm.clone();
		hm1 = hm;
		hm.put(3, "c");
		System.out.println(hm1);
	}
}
