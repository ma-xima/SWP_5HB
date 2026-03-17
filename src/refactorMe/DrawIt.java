package refactorMe;



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
			System.out.println("The area of the object is: " + construction.getById(4).calculateArea());
		} catch (InvalidAccessException e1) {
			System.out.println(e1.getMessage());
		}

		System.out.println(construction.contains(unfilledRedCircle));
		try {
			construction.remove(unfilledRedCircle);
			System.out.println(construction.getById(4).calculateArea());
			System.out.println(construction.contains(unfilledRedCircle));
		} catch (InvalidAccessException e) {
			System.out.println(e.getMessage());
		}
	}
}

