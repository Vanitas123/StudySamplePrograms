package examples.vanita.programs;

//http://codepumpkin.com/program-check-whether-number-prime-not/
public class PrimeNumber {

	public static boolean isPrimeNaive(int n) {
		// 1 is not Prime and also not Composite.
		if (n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			// if number divisible upto n, then reminder is 0, hence not prime
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * More Efficient Approach
	 * 
	 * In this approach we will use two properties of prime numbers.
	 * 
	 * 1) The only even prime number is 2. All other even numbers can be divided by
	 * 2 and hence they are not prime numbers.
	 * 
	 * 2) Every composite number has at least one prime factor less than or equal to
	 * square root of itself.
	 * 
	 * In other words, the smallest prime factor of a composite number N is always
	 * less than or equal to √N.
	 */
	public static boolean isPrime(int n) {

		// 1 is not Prime and also not Composite.
		if (n == 1) {
			return false;
		}

		// for 1st property - For all the even numbers != 2
		if (n > 2 && n % 2 == 0)
			return false;

		// for 2nd property - for all the odd numbers > 2
		// Here we will try to find any one odd factor which is
		// less than or equal to square root of n
		for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
			if (n % i == 0)
				return false;

		}
		return true;
	}
}
