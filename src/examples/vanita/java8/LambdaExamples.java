package examples.vanita.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;


public class LambdaExamples {

	public static void main(String[] args) {
		
		System.out.println("Sum = "+sum(2,4));
		print("Example");
		

	}
	
	static int sum(int x, int y){ 
		TwoArgInterface f = (a,b) -> (a+b);
		return f.twoNumOperation(x, y);
	}
	
	static int substract(int x, int y){
		
		//use java's func interface instead of creating similar interface like TwoArgInterface
		BiFunction<Integer,Integer, Integer> f  = (a,b) -> (a-b);
		return f.apply(x, y);
	}
	
	static public void print(String s){
		Consumer<String> f = (a) -> System.out.println(a);
		f.accept(s);
	}
	
}
