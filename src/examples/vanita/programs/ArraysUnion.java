package examples.vanita.programs;

import java.util.HashSet;
import java.util.Set;

public class ArraysUnion {

	static void union(int[] ... inputArrays)
    {
		Set<Integer> unionSet = new HashSet<Integer>();
		for (int[] inputArray : inputArrays) 
        {
			 for (int i : inputArray) {
				 unionSet.add(i);
			 }
        }
		  System.out.println("===========================");
	         
	        System.out.println("Union Of All Input Arrays :");
	         
	        System.out.println("===========================");
	         
	        System.out.println(unionSet);
    }
	public static void main(String[] args)
    {    
        int[] inputArray1 = {2, 3, 4, 7, 1};
         
        int[] inputArray2 = {4, 1, 3, 5,0};
         
        int[] inputArray3 = {8, 4, 6, 2, 1};
         
        int[] inputArray4 = {7, 9, 4, 1};
         
        union(inputArray1, inputArray2, inputArray3, inputArray4);
    }
}
