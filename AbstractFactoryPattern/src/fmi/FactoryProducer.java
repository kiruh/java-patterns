package fmi;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		if(factory == "shape") {
			return new ShapeFactory();
		}
		if(factory == "color") {
			return new ColorFactory();
		}
		System.out.println("Unknown factory type");
		return null;
	}
}
