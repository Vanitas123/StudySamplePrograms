package examples.vanita.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * TechGig GeekGoddess contest SemiFinal problem
 * 
 * A famous bridge construction company has got a project of making a bridge over a long river. The engineers of the company have decided to make it using Concrete and Pipes. Company has some remaining material from last project and has decided to utilize them in this project. Remaining material includes some pipes which are of variable length. To utilize these pipes company has to connect them, which is going to cost them. The cost for connecting the pipes depends upon their length. Let s say they want to connect two pipes of length 4m and 10m, then cost will be $14 (i.e. 4 + 10 = $14).

Suppose company has 4 remaining pipes from last project and decides to connect them for this project. The length of pipes are 4m, 2m, 3m and 6m. 

                                                

You have to make a program to help the construction company in connecting the pipes such that it results in minimum cost.



For given case you have 4 pipes with length 4m, 2m, 3m and 6m. As the cost for connecting two pipes depends on the length so the minimum cost method can be



First connect 2m pipe and 3m pipe, which will going to cost $5 

Then connect 5m (made using 2m and 3m pipe) and 4m pipe, which will cost $9 

Then finally connect 6m and 9m pipe, which will cost $15 



So the total cost to the company will be $29, which is the minimum possible cost using the lengths of joined pipes as {5,9,15}. If company would have taken other method like connecting the 4m and 2m pipe first, then 6m and 3m, then 9m and 6m pipe then cost would have been $30 and lengths of joined pipes will be {6,9,15}. 



If the number of remaining pipes to be connected is 1, then cost would be $0 and lengths of joined pipes will be {0}.



Make a program to find the minimum possible cost for connecting two remaining pipes of last construction and return the length of all the pipes joined that is sorted in ascending order. 

Input Format
You will be given a function which contains an array of N-integers as argument, which depicts remaining pipes lengths(where N>0).
Constraints
1 <= N <= 10000
1 <= Ai <= 10000
Output Format
You need to return An array (L) containing the lengths of pipes joined that is sorted in ascending order.

Sample TestCase 1
Input
4
4
2
3
6
Output
5
9
15
-------------------------------------------------------------
7,9,5,4 {5+4} {9+7} {16+9} 
		  9     16    25     = 50
		 {9+4} {13+5} {18+7}  
		  13	18		25  = 56
 */
public class TechGigGeekGoddessSM {

	public static int[] joinedPipes(int[] remainingPipes) {
		int[] costOfJoins;
		// if odd number of pipes are there, then ignore the last 1 remaining as it
		// costs 0
		if (remainingPipes.length % 2 == 1)
			costOfJoins = new int[remainingPipes.length - 2];
		else
			costOfJoins = new int[remainingPipes.length - 1];

		// cost is least when numbers are added in ascending order
		Arrays.sort(remainingPipes);

		for (int k = 0; k < costOfJoins.length; k++) {
			for (int i = 0; i < remainingPipes.length; i = i + 2) {
				for (int j = i + 1; j < remainingPipes.length; j++) {
					if (i == 0) {
						costOfJoins[0] = remainingPipes[i] + remainingPipes[j];
						break;
					} else if (k > 0 && k % 2 == 1) {
						costOfJoins[k] = costOfJoins[k - 1] + remainingPipes[i];
					} else if (k > 0 && k % 2 == 0) {
						costOfJoins[k] = costOfJoins[k - 1] + remainingPipes[j];
					}
				}
			}
		}

		return costOfJoins;
	}

	public static int[] joinedPipes2(int[] remainingPipes) {
		int[] costOfJoins;
		int remainLength;
		
		if(remainingPipes.length ==1) {
			return new int[0];
		}
		// if odd number of pipes are there, then ignore the last 1 remaining as it
		// costs 0
		if (remainingPipes.length % 2 == 1) {
			costOfJoins = new int[remainingPipes.length - 2];
			remainLength = remainingPipes.length - 1;
		} else {
			costOfJoins = new int[remainingPipes.length - 1];
			remainLength = remainingPipes.length;
		}
		
		// cost is least when numbers are added in ascending order
		Arrays.parallelSort(remainingPipes);
		costOfJoins[0] = remainingPipes[0] + remainingPipes[1];
		for (int k = 1; k < costOfJoins.length; k++) {
			for (int i = 2; i < remainLength; i++) {

				// costOfJoins[k] = costOfJoins[k] + remainingPipes[i];
				System.out.println("k:" + k + " i:" + i + " remaining[i] :" + remainingPipes[i]);
					costOfJoins[k] = costOfJoins[k - 1] + remainingPipes[i];
					break;
			}

		}
		// 2,3,4,6
		return costOfJoins;
	}

	public static void main(String args[]) {
		int[] remainingPipes = {3};
		int[] i = joinedPipes2(remainingPipes);
		int totalPrice = 0;
		for (int a : i) {
			System.out.print(a + " ");
			totalPrice += a;
		}
		System.out.println("Total :" + totalPrice);
	}

}
