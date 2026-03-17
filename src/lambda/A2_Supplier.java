package lambda;

import java.util.Random;
import java.util.function.Supplier;

public class A2_Supplier<T> {
	public static void main(String[] args) {
		  Supplier<Integer> randomSupplier = () -> new Random().nextInt(100) + 1;
		  
	      System.out.println(randomSupplier.get());
	      System.out.println(randomSupplier.get());
	      System.out.println(randomSupplier.get());
	}
}