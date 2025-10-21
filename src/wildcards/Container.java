package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {

    private List<T> items;

    public Container() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Methode mit Obergrenze (? extends Number)
    public static double sumItems(Container<? extends Number> container) {
        double sum = 0.0;
        for (Number num : container.getItems()) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

   