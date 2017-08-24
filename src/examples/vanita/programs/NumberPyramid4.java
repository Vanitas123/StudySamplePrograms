package examples.vanita.programs;

public class NumberPyramid4 {
	public static void main(String arg[]) {
		int noOfRows = 9;
		int rowCount = 1;
		
		for(int row=noOfRows;row>0;row--) {
			for (int j = 1; j <= row*2; j++)
            {
                System.out.print(" ");
            }
			
			for(int col=row;col>=1;col--) {
				System.out.print(col + " ");
			}
			for(int col=1;col<=rowCount;col++) {
				System.out.print(row + " ");
			}
			
			System.out.println();
			rowCount++;
		}
		
	}
}
