package generics;

public class GenericTest1 {
	//Pair
	private static void printPair2 (final Pair2<Integer, String> i) {
		System.out.println(i.getFirst() + " " + i.getSecond()); }
	//Triplet	
	private static void printTriplet (final Triplet<String, Integer, Double> t) {
		System.out.println(t.getFirst() + " : " + t.getSecond() + " :  " + t.getThird());
	

	}
	public static void main (final String[] args) {
		//Aufgabe Pair
		final Pair2<Integer, String> p = new Pair2<Integer, String>(1, "Hallo");
		GenericTest1.printPair2 (p);
		
		//Aufgabe Box
		Box<String> stringBox = new Box<>();
		stringBox.setValue("Hello");
		System.out.println(stringBox.getValue());
		
		Box<Integer> intBox = new Box <>();
		intBox.setValue(12);
		System.out.println(intBox.getValue());
		
		Box<Double> dobBox = new Box <>();
		dobBox.setValue(12.45);
		System.out.println(dobBox.getValue());
		
		//Aufgabe Triplet
		final Triplet<String,Integer,Double> t1 = new Triplet<>("Triplet", 1, 2.33);
		GenericTest1.printTriplet (t1);
		
		
	}

}
