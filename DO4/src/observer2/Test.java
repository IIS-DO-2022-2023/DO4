package observer2;

public class Test {

	public static void main(String[] args) {
		CryptocurrencyPrice cryptocurrencyPrice = new CryptocurrencyPrice();
		CryptocurrencySMS cryptocurrencySMS = new CryptocurrencySMS();

		cryptocurrencyPrice.addObserver(cryptocurrencySMS);

		cryptocurrencyPrice.setBitcoinPrice(60000);
		cryptocurrencyPrice.setEthereumPrice(4000);

	}

}
