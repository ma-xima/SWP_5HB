package lambda;

import java.util.Random;
import java.util.function.Consumer;

public class A3_Consumer {
	public static void main(String[] args) {
		 Consumer<String> capitalConsumer = (str) -> {
	            String gross = str.toUpperCase();
	            System.out.println(gross);
	        };
	        capitalConsumer.accept("Hallo!"); 
	        capitalConsumer.accept("Das ist groﬂgeschrieben."); 
	    }
	}


