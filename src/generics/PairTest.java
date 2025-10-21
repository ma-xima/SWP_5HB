package generics;

public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=1;
		Integer i2=2;
		
		Pair iPair = new Pair (i1, i2);
		
		Double d1 = 1.1;
		Double d2 = 2.2;
		
		Pair dPair = new Pair(d1, d2);
		
		Car c1 = new Car("Volvo",200);
		Car c2 = new Car("BMW", 250);
		
		Pair cPair = new Pair(c1,c2);
		System.out.println(cPair.getFirst());
		
		
		Car c3 = (Car) cPair.getSecond(); //(Car)...Cast
		Pair icPair = new Pair (i1, c2); //Fehler!: ein Paar muss der selbe Datentyp sein 
		
		

	}

}
