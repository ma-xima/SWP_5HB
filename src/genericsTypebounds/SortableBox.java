package genericsTypebounds;

public class SortableBox <T extends Comparable<T>>{

    private final T first;
    private final T second;

    public SortableBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public boolean compareToOtherBox(SortableBox<T> sb) {
        return(this.first.compareTo(sb.getFirst())< 0);
    }


}
