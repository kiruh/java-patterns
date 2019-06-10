package fmi;

public class StrategyMain {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("23i838", 5);
		Item item2 = new Item("axd231", 10);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new PaypalStrategy("ivan@abv.bg", "123"));
		
		cart.pay(new CreditCardStrategy(
			"Ivan Ivanov",
			"2376 2372 2111 1234",
			"262",
			"12/09"
		));

	}

}
