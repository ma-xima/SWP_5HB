package innerClasses;

public class University {

    // Nicht-statische innere Klasse
    public class Student {
        public void showData(String name, int id) {
            System.out.println("Student: " + name);
            System.out.println("Matrikelnummer: " + id);
        }
    }

    public static void main(String[] args) {
        // Äußere Klasse instanzieren
        University uni = new University();

        // Innere Klasse instanzieren
        University.Student student = uni.new Student();

        // Daten ausgeben
        student.showData("Max Mustermann", 12345);
    }
}

