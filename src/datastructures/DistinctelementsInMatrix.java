package datastructures;

import java.util.HashMap;
import java.util.HashSet;

public class DistinctelementsInMatrix {
	public static final int matrix[][] = {{12, 1, 14, 3, 16},
            {14, 2, 1, 3, 35},  
            {14, 1, 14, 3, 11},  
            {14, 25, 3, 2, 1},
            {1, 18, 3, 21, 14}};
	public static void main(String[] args) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		HashMap<Integer, Integer> noOfUniqueEles = new HashMap<>();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(noOfUniqueEles.containsKey(matrix[i][j])) {
					if((i+1)!=noOfUniqueEles.get(matrix[i][j]))
						noOfUniqueEles.put(matrix[i][j], noOfUniqueEles.get(matrix[i][j])+1);
				} else {
					noOfUniqueEles.put(matrix[i][j], 1);
				}
			}
		}
		System.out.println(noOfUniqueEles.size());
		System.out.println(noOfUniqueEles.toString());
		HashSet<Integer> keySet = (HashSet<Integer>) noOfUniqueEles.keySet();
		for(Integer key:keySet) {
			if()
		}
		
	}

}
