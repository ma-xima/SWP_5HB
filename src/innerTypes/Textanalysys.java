package innerTypes;

public class Textanalysys {

    public static void main(String[] args) {
        analyseText("HTL-Schüler lernen Java");
    }

    public static void analyseText(String text) {

        // Lokale innere Klasse
        class TextStatistic {

            // Wörter zählen
            public int countWords() {
                if (text == null || text.isBlank()) {
                    return 0;
                }
                // Wörter durch ein oder mehrere Leerzeichen getrennt
                String[] w = text.trim().split("\\s+");
                return w.length;
            }

            // Zeichen zählen (ohne Leerzeichen)
            public int countCharacters() {
                int count = 0;
                for (char c : text.toCharArray()) {
                    if (!Character.isWhitespace(c)) { 
                        count++;
                    }
                }
                return count;
            }
        }

        // Instanz der lokalen Klasse erzeugen
        TextStatistic stats = new TextStatistic();

        // Statistiken berechnen
        int wortAnzahl = stats.countWords();
        int zeichenAnzahl = stats.countCharacters();

        // Ausgabe
        System.out.println("Wörter: " + wortAnzahl);
        System.out.println("Zeichen: " + zeichenAnzahl);
    }
}

