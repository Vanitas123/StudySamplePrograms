package examples.vanita.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class TomTomDiceProblem {

	private static final Map<Integer, Integer> dicePips = new HashMap<>();

	public static void main(String[] args) {

		int[] A = { 4, 2, 3, 3 };
		System.out.println("Moves = " + solution(A));
	}

	public static int solution(int[] A) {

		dicePips.put(1, 6);
		dicePips.put(2, 5);
		dicePips.put(3, 4);
		dicePips.put(4, 3);
		dicePips.put(5, 2);
		dicePips.put(6, 1);
		int moves = 0;
		boolean allEqual = IntStream.of(A).boxed().allMatch((e -> e.equals(A[0])));
		if (allEqual)
			return 0;

		// assume A[0] to compare
		for (int i = 1; i < A.length; i++) {
			// check equal moves = 0
			if (A[0] == A[i]) {
				continue;
			}
			// check adjacent - move+2
			if (!checkIfAdjacent(A[i], A)) {
				moves += 2;
			} else {
				moves++;
			}
		}
		return moves;
	}

	private static boolean checkIfAdjacent(int pipElement, int[] A) {
		// System.out.println("dicePip:" + dicePips.get(pipElement) + "
		// pipElement :" + pipElement);
		if (dicePips.get(A[0]) == pipElement) {
			return false;
		}
		return true;
	}

}
