
package function;

public class Function {
	
	public static void main(String[] args) {

		// Function<T, R> 		---->> one input one output
		// T > Target
		// R > Result
		
//		Function<String, Integer> inc = x -> x.length();
		
		Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("mkyong");   // 6

        System.out.println(apply);
		
	}
}
