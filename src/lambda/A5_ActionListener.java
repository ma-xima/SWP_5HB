package lambda;

import java.awt.event.ActionListener;
   
public class A5_ActionListener {
	public static void main(String[] args) {
        ActionListener listener = e -> System.out.println("Button clicked!");

        // Klick simulieren
        listener.actionPerformed(null);
    }
}
