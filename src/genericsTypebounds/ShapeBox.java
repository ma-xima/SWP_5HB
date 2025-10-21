package genericsTypebounds;

public class ShapeBox<T extends Shape> {

	private final Shape shape;
	
	public void drawShape(Shape s) {
		s.draw();
	}

	public ShapeBox(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}
	
}
