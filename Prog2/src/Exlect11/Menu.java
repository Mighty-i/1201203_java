package Exlect11;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener {

	private static final String mainString = "Main Menu";
	private static final String addString = "Add";
	private static final String editString = "Edit";
	private static final String viewString = "View";
	private static final String deleteString = "Delete";
	private static final String exitString = "Exit";
	
	private static final int frameWidth = 400;
	private static final int frameHeight = 300;
	
	AddForm addForm;
	EditForm editForm;
	ViewForm viewForm;
	DeleteForm deleteForm;
	
	public Menu(JFrame frame) {
		
		super();
		
		addForm = new AddForm(frame);
		editForm = new EditForm(frame);
		viewForm = new ViewForm(frame);
		deleteForm = new DeleteForm(frame);
		
		int panelWidth = 400;
		int panelHeight = 300;
		
		setLayout(null);
		
		JLabel mainLabel = new JLabel(mainString);
		
		JButton addBtn = new JButton(addString);
		JButton editBtn = new JButton(editString);
		JButton viewBtn = new JButton(viewString);
		JButton deleteBtn = new JButton(deleteString);
		JButton exitBtn = new JButton(exitString);
		
		addBtn.addActionListener(this);
		editBtn.addActionListener(this);
		viewBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		add(mainLabel);
		add(addBtn);
		add(editBtn);
		add(viewBtn);
		add(deleteBtn);
		add(exitBtn);
		
		Dimension size = mainLabel.getPreferredSize();
		mainLabel.setBounds((panelWidth - size.width) / 2, 20, size.width, size.height);
		size = addBtn.getPreferredSize();
		addBtn.setBounds((panelWidth - size.width) / 2, 60, size.width, size.height);
		size = editBtn.getPreferredSize();
		editBtn.setBounds((panelWidth - size.width) / 2, 100, size.width, size.height);
		size = viewBtn.getPreferredSize();
		viewBtn.setBounds((panelWidth - size.width) / 2, 140, size.width, size.height);
		size = deleteBtn.getPreferredSize();
		deleteBtn.setBounds((panelWidth - size.width) / 2, 180, size.width, size.height);
		size = exitBtn.getPreferredSize();
		exitBtn.setBounds((panelWidth - size.width) / 2, 220, size.width, size.height);
		
		this.setPreferredSize(new Dimension(panelWidth, panelHeight));
	}


	
	public void actionPerformed(ActionEvent evt) {
		String actionCommand = evt.getActionCommand();
		System.out.println("ActionCommand:" + actionCommand);
		if(actionCommand.equals(addString)) {
			System.out.println("equals " + addString);
			addForm.setVisible(true);
		}else if(actionCommand.equals(editString)) {
			System.out.println("equals " + editString);
			editForm.setVisible(true);
		}else if(actionCommand.equals(viewString)) {
			System.out.println("equals " + viewString);
			viewForm.setVisible(true);
		}else if(actionCommand.equals(deleteString)) {
			System.out.println("equals " + deleteString);
			deleteForm.setVisible(true);
		}else if(actionCommand.equals(exitString)) {
			System.out.println("equals " + exitString);
			System.exit(0);
		}
	}
}
