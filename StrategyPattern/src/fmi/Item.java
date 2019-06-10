package fmi;

public class Item {

	private String upc;
	private int cost;
	
	public Item(String upc, int cost) {
		this.upc = upc;
		this.cost = cost;
	}
	
	public String getUpc() {
		return this.upc;
	}
	public int getCost() {
		return this.cost;
	}

}
