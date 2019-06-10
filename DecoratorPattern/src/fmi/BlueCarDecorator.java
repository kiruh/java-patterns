package fmi;

public class BlueCarDecorator extends CarDecorator {

	public BlueCarDecorator(Car decoratedCar) {
		super(decoratedCar);
	}
	
	public void create() {
		decoratedCar.create();
		setBlueColor();
	}
	
	public void setBlueColor() {
		System.out.println("Setting color to blue");
	}

}
