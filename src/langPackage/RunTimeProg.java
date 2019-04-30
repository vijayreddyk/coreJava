package langPackage;

public class RunTimeProg {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory is "+r.totalMemory());
		System.out.println("Memory available is "+r.freeMemory());
		Integer array[] = new Integer[100];
		int array1[] = new int[100];
		System.out.println("Memory available after declaring "+r.freeMemory());
		for(int i=0;i<100;i++) {
			array[i] = i+1;
			array1[i] = i+1;
		}
		array1 = null;
		array = null;
		r.gc();
		System.out.println("Memory available after running garbage collecter "+r.freeMemory());
	}

}
