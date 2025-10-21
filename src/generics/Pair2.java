package generics;

public class Pair2<T,U> {
	private final T first;
	private final U second;
	public Pair2 (final T first, final U second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst () {
		return this.first;
	}
	public U getSecond () {
		return this.second;
	}
	
}
