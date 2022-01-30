package function;

import java.util.List;
import java.util.function.*;

public class Functions {
    public static void main(String[] args) {
        String a = "Effective Java";
        String b = "Gang of four";
        String sizeTest = "abcdef"; // very creative
        
        List<String> list = List.of(
        	"potato",
        	"banana",
        	"apples",
        	"mango"
        );
        
        System.out.println("Function \t-> \t" + returnLen.apply("is this working?"));

        System.out.println("BiFunction \t-> \t" + returnCombinedLen.apply(a, b));
        
        System.out.println("Predicate \t-> \t" + sizeBelowTen.test(sizeTest));
        
        System.out.println("Dobule rand \t-> \t" + giveMeRandom.getAsDouble());
        
        addNameAtEnd.accept(list);
        
        System.out.println("Consumer \t-> \t" + list);
        
        modify.accept(list);
        
        System.out.println("Consumer mod \t-> \t" + list);
        
        System.out.println("\nDoubleFunctional");
        System.out.println(doubleFunc.apply(10));
        // 
    }

    static Function<String, Integer> returnLen = x -> x.length();

    static BiFunction<String, String, Integer> returnCombinedLen =
    				(x, y) -> x.length() + y.length();

    static Predicate<String> sizeBelowTen = word -> word.length() < 10;
    
    static DoubleSupplier giveMeRandom = Math::random;
    
    static Consumer<List<String>> addNameAtEnd = list -> // assignment
    	{
    		for(String each : list) {
    			each += " X";
    			System.out.println(each);
    		}
    	};
    	
    static Consumer<List<String>> modify = list -> 
    	{
//    		for(int i = 0; i < list.size(); i++)
//    			list.set(i, list.get(i) + " X");
    	};
    
    static DoubleFunction<Double> doubleFunc = x -> x + 0.23;
}
