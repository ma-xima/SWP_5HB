package genericMethods;

public class FindMin {

    public static <T extends Comparable <T>> Object findMin(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

     public static void main(String[] args) {
         System.out.println(findMin (15, 1));
         System.out.println(findMin ("Dog", "Cat"));
     }
}
// alphabetisch geordnet:
// Da im Unicode 'D' nach 'C' kommt, ist das Ergebnis positiv (also größer als 0).