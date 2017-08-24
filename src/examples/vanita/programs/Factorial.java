package examples.vanita.programs;

public class Factorial {
	public static void main(String args[]) {
		int num = 8;
		//System.out.println("Factorial using loop "+getFactorial(num));
		//System.out.println("Factorial using recursion "+recursiveFactorial(num));
		System.out.println("Factorial using recursion optimized "+recursiveFactorialOptimized(num));
	}

	private static int getFactorial(int num) {
		int fact = num;
		for (int i = num; i > 1; --i) {
			fact = fact * (i - 1);
		}
		return fact;
	}
	
	private static int recursiveFactorial(int num) {
		int fact = num;
		if(num>1){
			num--;
			fact = fact * recursiveFactorial(num);
		}
		return fact;
	}
	
	private static int recursiveFactorialOptimized(int num) {
		if(num<=1) {
			return num;
		} else {
			return (num * recursiveFactorialOptimized(num - 1));
		}
	}

}
