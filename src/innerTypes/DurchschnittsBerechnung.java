package innerTypes;
//Lehrerversion von Aufgabe AverageOfNumbers   
public class DurchschnittsBerechnung {

    public static void berechneDurchschnitt(int[] zahlen) {
        class DurchschnittsBerechner {
            public double berechne() {
                int summe = 0;
                for (int zahl : zahlen) {
                    summe += zahl;
                }
                return (double) summe / zahlen.length;
            }
        }

        DurchschnittsBerechner berechner = new DurchschnittsBerechner();
        System.out.println("Durchschnitt: " + berechner.berechne());
    }

    public static void main(String[] args) {
        int[] zahlen = {10, 20, 30, 40};
        berechneDurchschnitt(zahlen);
    }
}
 
