package generics;

public class Car {
	
	private String name;
	private Integer ps;
	public Car(String name, Integer ps) {
		super();
		this.name = name;
		this.ps = ps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPs() {
		return ps;
	}
	public void setPs(Integer ps) {
		this.ps = ps;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", ps=" + ps + "]";
	}
	
	

}
