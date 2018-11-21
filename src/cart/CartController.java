package cart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bill.BillController;
import bill.BillView;
import utility.Constants;



public class CartController {
	
	private CartView cartView;
	
	private float applePrice;
	private float dragonFruitPrice;
	private float grapesPrice;
	private float lycheePrice;
	private float mangoPrice;
	private float watermelonPrice;
	private static float totalPrice;
	
	public CartController(CartView cartView) {
		this.cartView = cartView;
		this.cartView.setVisible(true);
		onPurchaseButtonClicked();
	}
	
	/**
	 * Listener for Purchase Button
	 */
	public void onPurchaseButtonClicked() {
		cartView.getBtnPurchase().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					applePrice = (Float.parseFloat(cartView.getTextFieldApplePrice().getText()))*Constants.applePrice;
					dragonFruitPrice =(Float.parseFloat(cartView.getTextFieldDragonFruitPrice().getText()))*Constants.dragonFruitPrice;
					grapesPrice =(Float.parseFloat(cartView.getTextFieldGrapePrice().getText()))*Constants.grapesPrice;
					lycheePrice = (Float.parseFloat(cartView.getTextFieldLycheePrice().getText()))*Constants.lycheePrice;
					mangoPrice =( Float.parseFloat(cartView.getTextFieldMangoPrice().getText()))*Constants.mangoPrice;
					watermelonPrice = (Float.parseFloat(cartView.getTextFieldWatermelonPrice().getText()))*Constants.watermelonPrice;
					
					totalPrice = applePrice+dragonFruitPrice+grapesPrice+lycheePrice+mangoPrice+watermelonPrice;
					displayBill();
					cartView.dispose();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Display Bill Window
	 */
	public void displayBill() {
		BillView frame = new BillView();
		new BillController(frame);
	}
	
	/**
	 * Get total price of sale
	 * @return totatPrice
	 */
	public static float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}
