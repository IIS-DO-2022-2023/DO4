package observer2;

import java.util.Observable;
import java.util.Observer;

public class CryptocurrencySMS implements Observer {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void update(Observable o, Object arg) {
		CryptocurrencyPrice cryptocurrencyPrice = (CryptocurrencyPrice) o;
		bitcoinPrice = cryptocurrencyPrice.getBitcoinPrice();
		ethereumPrice = cryptocurrencyPrice.getEthereumPrice();
		sendSMS();
	}

	private void sendSMS() {
		System.out.println("Bitcoin price: " + bitcoinPrice);
		System.out.println("Ethereum price: " + ethereumPrice);
	}

}
