package bill;

import cart.CartController;

public class BillController {
	
	private BillView billView;
	
	public BillController(BillView billView) {
		this.billView = billView;
		this.billView.setVisible(true);
		setPrice();
	}
	
	/**
	 * Display total price
	 */
	private void setPrice() {
		billView.getLblTotalPrice().setText(String.valueOf(CartController.getTotalPrice()));
	}
	
}
