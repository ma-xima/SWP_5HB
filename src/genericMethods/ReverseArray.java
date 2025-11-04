package genericMethods;

import java.util.Arrays;

public class ReverseArray {
    static Integer[] intArray = {1, 2, 3, 4};
    static String[] stringArray = {"A", "B", "C"};

      public static <T> T[] reverseArray(T[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                T temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            return array;
        } 
     public static void main(String[] args) {
         System.out.println(Arrays.toString(reverseArray(intArray)));
         System.out.println(Arrays.toString(reverseArray(stringArray)));
     }
}