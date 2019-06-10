package fmi;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if(shape == "circle") {
			return new Circle();
		}
		if(shape == "triangle") {
			return new Triangle();
		}
		System.out.println("Unknown shape type");
		return null;
	}

}
