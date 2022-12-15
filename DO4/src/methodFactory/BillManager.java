package methodFactory;

public class BillManager {
	private Bill bill;
	private BillFactory billFactory;

	public BillManager(BillFactory billFactory) {
		this.billFactory = billFactory;
	}

	public void processBill(String type) {
		billFactory.createBill(type);

		// dodatna implementacija koja zavisi od racuna

		bill.calculateTotal();
		bill.pay();
	}

}
