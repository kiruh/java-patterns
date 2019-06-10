package fmi;

public class FactoryMethodMain {

	public static void main(String[] args) {

		CheeseFactory cheeseFactory = new CheeseFactory();
		
		FarmProduct cowCheese = cheeseFactory.produceProduct("CowCheese");
		System.out.println("Cow Cheese price: " + cowCheese.getPrice());
		FarmProduct goatCheese = cheeseFactory.produceProduct("GoatCheese");
		System.out.println("Goat Cheese price: " + goatCheese.getPrice());

		MilkFactory milkFactory = new MilkFactory();
		
		FarmProduct cowMilk = milkFactory.produceProduct("CowMilk");
		FarmProduct goatMilk = milkFactory.produceProduct("GoatMilk");

	}

}
