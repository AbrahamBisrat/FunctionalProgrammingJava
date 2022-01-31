package function;

@FunctionalInterface public interface QuadFunction<S, T, U, R>{
	R apply(S s, T t, U u);
}
