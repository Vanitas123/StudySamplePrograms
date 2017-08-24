package examples.vanita.programs;
/*
 *       1 
        1 2 
       1 2 3 
      1 2 3 4 
     1 2 3 4 5 
    1 2 3 4 5 6 
   1 2 3 4 5 6 7 
  1 2 3 4 5 6 7 8 
 1 2 3 4 5 6 7 8 9
 
  Column-wise
 * */

public class NumberPyramid2 {
	public static void main(String arg[]) {
		int noOfRows = 9;
		int rowCount = 1;
		
		for(int row=noOfRows;row>0;row--) {
			for (int j = 1; j <= row; j++)
            {
                System.out.print(" ");
            }
			
			for(int col=1;col<=rowCount;col++) {
				System.out.print(col + " ");
			}
			
			System.out.println();
			rowCount++;
		}
		
	}
}
