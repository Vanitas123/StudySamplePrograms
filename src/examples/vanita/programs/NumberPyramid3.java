package examples.vanita.programs;
/*
 *                1 
                1 2 1 
              1 2 3 2 1 
            1 2 3 4 3 2 1 
          1 2 3 4 5 4 3 2 1 
        1 2 3 4 5 6 5 4 3 2 1 
      1 2 3 4 5 6 7 6 5 4 3 2 1 
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
 */
public class NumberPyramid3 {
	public static void main(String arg[]) {
		int noOfRows = 9;
		int rowCount = 1;
		
		for(int row=noOfRows;row>0;row--) {
			for (int j = 1; j <= row*2; j++)
            {
                System.out.print(" ");
            }
			
			for(int col=1;col<=rowCount;col++) {
				System.out.print(col + " ");
			}
			for(int col=rowCount-1;col>=1;col--) {
				System.out.print(col + " ");
			}
			
			System.out.println();
			rowCount++;
		}
		
	}
}
