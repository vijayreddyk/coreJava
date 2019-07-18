package arrays;
class Numbers{
	int num1;
	int num2;
	public Numbers(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int sum() {
		return this.num1+this.num2;
	}
}
public class MaximumSumAllRotations {
	public static void main(String[] args) {
		int array[] = {-1,-3,-6,-9,-1,-89,1000};
		Numbers max = new Numbers(array[0],array[1]);
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				Numbers pair = new Numbers(array[i],array[j]);
				if(max.sum()<pair.sum()) {
					max = pair;
				}
			}
		}
		System.out.println(max.num1+" "+max.num2+" "+max.sum());
	}

}
