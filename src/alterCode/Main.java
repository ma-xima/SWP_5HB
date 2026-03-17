package alterCode;
//GANZ SCHLECHTER CODE
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	String [][] feld = new String [10][10];
	/** 
	 * Erzeugt eine ganze Zufallszahl zwischen 0 <= zahl < anzahl
	 * @param anzahl beschreibt die Anzahl möglicher ganzer Zahlen
	 * @return die Zufallszahl
	 */
	private int zufallsInt(int anzahl) {
		// Math.random liefert Wert x: 0 <= x < 1
		double wert = Math.random();
		wert = wert * anzahl; // Wert x: 0 < x < 6
		int zahl = (int) wert;
		return zahl;
	}
	
	private void init() {
		for (int zeile = 0; zeile < 10; zeile++) {
			for (int spalte = 0; spalte < 10; spalte++) {
				feld [zeile][spalte] = " ";
			}
		}
	}
	boolean test(int zb, int ze, int sb, int se) {
		for (int z = zb; z <= ze; z++) {
			for (int s = sb; s <= se; s++) {
				if (feld[z][s].equals("o")){
					return false;
				}
			}
		}
		return true;
	}
	private boolean isHorizontalFrei(int inZeile, int inSpalte, int laenge) {
		// Beginn und Ende des Bereiches definieren
		int zb = inZeile - 1;
		int ze = inZeile + 1;
		int sb = inSpalte - 1;
		int se = inSpalte + laenge;
		// Fehlerfälle absichern
		if (zb < 0) zb = 0;
		if (sb < 0) sb = 0;
		if (ze > 9) ze = 9;
		if (se > 9) se = 9;
		// Funktion zum überprüfen des Bereiches aufrufen
		boolean istFrei = test(zb, ze, sb, se);
		return istFrei;
	}
	private boolean isVertikalFrei(int inZeile, int inSpalte, int laenge) {
		int zb = inZeile - 1;
		int ze = inZeile + laenge;
		int sb = inSpalte - 1;
		int se = inSpalte + 1;
		if (zb < 0) zb = 0;
		if (sb < 0) sb = 0;
		if (ze > 9) ze = 9;
		if (se > 9) se = 9;
		boolean istFrei = test(zb, ze, sb, se); 
		return istFrei;
	}
	private void platziereSchiffHorizontal(int laenge) {
		int inZeile;
		int inSpalte;
		boolean ok;
		do {
			inZeile = zufallsInt(10);
			inSpalte = zufallsInt(11-laenge); 
			ok = isHorizontalFrei(inZeile, inSpalte, laenge);
		}
		while (! ok);
		for (int i = 0; i < laenge; i++) {
			// Aenderung bei der Spalte
			feld[inZeile][inSpalte + i] = "o";
		}
	}
	private void platziereSchiffVertikal(int laenge) {
		int inZeile;
		int inSpalte;
		boolean ok;
		do {
			inZeile = zufallsInt(11-laenge);
			inSpalte = zufallsInt(10);
			ok = isVertikalFrei(inZeile, inSpalte, laenge);
		}
		while (! ok);
		for (int i = 0; i < laenge; i++) {
			// Aenderung bei der Zeile
			feld[inZeile+i][inSpalte]="o";
		}
		
	}
	private void platziereSchiff(int laenge) {
		int wert = zufallsInt(2);
		if (wert == 0) {
			platziereSchiffVertikal(laenge);
		}
		else {
			platziereSchiffHorizontal(laenge);
		}
	}
	private void platziereSchiffe() {
		// 4er Schiff
		platziereSchiff(4);
		// 2x3er Schiffe
		platziereSchiff(3);
		platziereSchiff(3);
		// 3x2er Schiff
		platziereSchiff(2);
		platziereSchiff(2);
		platziereSchiff(2);
	}
	public void ausgabe() {
		for (int i = 0; i < 11; i++) {
			System.out.print("+ - ");
		}
		System.out.println("+");
		//Zweite Zeile
		// | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 
		// Der Anfang
		System.out.print("|   ");
		for (int i = 0; i < 10; i++) {
			System.out.print("| " + i + " ");
			}
		// Das Ende
		System.out.println("|");
		for (int i = 0; i < 11; i++) {
			System.out.print("+ - ");
			}
		System.out.println("+");
		//Ausgabe des Feldes
		//Für jede Zeile
		for (int zeile = 0; zeile < 10; zeile++) {
			//Kopfteil der Zeile
			System.out.print("| " + zeile + " " );
			for (int spalte = 0; spalte < 10; spalte++) {
				String wert = feld [zeile][spalte];
				if (wert.equals("o")) { wert = " "; }
				System.out.print("| " + wert + " ");
			}
			System.out.println("|");
			for (int s = 0; s < 11; s++) {
				System.out.print("+ - ");
			}
			System.out.println("+");
		}
	}
	private String[] einlesen(Scanner sc) {
		String leseEin;
		String [] koordinaten;
		System.out.println("Bitte eine Zeile eingeben!");
		System.out.println("Bitte eine Spalte eingeben!");
		boolean notok = true;
		do {
			System.out.println("Eingabe:");
			leseEin = sc.nextLine();
			koordinaten = leseEin.split(";");
			if (koordinaten.length != 2) {
				System.err.println("Bitte 2 Zahlen mit ; getrennt eingeben!");
				continue; 
			}
			boolean fehler = false;
			for (int i = 0; i < 2; i++) {
				if (!(koordinaten[i].equalsIgnoreCase("0")||
					koordinaten[i].equalsIgnoreCase("1")||
					koordinaten[i].equalsIgnoreCase("2")||
					koordinaten[i].equalsIgnoreCase("3")||
					koordinaten[i].equalsIgnoreCase("4")||
					koordinaten[i].equalsIgnoreCase("5")||
					koordinaten[i].equalsIgnoreCase("6")||
					koordinaten[i].equalsIgnoreCase("7")||
					koordinaten[i].equalsIgnoreCase("8")||
					koordinaten[i].equalsIgnoreCase("9"))){
						System.err.println("Bitte nur Zahlen 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 eingeben!");
						fehler = true;
						break; 				
				}
			}
			if (!fehler) {
				notok = false;
			}
		}
		while (notok);
		return koordinaten;
	}	
	private void schuss(int z, int s) {
		if (feld[z][s].equals("o")) {
			feld[z][s] = "T";
			System.err.println("Schiffsteil getroffen!");
		}
		if (feld[z][s].equals(" ")) {
			feld[z][s] = "x";
			System.out.println("Leider nicht getroffen!!");
		}
	}
	public int zähleSchiffteile() {
		int anzahl = 0;
		for (int z = 0; z < 10; z++) {
			for (int s = 0; s < 10; s++) {
				if (feld[z][s].equals("o")) {
					anzahl++;
				}
			}
		}
		return anzahl;
	}
	public void schiffVersenkt() {
		
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Main spiel = new Main();
		spiel.init();
		spiel.platziereSchiffe();
		spiel.ausgabe();
		int dauerDesSpiels = spiel.zähleSchiffteile();
		while (dauerDesSpiels != 0) {
			String[] pos = spiel.einlesen(sc);
			int zeile = Integer.parseInt(pos[0]);
			int spalte = Integer.parseInt(pos[1]);
			spiel.schuss(zeile, spalte);
			spiel.ausgabe();
		}
		sc.close();
	}
}