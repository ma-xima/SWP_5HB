package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A4_Comparator<T> {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Laura", "Matthäus", "Philipp", "Maxi");

        // Comparator als Lambda-Ausdruck (nach Länge)
        Comparator<String> comp = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        // Liste aufsteigend sortieren
        list.sort(comp);

        // Ausgabe
        System.out.println(list);
    }
}
