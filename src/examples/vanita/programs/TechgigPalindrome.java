package examples.vanita.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
 * 
 * Palindrome Length (100 Marks) GeekGoddess Screening test

Raja loves Strings.In Strings he specially loves palindromes. Palindromes are strings that read the same when read forward or backwards. Here Palindromes considered are only of even length(maybe 0). His Teacher gave me him a long string consisting of only digits as a gift on his birthday. Now Raja wants to know the longest sub-array whose elements (i.e digits) can be rearranged to form a palindrome of even length. Raja is unable to figure out the solution to the problem so he asks for your help.

Input Format
The function contains one argument - A String S consisting of digits (0-9).
First and only line of input consists of S (1 <= |S| <= 100000).

Output Format
You must return a single integer denoting the length of longest sub-array whose elements (digits) can be rearranged to form a palindrome of even length. If no such sub-array can be found return 0.

Sample Test Case 1
Input
12345354987
Output
6
Explanation
Here the longest sub-array is 345354 which can be rearranged to form 345543 which is a palindrome of even length 6. Hence the answer is 6.
 */
public class TechgigPalindrome {
	 public static int lengthofPalindrome(String input1)
	    {
		 	int lengthOfPalindrom = 0;
		 	char inputArr[] = input1.toCharArray();
		 	Map<Character, Integer> charsMap = new HashMap<>();
		 	for(int i=0;i<inputArr.length;i++) {
		 		if(!charsMap.containsKey((inputArr[i]))) {
		 			charsMap.put(inputArr[i], 1);
		 		} else {
		 			int count =  charsMap.get(inputArr[i]);
		 			count++;
		 			charsMap.replace(inputArr[i], count);
		 		}
		 	}
		 	for(Character currentKey : charsMap.keySet()) {
		 		int count = charsMap.get(currentKey);
		 		//if(count>=2) {
 				int reminder = count % 2;
 				lengthOfPalindrom = lengthOfPalindrom + (count  - reminder);
		 		//}
		 	}
		 	return lengthOfPalindrom;
	    }
	 public static void main(String[] args) {
		 System.out.println(lengthofPalindrome("23488432122")); //23488432
	 }
}
