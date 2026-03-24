package refactorMe;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection von Geometrischen Objekten
 * Enthält Methoden add, remove, check containment, getById
 * 
 * Refactoring:t durch geometry ersetzt und bei jeder Methode einheitlich gestaltet
 * Anstatt Geometry auch sinnvoller T zu verwenden
 * contains ist unnötig -> da containsGeometry ist vorhanden ->wurde entfertnt
 * GetById vereinfacht, for ifs wurden durch bessere Lösung ersetzt -> zu viel Code 
 * 
 */
public class GeometryCollection<T extends Geometry> {
	private final List<T> container;

	
	public GeometryCollection() {
		container = new ArrayList<T>();
	}


	public void add(T geometry) {
		container.add(geometry);
	}

		public void remove(T geometry) {
		container.remove(geometry);
	}


	public boolean containsGeometry(T geometry) {
		return container.contains(geometry);
	}


	public T getById(final int id) throws InvalidAccessException {
		for (T geometry : container) {
			if (geometry.getId() == id) {
				return geometry;
			}
		}
		throw new InvalidAccessException("No geometry with ID " + id + " found.");
	}
}