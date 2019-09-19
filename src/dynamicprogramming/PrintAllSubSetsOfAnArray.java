package dynamicprogramming;

public class PrintAllSubSetsOfAnArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		printAllSubSetsOfArray(arr);
	}

	private static void printAllSubSetsOfArray(int[] arr) {
		int size = arr.length;
		int bitsize = (1 << size)-1;
		System.out.println(bitsize);
		for(int i=1;i<=bitsize;i++) {
			int index = size-1;
			int num = i;
			while(num>0) {
				if((num & 1)==1) {
					System.out.print(arr[index]);
				}
				index--;
				num >>=1;
			}
			System.out.println();
		}
	}

}
