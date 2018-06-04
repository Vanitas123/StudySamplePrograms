package examples.vanita.programs;



public class HackerEarth {
	public static void main(String args[]) {
		int T = 1;
		int N = 6;
		int A[] = {10, 9, 8, 4, 1, 0 };
		for (int t = 0; t < T; t++) {
			int out = find_difference_index(A);
			System.out.println("Output:" + out);
		}
	}

	static int find_difference_index(int[] A) {
		int maxdiff = 0;
		for (int i = 0; i < A.length; i++) {
			int diff= 0 ;
			for (int j = i + 1; j < A.length; j++) {
				
				if(A[i] < A[j]) {
					System.out.println("A[i]: "+A[i]+" A[j]: "+A[j]+" i:"+i+"j:"+j);
					diff = j - i;
					System.out.println("diff "+diff);
					if(diff > maxdiff) {
						maxdiff = diff;
					}
					
					
				}
				
			}
			if(maxdiff >=A.length -i) {
				break;
			}
			
		}
		return maxdiff;
	}
}
