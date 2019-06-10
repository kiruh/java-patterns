package fmi;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String expirationDate;

	public CreditCardStrategy(
			String name,
			String cardNumber,
			String cvv,
			String expirationDate
			) {
		
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expirationDate = expirationDate;
		
	}

	@Override
	public void pay(int amount) {
		System.out.println("CreditCard Payment: " + amount);
	}

}
