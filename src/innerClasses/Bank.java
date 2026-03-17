package innerClasses;

public class Bank {

    // Privates Feld
    private double balance;

    // Konstruktor zur Initialisierung
    public Bank() {
        this.balance = 1000.0;
    }

    // Methode der äußeren Klasse
    public void showBalance() {
        System.out.println("Aktueller Kontostand: " + balance);
    }

    // Nicht-statische innere Klasse
    public class Account {
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;  // Zugriff auf private Variable der äußeren Klasse
            }
        }
    }

    public static void main(String[] args) {
        // Äußere Klasse instanzieren
        Bank bank = new Bank();

        // Innere Klasse instanzieren
        Bank.Account account = bank.new Account();

        // Einzahlen
        account.deposit(250.0);

        // Neuen Kontostand anzeigen
        bank.showBalance();
    }
}
