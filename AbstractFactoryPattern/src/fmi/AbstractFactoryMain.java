package fmi;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		Shape triangle = shapeFactory.getShape("triangle");
		triangle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color blue = colorFactory.getColor("blue");
		blue.fill();
		
		Color green = colorFactory.getColor("green");
		green.fill();
		
	}

}
