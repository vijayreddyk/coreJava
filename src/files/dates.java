package files;

import java.util.Calendar;
import java.util.Date;

public class dates {

	public static void main(String[] args) {
		Date toDay = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		calendar.add(Calendar.AM_PM, 0);
		Date yesterDay = calendar.getTime();
		System.out.println(toDay+"  "+yesterDay);
		boolean greater = toDay.after(yesterDay);
		System.out.println(greater);
	}

}
