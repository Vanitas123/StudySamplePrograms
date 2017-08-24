package examples.vanita.programs.generics;

public class GenericsInJava {

	public static void main(String[] args) {
		GenericClass<String> gen1 = new GenericClass<String>("It must be string");

		gen1.setT("Value Changed"); // Passing String to setT() method

		String s = gen1.getT(); // getT() method returning string
		System.out.println(s);
		// gen1.setT(new Integer(123)); //Compile time error. You can't pass Integer
		// type to setT() method now

		// gen1.setT(new Double(23.56)); //Compile time error. You can't pass Double
		// type to setT() method now
		
		GenericMethodExample.genericMethod(new String("ABC"));
		GenericMethodExample.genericMethod(new Integer(5));
		GenericMethodExample gen = new GenericMethodExample(new String("Generic Constructor in NonGeneric Class"));
		
		GenericArray<Integer> genArr = new GenericArray<>();
		Integer[] arr = {1,2,3,4,5};
		genArr.arrayGenericUsage(arr);
	}
}
