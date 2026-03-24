package refactorMe;
/**
 * Kreis mit Radius
 * Refactoring: Attribute die in der Oberklasse verwendet werden wurden entfernt -> nicht mehr notwendig hier
 * Fehrlerhafte id Prüfung entfernt
 * Exceptions anstatt Sysout-> bessere Fehlerbehandlung
 * Prüfen ob Radius unter 0 -> Fehlerverhinderung
 * 
 */
public class Circle extends Geometry {

	private double radius;

	protected Circle(int id, double radius, boolean filled, String color) throws IdException {
		super(id, filled, color);
		
		if (radius < 0) {
			throw new IllegalArgumentException("Radius less than zero!");
		}
		this.radius = radius;
	}


	public void setRadius(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius less than zero");
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


