package examples.vanita.programs.generics;

public class GenericArray<T> {

	// this one is fine
	public T[] notYetInstantiatedArray;

	// causes compiler error; Cannot create a generic array of T
	// public T[] array = new T[5];

	public void arrayGenericUsage(T[] arr) {
		this.notYetInstantiatedArray = arr;
		for (T i : arr) {
			System.out.println(i);
		}
	}
}
