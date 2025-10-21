package wildcards;

public class PairBox<T, U> {

    private T first;
    private U second;

    public PairBox(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    // compareFirst mit Wildcard-Obergrenze
    public boolean compareFirst(PairBox<? extends Comparable<? super T>, ?> other) {
        // Sicherstellen, dass der eigene 'first'-Wert vergleichbar ist
        if (this.first instanceof Comparable<?>) {
            @SuppressWarnings("unchecked")
            Comparable<? super T> comparableFirst = (Comparable<? super T>) this.first;
            return comparableFirst.compareTo((T) other.getFirst()) == 0;
        } else {
            throw new IllegalArgumentException("First element is not comparable.");
        }
    }

  
}
