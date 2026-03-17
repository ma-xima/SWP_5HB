package innerTypes;

import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        generatePassword(12);   // Bsp.: Passwort mit 12 Zeichen
    }

    public static void generatePassword(int length) {

        // Lokale innere Klasse
        class PasswortErsteller {

            private final String zeichen =
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                    "abcdefghijklmnopqrstuvwxyz" +
                    "0123456789" +
                    "!@#$%^&*()-_=+<>?/";

            private final Random random = new Random();

            public String generate() {
                StringBuilder passwort = new StringBuilder();

                for (int i = 0; i < length; i++) {
                    int index = random.nextInt(zeichen.length());
                    passwort.append(zeichen.charAt(index));
                }

                return passwort.toString();
            }
        }

        // Lokale Klasse instanzieren
        PasswortErsteller ersteller = new PasswortErsteller();

        // Passwort erzeugen
        String passwort = ersteller.generate();

        // Ausgabe
        System.out.println("Generiertes Passwort: " + passwort);
    }
}
