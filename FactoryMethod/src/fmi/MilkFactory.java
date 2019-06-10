package fmi;

public class MilkFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {
		FarmProduct product = null;
		if(name == "CowMilk") {
			product = new CowMilk();
			product.setPrice(1.50);
		}
		if(name == "GoatMilk") {
			product = new GoatMilk();
			product.setPrice(1.70);
		}
		if(product == null) {
			System.out.println("Unknown Milk product: " + name);
		}
		return product;
	}

}
