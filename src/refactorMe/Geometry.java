package refactorMe;



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

public class Geometry implements Comparable<Geometry> {
	private int id = -1;
	private boolean filled = false;
	private String color = "";
	private double width = 0;
	private double height = 0;

	public Geometry() {

	}

	protected Geometry(int id, boolean filled, String color) throws IdException {

		if (this.id == id) {
			throw new IdException("Id must be unique!");
		}
		this.id = id;
		this.filled = filled;
		this.color = color;
	}

	protected Geometry(int id, double width, double height, boolean filled, String color) throws IdException {
		if (this.id == id) {
			throw new IdException("Id must be unique!");
		}
		this.id = id;
		this.width = width;
		this.height = height;
		this.filled = filled;
		this.color = color;
	}

	public double calculateArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public int compareTo(Geometry c) {
		if (this.calculateArea() > c.calculateArea())
			return 1;
		else if (this.calculateArea() < c.calculateArea())
			return -1;
		else
			return 0;
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

