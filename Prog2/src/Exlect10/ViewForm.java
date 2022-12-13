package Exlect10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewForm extends JDialog implements ActionListener {

	private static final int width = 400;
	private static final int height = 200;

	JTextField idTxt;
//	JTextField nameTxt;
//	JTextField DescriptionTxt;
//	JTextField priceTxt;
//	JTextField stockTxt;

	private static final String viewString = "view";
	private static final String cancelString = "cancel";

	public ViewForm(JFrame frame) {
		super(frame, true);

		// Create pane as container
		Container pane = getContentPane();
		// set layout manager to manual
		pane.setLayout(null);

		// create labels
		JLabel viewformlabel = new JLabel("View Goods");
		JLabel idLabel = new JLabel("ID");
//		JLabel nameLabel = new JLabel("Name");
//		JLabel DescriptionLabel = new JLabel("Description");
//		JLabel priceLabel = new JLabel("Price");
//		JLabel stockLabel = new JLabel("Stock");

		// create buttons
		JButton viewBtn = new JButton(viewString);
		JButton cancelBtn = new JButton(cancelString);

		// create texts
		idTxt = new JTextField(10);
//		nameTxt = new JTextField(20);
//		DescriptionTxt = new JTextField(15);
//		priceTxt = new JTextField(10);
//		stockTxt = new JTextField(10);

		// create control buttons.
		viewBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

		// add labels
		pane.add(viewformlabel);
		pane.add(idLabel);
//		pane.add(nameLabel);
//		pane.add(DescriptionLabel);
//		pane.add(priceLabel);
//		pane.add(stockLabel);

		// add text fields
		pane.add(idTxt);
//		pane.add(nameTxt);
//		pane.add(DescriptionTxt);
//		pane.add(priceTxt);
//		pane.add(stockTxt);

		// add control buttons
		pane.add(viewBtn);
		pane.add(cancelBtn);

		// set sizes and positions for labels
		Dimension size = viewformlabel.getPreferredSize();
		viewformlabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
		size = idLabel.getPreferredSize();
		idLabel.setBounds(137, 45, size.width, size.height);
//		size = nameLabel.getPreferredSize();
//		nameLabel.setBounds(10, 50, size.width, size.height);
//		size = DescriptionLabel.getPreferredSize();
//		DescriptionLabel.setBounds(10, 80, size.width, size.height);
//		size = priceLabel.getPreferredSize();
//		priceLabel.setBounds(10, 110, size.width, size.height);
//		size = stockLabel.getPreferredSize();
//		stockLabel.setBounds(10, 140, size.width, size.height);

		// set sizes and positions for labels
		size = idTxt.getPreferredSize();
		idTxt.setBounds(158, 42, size.width, size.height);
//		size = nameTxt.getPreferredSize();
//		nameTxt.setBounds(80, 50, size.width, size.height);
//		size = DescriptionTxt.getPreferredSize();
//		DescriptionTxt.setBounds(80, 80, size.width, size.height);
//		size = priceTxt.getPreferredSize();
//		priceTxt.setBounds(80, 110, size.width, size.height);
//		size = stockTxt.getPreferredSize();
//		stockTxt.setBounds(80, 140, size.width, size.height);

		// set sizes and positions for controls buttons
		size = viewBtn.getPreferredSize();
		viewBtn.setBounds(width / 2 - size.width - 10, 170, size.width, size.height);
		size = cancelBtn.getPreferredSize();
		cancelBtn.setBounds(width / 2 + 10, 170, size.width, size.height);

		// set size and position for container
		pane.setPreferredSize(new Dimension(width, height));

		pack();
		setLocationRelativeTo(null);
		setVisible(false);

		System.out.println("AddformDialog() done!");

	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String actionCommand = evt.getActionCommand();

		if (actionCommand.equals(viewString)) {
			try {
				int goodsid = Integer.parseInt(idTxt.getText());
				String goodsfile = "files/goods.csv";
				String[] goodsarr = ReadTextFile.readTextFile(goodsfile);
				Goods[] Goodsarray = new Goods[goodsarr.length];

//				if(goodsid == i)
			} catch (Exception ex) {
				System.err.println("Error! Invalid data.");
			}
		} else if (actionCommand.equals(cancelString)) {
			System.out.println("actionCommand:" + cancelString);
			setVisible(false);

		}
	}
}