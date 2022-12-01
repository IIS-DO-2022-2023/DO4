package observer2;

import java.util.Observable;

public class CryptocurrencyPrice extends Observable {
	private double bitcoinPrice;
	private double ethereumPrice;

	public double getBitcoinPrice() {
		return bitcoinPrice;
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		setChanged();
		notifyObservers();
	}

	public double getEthereumPrice() {
		return ethereumPrice;
	}

	public void setEthereumPrice(double ethereumPrice) {
		this.ethereumPrice = ethereumPrice;
		setChanged();
		notifyObservers();
	}

}
