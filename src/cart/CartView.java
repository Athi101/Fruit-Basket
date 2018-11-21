package cart;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class CartView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldApplePrice;
	private JTextField textFieldDragonFruitPrice;
	private JTextField textFieldGrapePrice;
	private JTextField textFieldLycheePrice;
	private JTextField textFieldMangoPrice;
	private JTextField textFieldWatermelonPrice;
	private JLabel lblWatermelon;
	private JLabel lblMango;
	private JLabel lblLychee;
	private JLabel lblApple;
	private JLabel lblDragonFruit;
	private JLabel lblGrapes;
	private JButton btnPurchase;
	private BufferedImage appleImage;
	private BufferedImage dragonFruitImage;
	private BufferedImage grapesImage;
	private BufferedImage lycheeImage;
	private BufferedImage mangoImage;
	private BufferedImage watermelonImage;
	
	/**
	 * instantiate BufferedImage objects
	 */
	public void addBufferedImages() {
		try {
				
			appleImage = ImageIO.read(this.getClass().getClassLoader().getResource("resources/apple_100x100.png"));
			dragonFruitImage = ImageIO.read(this.getClass().getClassLoader().getResource("resources/dragonFruit_100x100.jpg"));
			grapesImage = ImageIO.read(this.getClass().getClassLoader().getResource("resources/grapes_100x100.jpg"));
			lycheeImage = ImageIO.read(this.getClass().getClassLoader().getResource("resources/lychee_100x100.jpg"));
			mangoImage = ImageIO.read(this.getClass().getClassLoader().getResource("resources/mango_100x100.jpg"));
			watermelonImage = ImageIO.read(this.getClass().getClassLoader().getResource("resources/watermelon_100x100.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the frame.
	 */
	public CartView() {
		addBufferedImages();
		initializeViews();
	}
	
	/**
	 * Initialize views
	 */
	public void initializeViews() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnAbout.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JSeparator separator = new JSeparator();
		
		btnPurchase = new JButton("Purchase");

		lblApple = new JLabel(new ImageIcon(appleImage));
		
		lblDragonFruit = new JLabel(new ImageIcon(dragonFruitImage));
		
		lblGrapes = new JLabel(new ImageIcon(grapesImage));
		
		lblLychee = new JLabel(new ImageIcon(lycheeImage));
		
		lblMango = new JLabel(new ImageIcon(mangoImage));
		
		lblWatermelon = new JLabel(new ImageIcon(watermelonImage));
		
		textFieldApplePrice = new JTextField();
		textFieldApplePrice.setColumns(10);
		
		textFieldDragonFruitPrice = new JTextField();
		textFieldDragonFruitPrice.setColumns(10);
		
		textFieldGrapePrice = new JTextField();
		textFieldGrapePrice.setColumns(10);
		
		textFieldLycheePrice = new JTextField();
		textFieldLycheePrice.setColumns(10);
		
		textFieldMangoPrice = new JTextField();
		textFieldMangoPrice.setColumns(10);
		
		textFieldWatermelonPrice = new JTextField();
		textFieldWatermelonPrice.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblApple)
						.addComponent(lblDragonFruit)
						.addComponent(lblGrapes))
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldApplePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDragonFruitPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldGrapePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(63)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLychee)
						.addComponent(lblMango)
						.addComponent(lblWatermelon))
					.addGap(61)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldWatermelonPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldMangoPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldLycheePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(86, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(475, Short.MAX_VALUE)
					.addComponent(btnPurchase)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblApple)
								.addComponent(textFieldApplePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(67)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDragonFruit)
								.addComponent(textFieldDragonFruitPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGrapes)
								.addComponent(textFieldGrapePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(89)
							.addComponent(btnPurchase)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLychee)
						.addComponent(textFieldLycheePrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(67)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMango)
						.addComponent(textFieldMangoPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWatermelon)
						.addComponent(textFieldWatermelonPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(89))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	// Getters and Setters
	
	public JTextField getTextFieldApplePrice() {
		return textFieldApplePrice;
	}

	public void setTextFieldApplePrice(JTextField textFieldApplePrice) {
		this.textFieldApplePrice = textFieldApplePrice;
	}

	public JTextField getTextFieldDragonFruitPrice() {
		return textFieldDragonFruitPrice;
	}

	public void setTextFieldDragonFruitPrice(JTextField textFieldDragonFruitPrice) {
		this.textFieldDragonFruitPrice = textFieldDragonFruitPrice;
	}

	public JTextField getTextFieldGrapePrice() {
		return textFieldGrapePrice;
	}

	public void setTextFieldGrapePrice(JTextField textFieldGrapePrice) {
		this.textFieldGrapePrice = textFieldGrapePrice;
	}

	public JTextField getTextFieldLycheePrice() {
		return textFieldLycheePrice;
	}

	public void setTextFieldLycheePrice(JTextField textFieldLycheePrice) {
		this.textFieldLycheePrice = textFieldLycheePrice;
	}

	public JTextField getTextFieldMangoPrice() {
		return textFieldMangoPrice;
	}

	public void setTextFieldMangoPrice(JTextField textFieldMangoPrice) {
		this.textFieldMangoPrice = textFieldMangoPrice;
	}

	public JTextField getTextFieldWatermelonPrice() {
		return textFieldWatermelonPrice;
	}

	public void setTextFieldWatermelonPrice(JTextField textFieldWatermelonPrice) {
		this.textFieldWatermelonPrice = textFieldWatermelonPrice;
	}

	public JLabel getLblWatermelon() {
		return lblWatermelon;
	}

	public void setLblWatermelon(JLabel lblWatermelon) {
		this.lblWatermelon = lblWatermelon;
	}

	public JLabel getLblMango() {
		return lblMango;
	}

	public void setLblMango(JLabel lblMango) {
		this.lblMango = lblMango;
	}

	public JLabel getLblLychee() {
		return lblLychee;
	}

	public void setLblLychee(JLabel lblLychee) {
		this.lblLychee = lblLychee;
	}

	public JLabel getLblApple() {
		return lblApple;
	}

	public void setLblApple(JLabel lblApple) {
		this.lblApple = lblApple;
	}

	public JLabel getLblDragonFruit() {
		return lblDragonFruit;
	}

	public void setLblDragonFruit(JLabel lblDragonFruit) {
		this.lblDragonFruit = lblDragonFruit;
	}

	public JLabel getLblGrapes() {
		return lblGrapes;
	}

	public void setLblGrapes(JLabel lblGrapes) {
		this.lblGrapes = lblGrapes;
	}

	public JButton getBtnPurchase() {
		return btnPurchase;
	}

	public void setBtnPurchase(JButton btnPurchase) {
		this.btnPurchase = btnPurchase;
	}
	

}
