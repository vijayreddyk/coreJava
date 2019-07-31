package files;

import java.util.Arrays;

public class HckEarth1 extends Thread{

	public static void main(String[] args) {
		HckEarth1 er = new HckEarth1();
		er.run1();
	}

	public  void run1() {
		String str1[] = {"testString1","testString2","testString3"};
		String str2[] = testMethod(str1);
		System.out.println(Arrays.toString(str1)+"  "+Arrays.toString(str2));
	}
	public String[] testMethod(String[] str3) {
		str3[1] = "testStringm2";
		return str3;
	}
}
