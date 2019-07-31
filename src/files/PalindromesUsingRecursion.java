package files;

public class PalindromesUsingRecursion {

	public static void main(String[] args) {
		String str = "abc;cba";
		System.out.println(checkIfPalindrome(str.toCharArray()));
		System.out.println(checkIfPalindromeUsingStrings(str,0,str.length()-1));
	}

	private static boolean checkIfPalindromeUsingStrings(String str,int i,int j) {
		
		if(str.charAt(i) != str.charAt(j)) {
			return false;
		} else if(i>=j && str.charAt(i)==str.charAt(j)) {
			return true;
		} else {
			return checkIfPalindromeUsingStrings(str,i+1,j-1);
		}
	}

	private static boolean checkIfPalindrome(char[] charArray) {
		return check(charArray,0,charArray.length-1);
		
	}

	private static boolean check(char[] charArray, int i, int j) {
		if(charArray[i]!=charArray[j]) {
			return false;
		} else if(i>=j && charArray[i] == charArray[j]) {
			return true;
		} else {
			return check(charArray,i+1,j-1);
		}
	}

}
