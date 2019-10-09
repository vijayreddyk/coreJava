package Strings;

import java.util.Arrays;

public class ReverseCharacters {
	public static void main(String[] args) {
		String str = "This String ab should be reversed ";
		char array[] = str.toCharArray();
		
		StringBuilder res = new StringBuilder();
		int trackIndexBeg = 0;
		int length = str.length()-1;
		
		for(int i=0;i<str.length();i++) {
			if(array[i] == ' ' || i == length) {
				if(i == length) {
					i = i+1;
				}
				reverse(array,i-1,trackIndexBeg);
				trackIndexBeg = i+1;
			}
		}
		System.out.println(Arrays.toString(array));
		/*
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ' || i == length) {
				if(i == length) {
					i = i+1;
				}
				res.append(new StringBuilder(str.substring(trackIndexBeg,i)).reverse().append(" "));
				System.out.println(str.substring(trackIndexBeg,i));
				trackIndexBeg = i+1;
			}
		}
		System.out.println(res.toString());*/
	}

	private static void reverse(char[] array, int i, int trackIndexBeg) {
		while(trackIndexBeg<i) {
			char temp = array[i];
			array[i] = array[trackIndexBeg];
			array[trackIndexBeg] = temp;
			i--;
			trackIndexBeg++;
		}
	}
}
