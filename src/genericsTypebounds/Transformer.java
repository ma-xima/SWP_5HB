package genericsTypebounds;

import java.util.ArrayList;
import java.util.function.Function;

public class Transformer<T extends Number, R> {
	public R transform (T value, Function<T,R>converter) {
		return converter.apply(value);
		
	}
	
    
}