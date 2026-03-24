package refactorMe;

/*
 * Main-Klasse 
 * bessere Methodennamen und sinnvolle Ausgaben -> erkennen was eigentlich gefragt ist
 */
public class DrawIt {
	public static void main(String[] args) throws IdException {

		Geometry filledGreyRect = new Rectangle(1, 2, 6, true, "grey");
		Geometry unfilledBlueRect = new Rectangle(2, 8, 9, false, "blue");
		Geometry filledGreyCircle = new Circle(3, 3, true, "grey");
		Geometry unfilledRedCircle = new Circle(4, 3, false, "red");

		GeometryCollection<Geometry> construction = new GeometryCollection<Geometry>();

		construction.add(filledGreyRect);
		construction.add(unfilledBlueRect);
		construction.add(filledGreyCircle);
		construction.add(unfilledRedCircle);

		try {
		    Geometry geom = construction.getById(4);
		    System.out.println("1) Fläche des Objekts mit ID 4 (" + geom.getClass().getSimpleName() + "): " 
		                       + geom.calculateArea());
		} catch (InvalidAccessException e1) {
		    System.out.println("Fehler beim Zugriff auf Objekt mit ID 4: " + e1.getMessage());
		}

		// Prüfen, ob das rote, nicht gefüllte Kreis-Objekt in der Collection ist
		System.out.println("2) Ist das rote, nicht gefüllte Kreis-Objekt vorhanden? " 
		                   + construction.containsGeometry(unfilledRedCircle));

		try {
		    // Entfernen des roten Kreises
		    construction.remove(unfilledRedCircle);
		    System.out.println("3) Das rote Kreis-Objekt wurde entfernt.");

		    // Fläche eines anderen Objekts ausgeben
		    Geometry otherGeom = construction.getById(1);
		    System.out.println("4) Fläche des Objekts mit ID 1 (" + otherGeom.getClass().getSimpleName() + "): " 
		                       + otherGeom.calculateArea());

		    // Prüfen, ob das rote Kreis-Objekt jetzt noch vorhanden ist
		    System.out.println("5) Ist das rote, nicht gefüllte Kreis-Objekt noch vorhanden? " 
		                       + construction.containsGeometry(unfilledRedCircle));
		} catch (InvalidAccessException e) {
		    System.out.println("Fehler: " + e.getMessage());
		}
	}
}

