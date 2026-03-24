package refactorMe;

/**
 * Rechteck mit width und height
 * 
 * Refactoring: Unnotiges entfernt, Konstruktor vereinfacht -> da extends Geometry
 * Sysout durch IllegalArgumentException ersetzt und Aussage besser formuliert
 * Saubere Kapselung -> getWidth getHeight
 */
public class Rectangle extends Geometry {

	private final double width;
	private final double height;

	protected Rectangle(int id, double width, double height, boolean filled, String color) throws IdException {
		super(id, filled, color);

		if (width < 0 || height < 0) {
			throw new IllegalArgumentException("Width and height must not be negative!");
		}
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
}