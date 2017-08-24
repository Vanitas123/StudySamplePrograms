package examples.vanita.sorting.algorithms;

public class BubbleSort {
	public static void main(String srgs[]) {

		int[] arr = new int[] {24, 56,3, 2, 4, 3,0,8,11 };
		
		/*for (int i = 0; i < 9; i++) {
			int flag=0; // to avoid repeated loop even after sorting is complete
			for(int j=0;j<9-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
			
		}*/
		
		/*int n = arr.length;
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1-1;j>=0;j--) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}*/
		for(int i=0;i<9;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
