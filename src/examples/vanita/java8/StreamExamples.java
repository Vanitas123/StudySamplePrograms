package examples.vanita.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {

		/** --------Creating stream-------- **/

		// 1. Using Stream.of
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.print(p));

		// 2. Using List.stream()
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		System.out.println("Printing Stream of list...");
		list.stream().forEach(p -> System.out.print(p));

		// 3. String token /chars

		IntStream intStream = "12345_abcdefg".chars();
		System.out.println("Printing  int stream - ");
		intStream.forEach(p -> System.out.print(p));

		System.out.println(" ");
		// OR

		Stream<String> charStream = Stream.of("A$B$C".split("\\$"));
		charStream.forEach(p -> System.out.print(p));

		/** --------Intermediate operations -------- **/
		System.out.println(" ");

		// filter()-
		// find all even numbers -
		System.out.println("Find even numbers using stream filter---");
		List<Integer> listNumber = Arrays.asList(1, 2, null, 4, 5, 6, 7, 8, 9, 10);
		listNumber.stream().filter(Objects::nonNull).filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));

		System.out.println(" ");
		// map()
		// Filter even numbers and get squares fo them
		System.out.println("Find even numbers using stream filter and get squares using map operation---");
		listNumber.stream().filter(Objects::nonNull).filter(o -> o % 2 == 0).map(sq -> sq * sq)
				.forEach(s -> System.out.print(s + " "));

		// flatMap()
		System.out.println(" ");
		System.out.println("Flatmap example -");
		flatMapExample();

		// distinct()
		System.out.println(" ");
		System.out.println(" Distinct numbers using stream  -  ");
		List<Integer> duplicateNums = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 5);
		duplicateNums.stream().distinct().forEach(n -> System.out.println(n));

		// sorted()
		System.out.println(" ");
		System.out.println("Sort string using stream  -  ");
		List<String> unsortedStrings = Arrays.asList("aaa", "zzz", "bbb", "yyy", "rrr");
		unsortedStrings.stream().sorted().forEach(s -> System.out.print(s + " "));

		// peek() - It is an intemediate operation and needs to call terminal
		// operation to print the result.
		// This method exists mainly to support debugging, where you want to see
		// the elements as they flow past a certain point in a pipeline.
		System.out.println(" ");
		System.out.println("Peek example -");
		Stream.of("one", "two", "three", "four", "five", "six").filter(s -> s.length() == 3)
				.peek(f -> System.out.println("Filtered value: " + f + " ")).map(s -> s.toUpperCase())
				.peek(u -> System.out.println("Upper case value: " + u + " ")).count();

		// limit()
		System.out.println(" ");
		System.out.println("Limit example -");
		listNumber.stream().limit(3).forEach(l -> System.out.print(l + " "));

		// skip()
		System.out.println(" ");
		System.out.println("Skip example -");
		listNumber.stream().skip(3).forEach(s -> System.out.print(s + " "));

		/** --------Terminal Operations ----------- **/

		// forEach()
		// count()
		// collect()

		// forEachOrdered()
		// toArray()
		// reduce()

		// min()
		// max()
		// anyMatch()
		// allMatch()
		// noneMatch()
		// findFirst()
		// findAny()
	}

	public static void flatMapExample() {
		// Creating a list of Prime Numbers
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

		// Creating a list of Odd Numbers
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

		// Creating a list of Even Numbers
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

		System.out.println("The Structure before flattening is : " + listOfListofInts);
		List<Stream<Integer>> mapList = listOfListofInts.stream().map(list -> list.stream())
				.collect(Collectors.toList());
		System.out.println("The Structure using map only is : " + mapList);

		List<Integer> flatList = listOfListofInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("The Structure after flattening is : " + flatList);
	}
}
