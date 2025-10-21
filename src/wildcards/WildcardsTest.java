package wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardsTest {

	//Aufgabe 1
    public static boolean compareBoxes(Box<?> box1, Box<?> box2) {
        return box1.getValue().equals(box2.getValue());
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        Box<String> stringBox = new Box<>("10");
        Box<Integer> anotherIntBox = new Box<>(10);

        System.out.println(compareBoxes(intBox, anotherIntBox)); // true
        System.out.println(compareBoxes(intBox, stringBox));     // false
    
    
    //Aufgabe 2
   
        Container<Integer> intContainer = new Container<>();
        intContainer.addItem(10);
        intContainer.addItem(20);
        intContainer.addItem(30);

        Container<Double> doubleContainer = new Container<>();
        doubleContainer.addItem(5.5);
        doubleContainer.addItem(2.3);

        System.out.println("Summe (Integer): " + Container.sumItems(intContainer));
        System.out.println("Summe (Double): " + Container.sumItems(doubleContainer));
       
    //Aufgabe 3
        
        Handler<Integer> intHandler = new Handler<>(42);

        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        // Beide funktionieren, weil Number und Object Oberklassen von Integer sind
        intHandler.addItems(numberList, 10);
        intHandler.addItems(objectList, 99);

        System.out.println("Number-Liste: " + numberList);
        System.out.println("Object-Liste: " + objectList);
        
    //Aufgabe 4
   
        PairBox<Integer, String> p1 = new PairBox<>(10, "A");
        PairBox<Integer, String> p2 = new PairBox<>(10, "B");
        PairBox<Integer, String> p3 = new PairBox<>(20, "C");

        System.out.println("p1 == p2 ? " + p1.compareFirst(p2)); // true
        System.out.println("p1 == p3 ? " + p1.compareFirst(p3)); // false

        PairBox<String, Double> s1 = new PairBox<>("Alpha", 1.1);
        PairBox<String, Double> s2 = new PairBox<>("Alpha", 2.2);
        PairBox<String, Double> s3 = new PairBox<>("Beta", 3.3);

        System.out.println("s1 == s2 ? " + s1.compareFirst(s2)); // true
        System.out.println("s1 == s3 ? " + s1.compareFirst(s3)); // false
    
    }
}
 
