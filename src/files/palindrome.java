package files;

public class palindrome {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdecba");
		String ex = "";
		System.out.println(ex.charAt(0));
		//CheckPalindrome(sb);
	}

	public static boolean CheckPalindrome(StringBuilder sb) {
		String string = sb.toString();
		int endIndex = string.length()-1;
		char strArray[] = string.toCharArray();
		for(int index=0;index<string.length();index++) {
			if(index<=endIndex) {
				if(strArray[index]!=strArray[endIndex]) {
					return false;
				}
				endIndex--;
			}
			else {
				break;
			}
		}
		return true;
	}

}
