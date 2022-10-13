package Exlect11;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class EditForm extends JDialog implements ActionListener {

	private static final int LINE = 0;

	private static final int width = 400;
	private static final int height = 200;

	JTextField idTxt;
	JTextField nameTxt;
	JTextField DescriptionTxt;
	JTextField priceTxt;
	JTextField stockTxt;

	private static final String editString = "Edit";
	private static final String cancelString = "cancel";

	public EditForm(JFrame frame) {
		super(frame, true);

		// Create pane as container
		Container pane = getContentPane();
		// set layout manager to manual
		pane.setLayout(null);

		// create labels
		JLabel editformlabel = new JLabel("Edit Goods");
		JLabel idLabel = new JLabel("ID");
		JLabel nameLabel = new JLabel("Name");
		JLabel DescriptionLabel = new JLabel("Description");
		JLabel priceLabel = new JLabel("Price");
		JLabel stockLabel = new JLabel("Stock");

		// create buttons
		JButton editBtn = new JButton(editString);
		JButton cancelBtn = new JButton(cancelString);

		// create texts
		idTxt = new JTextField(10);
		nameTxt = new JTextField(20);
		DescriptionTxt = new JTextField(15);
		priceTxt = new JTextField(10);
		stockTxt = new JTextField(10);

		// create control buttons.
		editBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

		// add labels
		pane.add(editformlabel);
		pane.add(idLabel);
		pane.add(nameLabel);
		pane.add(DescriptionLabel);
		pane.add(priceLabel);
		pane.add(stockLabel);

		// add text fields
		pane.add(idTxt);
		pane.add(nameTxt);
		pane.add(DescriptionTxt);
		pane.add(priceTxt);
		pane.add(stockTxt);

		// add control buttons
		pane.add(editBtn);
		pane.add(cancelBtn);

		// set sizes and positions for labels
		Dimension size = editformlabel.getPreferredSize();
		editformlabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
		size = idLabel.getPreferredSize();
		idLabel.setBounds(10, 20, size.width, size.height);
		size = nameLabel.getPreferredSize();
		nameLabel.setBounds(10, 50, size.width, size.height);
		size = DescriptionLabel.getPreferredSize();
		DescriptionLabel.setBounds(10, 80, size.width, size.height);
		size = priceLabel.getPreferredSize();
		priceLabel.setBounds(10, 110, size.width, size.height);
		size = stockLabel.getPreferredSize();
		stockLabel.setBounds(10, 140, size.width, size.height);

		// set sizes and positions for labels
		size = idTxt.getPreferredSize();
		idTxt.setBounds(80, 20, size.width, size.height);
		size = nameTxt.getPreferredSize();
		nameTxt.setBounds(80, 50, size.width, size.height);
		size = DescriptionTxt.getPreferredSize();
		DescriptionTxt.setBounds(80, 80, size.width, size.height);
		size = priceTxt.getPreferredSize();
		priceTxt.setBounds(80, 110, size.width, size.height);
		size = stockTxt.getPreferredSize();
		stockTxt.setBounds(80, 140, size.width, size.height);

		// set sizes and positions for controls buttons
		size = editBtn.getPreferredSize();
		editBtn.setBounds(width / 2 - size.width - 10, 170, size.width, size.height);
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
		// user presses "Add"
		if (actionCommand.equals(editString)) {
			System.out.println("actionCommand:" + editString);
			try {
				// retrieve values from text fields.
				int id = Integer.parseInt(idTxt.getText());
				String name = nameTxt.getText();
				String Description = DescriptionTxt.getText();
				int price = Integer.parseInt(priceTxt.getText());
				int stock = Integer.parseInt(stockTxt.getText());
				Le11Goods goods = new Le11Goods(id, name, Description, price, stock);
				System.out.println("goods:" + goods.toString());
				editGoods(goods);
				
				// reset text fields
				idTxt.setText(null);
				nameTxt.setText(null);
				DescriptionTxt.setText(null);
				priceTxt.setText(null);
				stockTxt.setText(null);
				
			} catch (Exception ex) {
				System.err.println("Error! Invalid data.");
			}
			// user presses "Cancel"
		} else if (actionCommand.equals(cancelString)) {
			System.out.println("actionCommand:" + cancelString);
			setVisible(false);
		}
	}
	private void editGoods(Le11Goods goods) {
		System.out.println("GoodsDB.editGoods()");
		try {
			String updateSql = "UPDATE LE11GOODS SET NAME='" + goods.name + "', DESCRIPTION='" + goods.Description + "', PRICE='" + goods.price + "', STOCK='" + goods.stock + "' WHERE ID=" + goods.id;
			System.out.println("updateSql:" + updateSql);

			Le11ConnMariaDB connDB = new Le11ConnMariaDB();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(updateSql);
				stmnt.close();
				con.close();
				System.out.println("Goods updated successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid plate.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		
		}
	}
}
