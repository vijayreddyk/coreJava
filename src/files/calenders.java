package files;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class calenders {

	public static void main(String[] args) {
		/*Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		Date dt = new Date();
		System.out.println(dt.after(dt));
		//System.out.println(dt);
*/	
		String str = "Hello World";
		HashMap<Character,Integer> hm = new HashMap<>();
		char t = 'a';
		if(str.length()>0) {
			for(int i=0;i<str.length();i++) {
				t = str.charAt(i);
				if(hm.containsKey(t)) {
					hm.put(t, hm.get(t)+1);
				} else {
					hm.put(t, 1);
				}
			}
		}
		System.out.println(hm);
	}

}
