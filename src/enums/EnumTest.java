package enums;

import java.util.EnumMap;

enum Colors{
	VIOLET,INDIGO,BLUE,GREEN,YELLOW,RED;
}
public class EnumTest {

	public static void main(String[] args) {
		Colors c = Colors.BLUE;
		EnumMap<Colors, Integer> emap = new EnumMap<>(Colors.class);
		emap.put(Colors.BLUE, 1);
		emap.put(Colors.INDIGO, 2);
		emap.put(Colors.BLUE, 3);
		System.out.println(emap);
	}

}
