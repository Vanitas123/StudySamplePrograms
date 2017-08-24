package examples.vanita.programs.generics;

import java.util.Arrays;
import java.util.List;
/*
 *  Here Integer, Double are subtypes of Number class. If you want generic expression to accept
 *  all subclasses of a particular type, you will use upper bound wildcard using “extends” keyword.
 * */
public class UpperBoundWildcard {

	public static void main(String[] args) {
		//List of Integers
	      List<Integer> ints = Arrays.asList(1,2,3,4,5);
	      System.out.println(sum(ints));
	      
	    //List of Doubles
	      List<Double> doubles = Arrays.asList(1.5d,2d,3d);
	      System.out.println(sum(doubles));
	      
	      List<String> strings = Arrays.asList("1","2");
	      //This will give compilation error as :: The method sum(List<? extends Number>) in the 
	      //type GenericsExample<T> is not applicable for the arguments (List<String>)
	     
	      // System.out.println(sum(strings));

	}
	public static Number sum (List<? extends Number> T ) {
		double sum = 0.0;
		for (Number n : T) {
			sum = sum+n.doubleValue();
		}
		return sum;
	}
}

