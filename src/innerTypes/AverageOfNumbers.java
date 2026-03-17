package innerTypes;
public class AverageOfNumbers {

    public static void main(String[] args) {
        int[] zahlen = {4, 8, 6, 10};
        calculateAverage(zahlen);
    }

    public static void calculateAverage(int[] numbers) {

        //Lokale innere Klasse
        class DurchschnittsBerechner {
            
            // Methode zum Berechnen des Durchschnitts
            public double berechne() {
                int summe = 0;

                for (int n : numbers) {
                    summe += n;
                }

                return (double) summe / numbers.length; //Summer aller Zahlen durch Anzahl der Zahlen
            }
        }

        // Instanz der lokalen Klasse erstellen
        DurchschnittsBerechner berechner = new DurchschnittsBerechner();

        // Durchschnitt berechnen
        double durchschnitt = berechner.berechne();

        // Ergebnis ausgeben
        System.out.println("Der Durchschnitt ist: " + durchschnitt);
    }
}
