package genericsTypebounds;

public class AnimalCage<T extends Animal> {

	private final Animal animal;
	
	public void getSound(Animal a) {
		a.sound();
	}

	public AnimalCage(Animal animal) {
		super();
		this.animal = animal;
	}

	public Animal getSound() {
		return animal;
	}
	
}
