package refactorMe;

/**
 * Abstrakte Klasse für geometrische Formen
 * Enthält id, filled status, color
 * 
 * Refactoring: Klasse abstrakt gemacht -> macht mehr Sinn
 * Unnötigee Attribute entfernt -> width und hight werden in Subklasse behandelt
 * Konstruktor vereinfacht -> Kürzerer Code
 * Fläche und Umfang abstrakt -> von Subklassen iplementiert
 * ID-Prüfung entfernt -> sinnlos
 * bessere Beschriftung -> c other
 * Bei compareTo if else entfert und ein Double.compare
 * bessere ordentliche Struktur
 */
class IdException extends Exception {

	private static final long serialVersionUID = 1L;

	public IdException(String message) {
		super(message);
	}
}

class InvalidAccessException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAccessException(String message) {
		super(message);
	}
}

public abstract class Geometry implements Comparable<Geometry> {
	private int id;
	private boolean filled;
	private String color;

	public Geometry() {

	}

	protected Geometry(int id, boolean filled, String color) throws IdException {
		this.id = id;
		this.filled = filled;
		this.color = color;
	}

	protected Geometry(int id, double width, double height, boolean filled, String color) throws IdException {
		this(id, filled, color);
	}

	public abstract double calculateArea();

	public abstract double getPerimeter();

	@Override
	public int compareTo(Geometry other) {
		return Double.compare(this.calculateArea(), other.calculateArea());
	}

	public String getColor() {
		return color;
	}

	public int getId() {
		return id;
	}

	public boolean isFilled() {
		return filled;
	}
}

