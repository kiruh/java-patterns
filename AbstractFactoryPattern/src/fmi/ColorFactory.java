package fmi;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color == "green") {
			return new Green();
		}
		if(color == "blue") {
			return new Blue();
		}
		System.out.println("Unknown color type");
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
