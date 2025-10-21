package generics;

public class Pair {
	private final Object first;
	private final Object second;
	
	public Pair(final Object first, final Object second) {
		this.first = first;
		this.second = second;
	}
	
	public Object getFirst() {
		return this.first;
	}
	
	public Object getSecond() {
		return this.second;
	}

}
