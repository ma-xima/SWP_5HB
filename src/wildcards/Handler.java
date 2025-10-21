package wildcards;

import java.util.List;
import java.util.ArrayList;

public class Handler<T> {

    private T value;

    public Handler(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Methode mit Untergrenze (? super T)
    public void addItems(List<? super T> list, T item) {
        list.add(item);
    }

}