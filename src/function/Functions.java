package function;

import java.util.function.*;

public class Functions {
    public static void main(String[] args) {
        String a = "Effective Java";
        String b = "Gang of four";
        String sizeTest = "abcdef"; // very creative
        
        System.out.println("Function \t: \t" + returnLen.apply("is this working?"));

        System.out.println("BiFunction \t: \t" + returnCombinedLen.apply(a, b));
        
        System.out.println("Predicate \t: \t" + sizeBelowTen.test(sizeTest));
        
        System.out.println("Dobule rand \t : \t" + giveMeRandom.getAsDouble());
        
        
        // 
    }

    static Function<String, Integer> returnLen = x -> x.length();

    static BiFunction<String, String, Integer> returnCombinedLen =
    				(x, y) -> x.length() + y.length();

    static Predicate<String> sizeBelowTen = word -> word.length() < 10;
    
    static DoubleSupplier giveMeRandom = Math::random;
    
}
