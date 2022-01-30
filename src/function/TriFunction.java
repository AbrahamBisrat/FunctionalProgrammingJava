package function;

@FunctionalInterface public interface TriFunction<L, P, I, OL> {
	OL apply (L l, P p, I i);
}
