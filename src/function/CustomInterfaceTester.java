package function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomInterfaceTester{	

	
	public static void main(String[] args) {
		List<String> movies = new ArrayList<>() {
			{
				add("wallE");
				add("Brave");
				add("Matrix");
				add("Iron-Man");
				add("one");
				add("two");
			}
		};
		
		List<String> numbers = new ArrayList<>() {
			{
				add("wallE");
				add("one");
				add("two");
				add("three");
				add("four");
				add("five");
				add("three");
				add("four");
				add("five");add("three");
				add("four");
				add("five");
			}
		};
		
		

		System.out.println(trio.apply(movies, 1, 2));
		
		System.out.println(
				addLen.apply(movies.get(2), movies.get(movies.size() - 1)));
		
		System.out.println(listConcat.apply(movies, numbers));
		
		System.out.println(elementsInJustOne.apply(movies, numbers));
		
		System.out.println(glorifiedAdder.apply(1, 2, 3));
	}
	
	public static final 
		TriFunction<List<String>, Integer, Integer, List<String>>
			trio = (list, first, second) 
				-> list.stream()
					   .map(f -> f + " " + first)
					   .map(s -> s + " " + second)
					   .map(ln -> ln + "\n")
					   .sorted(Comparator.comparing(String::length))
					   .collect(Collectors.toList());
	
	public static final BiFunction<String, String, Integer>
		addLen = (x, y) -> x.length() + y.length();
	
	public static final BiFunction<List<String>, List<String>, List<String>>
		elementsInJustOne = (firstList, secondList) 
			-> Stream.concat(
					firstList.stream()
						.filter(x -> !secondList.contains(x))
						.map(x -> x + "\n")						
						
					,secondList.stream()
						.filter(y -> !firstList.contains(y))
						.map(y -> y + "\n")
						
				)
			.sorted(new Comparator<String>() {
				@Override public int compare(String a, String b) {
					return a.length() - b.length();
				}
			})
			.distinct()
			.collect(Collectors.toList());
						
	
	public static final BiFunction<List<String>, List<String>, List<String>>
		listConcat = (fList, sList) 
			-> Stream.concat(fList.stream(), sList.stream())
					.toList();
	
	public static final QuadFunction<Integer, Integer, Integer, Integer>
		glorifiedAdder = (x, y, z) -> x + y + z;
	
	
}




