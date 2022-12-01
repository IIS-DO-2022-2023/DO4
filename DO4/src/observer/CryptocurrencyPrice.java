package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CryptocurrencyPrice implements Observable {
	private double bitcoinPrice;
	private double ethereumPrice;
	private List<Observer> observers = new ArrayList<>();

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		notifyObservers();
	}

	public void setEthereumPrice(double ethereumPrice) {
		this.ethereumPrice = ethereumPrice;
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext())
			it.next().update(bitcoinPrice, ethereumPrice);
	}

}
