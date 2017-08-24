package examples.vanita.programs;

/*
 *       1 
        2 2 
       3 3 3 
      4 4 4 4 
     5 5 5 5 5 
    6 6 6 6 6 6 
   7 7 7 7 7 7 7 
  8 8 8 8 8 8 8 8 
 9 9 9 9 9 9 9 9 9 
//Row-wise
 * 
 * */
public class NumberPyramid1 {

	public static void main(String arg[]) {
		int noOfRows = 9;
		int rowCount = 1;
		
		for(int row=noOfRows;row>0;row--) {
			for (int j = 1; j <= row; j++)
            {
                System.out.print(" ");
            }
			
			for(int col=1;col<=rowCount;col++) {
				System.out.print(rowCount + " ");
			}
			
			System.out.println();
			rowCount++;
		}
		
	}
}
