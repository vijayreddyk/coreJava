package files;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class printThreeDiigitsInWords {
	private static final HashMap<String,String> hunderedsHashMap = gethundredHashMap();
	private static final HashMap<String,String> tensHashMap = getTensHashMap();
	private static final HashMap<String, String> onesHashMap = getOnesHashMap();
	private static final HashMap<String,String> tentoTwentyHashMap = getTentoTwentyHashMap();
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		printThreeDigitsInWords(a);
	}

	private static HashMap<String, String> getTentoTwentyHashMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("10", "Ten");
		map.put("11", "Eleven");
		map.put("12", "Twelve");
		map.put("13", "Thirteen");
		map.put("14", "Fourteen");
		map.put("15", "Fifteen");
		map.put("16", "Sixteen");
		map.put("17", "Seventeen");
		map.put("18", "Eighteen");
		map.put("19", "Nineteen");
		return map;
	}

	private static HashMap<String, String> getOnesHashMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		map.put("4", "Four");
		map.put("5", "Five");
		map.put("6", "Six");
		map.put("7", "Seven");
		map.put("8", "Eight");
		map.put("9", "Nine");
		return map;
	}

	private static HashMap<String, String> getTensHashMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "Ten");
		map.put("2", "Twenty");
		map.put("3", "Thirty");
		map.put("4", "Fourty");
		map.put("5", "Fifty");
		map.put("6", "Sixty");
		map.put("7", "Seventy");
		map.put("8", "Eighty");
		map.put("9", "Ninety");
		return map;
	}

	private static HashMap<String, String> gethundredHashMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "One Hundred");
		map.put("2", "Two Hundred");
		map.put("3", "Three Hundred");
		map.put("4", "Four Hundred");
		map.put("5", "Five Hundred");
		map.put("6", "Six Hundred");
		map.put("7", "Seven Hundred");
		map.put("8", "Eight Hundred");
		map.put("9", "Nine Hundred");
		return map;
	}

	private static void printThreeDigitsInWords(int num) {
		int arrayInSeperateDecimals[] = new int[3];
		int index = 0;
		int divider = 100;
		while(num>0) {
			arrayInSeperateDecimals[index] = num/divider;
			num = num % divider;
			divider = divider/10;
			index++;
		}
		inWords(arrayInSeperateDecimals);
		//System.out.println(Arrays.toString(arrayInSeperateDecimals));
	}

	private static void inWords(int[] arrayInSeperateDecimals) {
		System.out.print(hunderedsHashMap.get(arrayInSeperateDecimals[0]+"")+" ");
		
		if(arrayInSeperateDecimals[1] == 1) { 
			System.out.print(tentoTwentyHashMap.get(arrayInSeperateDecimals[1]+""+arrayInSeperateDecimals[2])+" ");
			return;
		} else if(arrayInSeperateDecimals[1] == 0) {
			
		} else {
			System.out.print(tensHashMap.get(arrayInSeperateDecimals[1]+"")+" ");
		}
		
		if(arrayInSeperateDecimals[2] == 0) {
			return;
		} else {
			System.out.print(onesHashMap.get(arrayInSeperateDecimals[2]+""));
		}
	}

}
