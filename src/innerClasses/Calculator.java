package innerClasses;

public class Calculator {
    
    // Statische geschachtelte Klasse
    public static class Addition {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        // Objekt der geschachtelten Klasse erzeugen
        Calculator.Addition addition = new Calculator.Addition();
        
        // Methode aufrufen
        int result = addition.add(5, 7);
        
        // Ergebnis ausgeben
        System.out.println("Das Ergebnis ist: " + result);
    }
}
