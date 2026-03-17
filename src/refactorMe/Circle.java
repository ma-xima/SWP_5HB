package refactorMe;



/**
 * Stellt einen Kreis dar.
 * 
 * Refactoring:
 * - Redundante Felder (id, filled, color) entfernt, da sie schon in Geometry sind
 */
public class Circle extends Geometry {

	private double radius;

	/**
	 * Erstellt einen Kreis.
	 * 
	 * Refactoring: Validierung des Radius VOR super().
	 * Ungültige Werte führen sofort zu einem Fehler.
	 */
	protected Circle(int id, double radius, boolean filled, String color) throws IdException {
		super(id, filled, color);
		
		if (radius < 0) {
			throw new IllegalArgumentException("Radius less than zero not allowed!");
		}
		this.radius = radius;
	}

	/**
	 * Setzt den Radius.
	 * 
	 * Refactoring: Validierung hinzugefügt statt nur zu drucken.
	 * Negative Werte werden mit Exception verhindert.
	 */
	public void setRadius(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius less than zero not allowed!");
		}
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

}


