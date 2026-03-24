package refactorMe;

/**
 * Square ist ein Rectangle mit width equals height -> side
 * 
 * Refactoring: unnötiges entfernt, Konstruktor vereinfacht -> da extends Geometry
 * statt width und height side -> besser
 * Prüfen ob width == height
 * Statt Sysout IllegalArgumentException
 * ergänzen von überprüfung ob side positiv ist wie bei width und height
 * Bessere Kapselung -> getSide
 */
public class Square extends Geometry {

	private final double side;

	protected Square(int id, double side, boolean filled, String color) throws IdException {
		super(id, filled, color);

		if (side < 0) {
			throw new IllegalArgumentException("Side must be non-negative!");
		}
		this.side = side;
	}

	protected Square(int id, double width, double height, boolean filled, String color) throws IdException {
		super(id, filled, color);

		if (width < 0 || height < 0) {
			throw new IllegalArgumentException("Width and height must be non-negative!");
		}
		if (width != height) {
			throw new IllegalArgumentException("Width and height must be equal for a square!");
		}
		this.side = width;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	public double getSide() {
		return side;
	}
}
