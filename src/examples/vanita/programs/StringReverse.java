package examples.vanita.programs;

public class StringReverse {

	public static void main(String args[]) {
		// 1. Using StringBuffer Class
		StringBuffer sbf = new StringBuffer("MyJava");
		System.out.println(sbf.reverse()); // Output : avaJyM

		// 2. Using iterative method
		String str = "MyJava";
		char[] strArray = str.toCharArray();

		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]); // Output : avaJyMs

		}

		// 3. Using Recursive Method
		System.out.println(recursiveMethod(str)); // Output : avaJyM
		
	}

	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
