package arrays;

public class BinarySearchUsingRecusrion {

	public static void main(String[] args) {
		int array[] = {1,3,4,67,89,1045,1345,1784,2089,3041,3099,4567,10000,20000};
		int size = array.length;
		int ele = 3099;
		int mid = (size)/2;
		int index = binarySearchWithRecursion(array,0,size-1,mid,ele);
		System.out.println(index);
	}

	private static int binarySearchWithRecursion(int[] array, int start, int end, int mid,int ele) {
		int middle = 0;
		if(array[mid]==ele) {
			return mid;
		} else if(array[mid]>ele) {
			middle = (end-1)/2;
			return binarySearchWithRecursion(array, 0, mid-1, middle, ele);
		} else {
			middle = ((mid+1)+end)/2;
			return binarySearchWithRecursion(array, mid+1, end, middle, ele);
		}
	}

}
