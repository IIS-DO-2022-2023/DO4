package observer;

public class CryptocurrencySMS implements Observer {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void update(double bitcoinPrice, double ethereumPrice) {
		this.bitcoinPrice = bitcoinPrice;
		this.ethereumPrice = ethereumPrice;
		sendSMS();

	}

	private void sendSMS() {
		System.out.println("Bitcoin price: " + bitcoinPrice);
		System.out.println("Ethereum price: " + ethereumPrice);
	}

}
