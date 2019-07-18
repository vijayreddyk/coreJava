package arrays;

import java.util.Arrays;

public class NextPalindrome {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,2,1,2};
		int mid = a.length/2;
		int i = mid;
		int j = (a.length%2 == 0)?(mid+1):mid;
		while(i>0 && a[i]==a[j]) {
			i--;
			j++;
		}
		if(i<0 || a[i]>a[j]) {
			while(i>=0) {
				a[j++] = a[i--];
				System.out.println(Arrays.toString(a));
			}
		} else {
			if(a.length%2==0) {
				int carry = 1;
				a[mid] = (a[mid]+1)%10;
				i = mid-1;
				j = mid;
				while(i>=0) {
					a[i] = a[i]+carry;
					a[i] = (a[i]+1)%10;
					a[j++] = a[i];
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
