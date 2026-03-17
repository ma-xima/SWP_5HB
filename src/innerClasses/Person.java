package innerClasses;

public class Person {

    // Privates Feld
    private String name;

    // Konstruktor
    public Person(String name) {
        this.name = name;
    }

    // Nicht-statische innere Klasse
    public class Details {
        public void showName() {
            // Zugriff auf private Variable der äußeren Klasse
            System.out.println("Name der Person: " + name);
        }
    }

    public static void main(String[] args) {
        // Äußere Klasse instanzieren
        Person person = new Person("Anna");

        // Innere Klasse instanzieren
        Person.Details details = person.new Details();

        // Methode aufrufen
        details.showName();
    }
}

