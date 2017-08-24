package examples.vanita.programs.generics;

public class GenericMethodExample {

	public <T> GenericMethodExample(T t) {
		T t2 = t;
		System.out.println("t in constructor : "+t2);
	}
	
	/*
	 * Generic Method Rule
	 * <type-Parameters> return_type method_name(parameter list)
	{
	 
	}*/
	
	static <T> T genericMethod(T t){
		T t2 = t;
		System.out.println(t2);
		return t2;
	}
}
