package Main;

public class Car extends Vechicle {
	private Integer shifts;
	
	public Car(String color, Double topSpeed) {
	super(color, topSpeed);	
	};
	
	public Integer getShifits() {
		return this.shifts;
	}
	public void setShift(Integer shifts) {
		this.shifts = shifts;
	}
	
}
