package fmi;

public class CheeseFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {

		FarmProduct product = null;
		if(name == "GoatCheese") {
			product = new GoatCheese();
			product.setPrice(3.50);
		}
		if(name == "CowCheese") {
			product = new CowCheese();
			product.setPrice(2.50);
		}
		if(product == null) {
			System.out.println("Unknown Cheese product: " + name);
		}
		return product;
	}

}
