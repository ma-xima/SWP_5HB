package genericsTypebounds;

import java.util.ArrayList;

public class TestGenericTestbounds1 <T>{

    public static void main(String[] args) {
        //Aufgabe 1 ????
         SortableBox<Integer> b = new SortableBox(1, 2);
         SortableBox<Integer> b1 = new SortableBox(5, 2);
         System.out.println(b.compareToOtherBox(b1));

         SortableBox<Double> b2 = new SortableBox(1.1, 2.2);
         System.out.println(b2.compareToOtherBox(b2));
         
         //Aufgabe 2 -HÜ
         Circle c1 = new Circle();
 		 Rectangle r1 = new Rectangle();
 		 ShapeBox<Circle> sb1 = new ShapeBox<Circle>(c1);
 		 ShapeBox<Rectangle> sb2 = new ShapeBox<Rectangle>(r1);
 		
 		 sb1.drawShape(c1);
 		 sb2.drawShape(r1);
 		 
 		 //Aufgabe 3
 		 
 		 Cat ca1 = new Cat();
 		 Dog do1 = new Dog();
 		 AnimalCage<Cat> ac1 = new AnimalCage<Cat>(ca1);
 		 AnimalCage<Dog> ac2 = new AnimalCage<Dog>(do1);
 		 
 		 ac1.getSound(ca1);
 		 ac2.getSound(do1);
 		 
 		 //Aufgabe 4
 		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(12);

        ListBox<Integer> l1 = new ListBox<Integer>(list);
        l1.sumElements();
        
        //Aufgabe 5
          Transformer<Integer,String> intToString = new Transformer<>();
          String result = intToString.transform(42,  Object :: toString);
          Transformer<Double,Integer> dti = new Transformer<>();
          Integer iResult = dti.transform(3.14,Double::intValue);
    }
}
