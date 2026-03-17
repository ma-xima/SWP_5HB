package innerClasses;

public class Library {

    // Statisches Feld
    public static String name = "Stadtbibliothek";

    // Statische geschachtelte Klasse
    public static class Book {
        public void showLibrary() {
            System.out.println("Bibliothek: " + Library.name);
        }
    }

    public static void main(String[] args) {
        // Objekt der geschachtelten Klasse erstellen
        Library.Book book = new Library.Book();
        
        // Methode aufrufen
        book.showLibrary();
    }
}

