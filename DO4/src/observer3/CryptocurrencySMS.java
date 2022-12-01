package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CryptocurrencySMS implements PropertyChangeListener {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("bitcoinPrice"))
			bitcoinPrice = (double) evt.getNewValue();

		if (evt.getPropertyName().equals("ethereumPrice"))
			ethereumPrice = (double) evt.getNewValue();

		sendSMS();
	}

	private void sendSMS() {
		System.out.println("Bitcoin price: " + bitcoinPrice);
		System.out.println("Ethereum price: " + ethereumPrice);
	}

}
