package examples.vanita.programs.generics;

public interface GenericInterface <T1, T2> {

	public T1 doSomeOperation(T2 t2); // T1 is return type
	public T2  doReverseOperation(T1 t1); //T2 is return type
}
