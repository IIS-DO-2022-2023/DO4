package observer3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CryptocurrencyPrice {
	private double bitcoinPrice;
	private double ethereumPrice;
	private PropertyChangeSupport pcs;

	public CryptocurrencyPrice() {
		pcs = new PropertyChangeSupport(this);
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		pcs.firePropertyChange("bitcoinPrice", this.bitcoinPrice, bitcoinPrice);
		this.bitcoinPrice = bitcoinPrice;
	}

	public void setEthereumPrice(double ethereumPrice) {
		pcs.firePropertyChange("ethereumPrice", this.ethereumPrice, ethereumPrice);
		this.ethereumPrice = ethereumPrice;
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		pcs.addPropertyChangeListener(pcl);

	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		pcs.removePropertyChangeListener(pcl);

	}

}
