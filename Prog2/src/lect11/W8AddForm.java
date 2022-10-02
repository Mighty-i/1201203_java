package lect11;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class W8AddForm extends JDialog implements ActionListener {

	private static final int width = 400;
	private static final int height = 200;

	JTextField plateTxt;
	JTextField modelTxt;
	JTextField makeTxt;

	private static final String addString = "Add";
	private static final String cancelString = "Cancel";

	public W8AddForm(JFrame frame) {
		super(frame, true);

		// Create pane as container
		Container pane = getContentPane();
		// set layout manager to manual
		pane.setLayout(null);

		// create labels
		JLabel addCarLabel = new JLabel("Add Car");
		JLabel plateLabel = new JLabel("Plate:");
		JLabel modelLabel = new JLabel("Model:");
		JLabel makeLabel = new JLabel("Make:");

		// create buttons
		JButton addBtn = new JButton(addString);
		JButton cancelBtn = new JButton(cancelString);

		// create texts
		plateTxt = new JTextField(10);
		modelTxt = new JTextField(20);
		makeTxt = new JTextField(20);

		// create control buttons.
		addBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

		// add labels
		pane.add(addCarLabel);
		pane.add(plateLabel);
		pane.add(modelLabel);
		pane.add(makeLabel);

		// add text fields
		pane.add(plateTxt);
		pane.add(modelTxt);
		pane.add(makeTxt);

		// add control buttons
		pane.add(addBtn);
		pane.add(cancelBtn);

		// set sizes and positions for labels
		Dimension size = addCarLabel.getPreferredSize();
		addCarLabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
		size = plateLabel.getPreferredSize();
		plateLabel.setBounds(10, 20, size.width, size.height);
		size = modelLabel.getPreferredSize();
		modelLabel.setBounds(10, 50, size.width, size.height);
		size = makeLabel.getPreferredSize();
		makeLabel.setBounds(10, 80, size.width, size.height);

		// set sizes and positions for labels
		size = plateTxt.getPreferredSize();
		plateTxt.setBounds(70, 20, size.width, size.height);
		size = modelTxt.getPreferredSize();
		modelTxt.setBounds(70, 50, size.width, size.height);
		size = makeTxt.getPreferredSize();
		makeTxt.setBounds(70, 80, size.width, size.height);
		
		// set sizes and positions for controls buttons
		size = addBtn.getPreferredSize();
		addBtn.setBounds(width / 2 - size.width - 10, 140, size.width, size.height);
		size = cancelBtn.getPreferredSize();
		cancelBtn.setBounds(width / 2 + 10, 140, size.width, size.height);

		// set size and position for container
		pane.setPreferredSize(new Dimension(width, height));

		pack();
		setVisible(false);

		System.out.println("AddStudentDialog() done!");

	}

	public void actionPerformed(ActionEvent evt) {
		String actionCommand = evt.getActionCommand();
		// user presses "Add"
		if (actionCommand.equals(addString)) {
			System.out.println("actionCommand:" + addString);
			try {
				// retrieve values from text fields.
				int plate = Integer.parseInt(plateTxt.getText());
				String model = modelTxt.getText();
				String make = makeTxt.getText();
				Le11Car car = new Le11Car(plate, model, make);
				System.out.println("car:" + car.toString());
				addCar(car);
				// reset text fields
				plateTxt.setText(null);
				modelTxt.setText(null);
				makeTxt.setText(null);
			} catch (Exception ex) {
				System.err.println("Error! Invalid data.");
			}
		// user presses "Cancel"
		} else if (actionCommand.equals(cancelString)) {
			System.out.println("actionCommand:" + cancelString);
			setVisible(false);
		}
	}
	private void addCar(Le11Car car) {
		System.out.println("CarDB.addCars()");
		try {
			String insertSql = "INSERT INTO CAR VALUES" + "(" + car.plate + ", '" + car.model + "', '" + car.make
					+ "')";
			System.out.println("selectSql:" + insertSql);

			Le11ConnMariaDB connDB = new Le11ConnMariaDB();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.execute(insertSql);
				stmnt.close();
				con.close();
				System.out.println("Car added successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid plate.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}	
