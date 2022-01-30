package function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomInterfaceTester{	

	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>() {
			{
				add("wallE");
				add("I am legend");
				add("Back to the Future");
				add("i Robot");
				add("Matrix triology");
				add("some other movies");
				add("my hands are typing");
				add("you could have");
				add("a list of movies");
				add("from the internet");
				add("and yet here we are ");
				add("typing movie names in");
			}
		};
		
		System.out.println(trio.apply(names, 1, 2));
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
}
