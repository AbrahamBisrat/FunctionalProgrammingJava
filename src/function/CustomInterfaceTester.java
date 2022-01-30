package function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

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
			}
		};
		
		
		
		System.out.println(trio.apply(movies, 1, 2));
		
		System.out.println(
				addLen.apply(movies.get(2), movies.get(movies.size() - 1)));
		
		System.out.println(onlyInOne.apply(movies, numbers));
		
		
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
		onlyInOne = (firstList, secondList) 
			-> firstList.stream()
						.filter(x -> !secondList.contains(x))
//						.filter(y -> !firstList.contains(y))
						.map(x -> x + "\n")
						.collect(Collectors.toList());
	public static final 
}
