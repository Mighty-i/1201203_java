package lect11;

public class Le11Car {
	int plate;
	String model;
	String make;
	public Le11Car(int plate, String model, String make) {
		this.plate = plate;
		this.model = model;
		this.make = make;
	}
	public String toString() {
		return "plate:" + plate +", model:" + model +", make:" + make;
	}
}
