package innerClasses;

public class Mathematics {

    // Statische geschachtelte Klasse
    public static class Factorial {

        public int berechne(int n) {
            int ergebnis = 1;
            
            for (int i = 1; i <= n; i++) {
                ergebnis *= i;
            }

            return ergebnis;
        }
    }

    public static void main(String[] args) {
        // Objekt der geschachtelten Klasse erstellen
        Mathematics.Factorial f = new Mathematics.Factorial();

        // Fakultät: Zur Berechnung multipliziert man die Zahl mit allen kleineren positiven ganzen Zahlen bis eins. 
        // z.B.: (5!= 5 * 4 * 3 * 2 * 1= 120 )
        // Verschiedene Werte berechnen   
        System.out.println("Fakultät von 5: " + f.berechne(5));
        System.out.println("Fakultät von 7: " + f.berechne(7));
        System.out.println("Fakultät von 10: " + f.berechne(10));
    }
}

