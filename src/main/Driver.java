package main;

import java.awt.EventQueue;

import cart.CartController;
import cart.CartView;

public class Driver {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartView frame = new CartView();
					new CartController(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
