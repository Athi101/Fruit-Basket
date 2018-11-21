package bill;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BillView extends JFrame {

	private JPanel contentPane;
	private JLabel lblTotalPrice;

	/**
	 * Create the frame.
	 */
	public BillView() {
		initializeViews();
	}
	
	/**
	 * Initialize views
	 */
	public void initializeViews() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblTotalPrice = new JLabel();
		
		JLabel lblNewLabel = new JLabel("Price");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel)
					.addGap(108)
					.addComponent(lblTotalPrice)
					.addContainerGap(240, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(67)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotalPrice)
						.addComponent(lblNewLabel))
					.addContainerGap(184, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	// Getters and setters
	public JLabel getLblTotalPrice() {
		return lblTotalPrice;
	}

	public void setLblTotalPrice(JLabel lblTotalPrice) {
		this.lblTotalPrice = lblTotalPrice;
	}
	
}
