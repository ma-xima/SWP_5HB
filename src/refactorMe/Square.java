package refactorMe;



public class Square extends Geometry {

	private int id = -1;
	private final double width;
	private final double height;

	protected Square(int id, double width, double height, boolean filled, String color) throws IdException {
		super(id, width, height, filled, color);

		if (width < 0 || height < 0) {
			System.out.println("Value less than zero not allowed!");
		}
		this.id = id;
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
	
	//Exception werfen

}
