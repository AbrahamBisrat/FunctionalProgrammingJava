package function;

@FunctionalInterface public interface TriFunction<L, P, I, O> {
	O apply (L l, P p, I i);
}
