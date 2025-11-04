package genericMethods;

import java.util.Arrays;
import java.util.List;

public class GenericMethods_Test {
	
 // Aufgabe 1: Umkehrung eines Arrays
      public static <T> T[] reverseArray(T[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                T temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            return array;
        } 
  // Aufgabe 2: Finden des Minimums    
      public static <T extends Comparable <T>> Object findMin(T a, T b) {
          return a.compareTo(b) < 0 ? a : b;
      }
      
  // Aufgabe 3: Zählung von Elementen
      public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
	        int temp = 0;
	        for (T item : array) {
	            if (item.compareTo(element) > 0) {
	                temp++;
	            }
	        }
	        return temp;
	    }
      
  // Aufgabe 4: Anzeigen von Listen
      public static void printList(List<?> list) {
          System.out.println(list);
      }
      
      public static void main(String[] args) {
    	  //A1
    	  Integer[] intArray = {1, 2, 3, 4};
    	  String[] stringArray = {"A", "B", "C"};
          System.out.println(Arrays.toString(reverseArray(intArray)));
          System.out.println(Arrays.toString(reverseArray(stringArray)));
          //A2
          System.out.println(findMin (15, 1));
          System.out.println(findMin ("Dog", "Cat"));
          //A3
          Integer[] numbers = {1, 3, 5, 7, 9};
          System.out.println(countGreaterThan(numbers, 4));
          //A4
          List<String> stringList = Arrays.asList("One", "Two", "Three");
          List<Integer> intList = Arrays.asList(1, 2, 3);
          printList(stringList);
          printList(intList);
      }
      
      
}
