package examples.vanita.programs;

public class CheckSumPairInArray {
	public static void main(String[] args) {
		int input = 10;
		int[] array = {3,7,1,2,4,6,9,2,6,7,5,5};
		for(int i = 0; i< array.length;i++) {
			for(int j=0;j<i;j++) {
				if(array[i]+array[j]== input) {
					System.out.println("Sum" + array[i]+ " + "+array[j]);
				}
			}
		}
	}
}

