package innerTypes;

public class CountdownTimer {

    public static void main(String[] args) {
        startTimer(5);   // Bsp.: 5-Sekunden-Countdown
    }

    public static void startTimer(int sekunden) {

        // Lokale innere Klasse
        class Timer {

            public void start() {
                for (int i = sekunden; i > 0; i--) {
                    System.out.println("Noch " + i + " Sekunden ...");
                    try {
                        Thread.sleep(1000);  // 1 Sekunde warten
                    } catch (InterruptedException e) {
                        System.out.println("Timer wurde unterbrochen!");
                    }
                }
                System.out.println("Zeit abgelaufen!");
            }
        }

        // Instanz der lokalen Klasse erzeugen
        Timer timer = new Timer();

        // Countdown starten
        timer.start();
    }
}
