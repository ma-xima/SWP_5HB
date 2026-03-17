package refactorMe;



import java.util.ArrayList;
import java.util.List;

public class GeometryCollection<T extends Geometry> {
	private final List<T> container;

	public GeometryCollection() {
		container = new ArrayList<T>();
	}

	public void add(T t) {
		container.add(t);
	}

	public void remove(T t) {
		container.remove(t);
	}

	public boolean contains(T t) {
		return container.contains(t);
	}

	public boolean containsGeometry(Geometry geom) {
		return container.contains(geom);
	}

	public T getById(final int id) throws InvalidAccessException {
		T element = null;
		for (T t : container) {
			if (t.getId() == id) {
				element = t;
				break;
			}
		}

		if (element == null) {
			throw new InvalidAccessException("No such element.");
		}

		return element;
	}
}

// Exceptions werfen