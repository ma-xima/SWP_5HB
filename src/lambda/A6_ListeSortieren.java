package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A6_ListeSortieren {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Max", "Anna", "Clara", "Bernd");
        
        Comparator<String> comp = (a1, a2) -> Integer.compare(a1.length(), a2.length());

        // Liste aufsteigend sortieren  FALSCHHHHHHHHHHHHHHHHHHH!!!!!!!!!!!!!!!!!!!!!!!!!
        list.sort(comp);

        // Ausgabe
        System.out.println(list);
    }
}


