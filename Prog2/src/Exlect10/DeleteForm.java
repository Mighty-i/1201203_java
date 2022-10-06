package Exlect10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class DeleteForm extends JDialog implements ActionListener {
	
	private static final int width = 250;
	private static final int height = 100;
	
	JTextField idTxt;
	
	JFrame frame;
	String inputId;
	String showname;
	String getDescription ;
	int showId;
	int showprice;
	int showstock;

	 ShowForm ShowForm;

	
	private static final int LINE = 0;
	
	
	private static final String deleteString = "ID";
	private static final String cancelString = "cancel";
	
	public DeleteForm(JFrame frame) {
		super(frame, true);
		
		ShowForm = new ShowForm(frame, showId, showname, getDescription, showprice, showstock);
		
		// Create pane as container
		Container pane = getContentPane();
		// set layout manager to manual
		pane.setLayout(null);
		// create labels
		JLabel deleteformlabel = new JLabel("Delete");
		JLabel idlabel = new JLabel("ID:");
		// create buttons
		JButton btn_del = new JButton(deleteString);
        JButton btn_cancel = new JButton(cancelString); 
        // create texts
        idTxt = new JTextField(10);
		// create control buttons.
        btn_del.addActionListener(this);
        btn_cancel.addActionListener(this);
		// add labels
        pane.add(deleteformlabel);
        pane.add(idlabel);
		// add text fields
        pane.add(idTxt);
		// add control buttons
        pane.add(btn_del);
        pane.add(btn_cancel);
        
		// set sizes and positions for labels
        Dimension size = deleteformlabel.getPreferredSize();
        deleteformlabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
        
        size = idlabel.getPreferredSize();
        idlabel.setBounds(64, 33, size.width, size.height);
        
		// set sizes and positions for labels
        size = idTxt.getPreferredSize();
        idTxt.setBounds(90, 30, 90, 20);
        
		// set sizes and positions for controls buttons
        size = btn_del.getPreferredSize();
        btn_del.setBounds(64, 60, size.width, size.height);
        
        size = btn_cancel.getPreferredSize();
        btn_cancel.setBounds(130, 60, size.width, size.height);

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
		if(actionCommand.equals(deleteString)) {
			try {
				// read file
				String goodsfile = "files/goods.csv";
				// read file to array
				String[] goodsarr = ReadTextFile.readTextFile(goodsfile);

				Goods[] Goodsarray = new Goods[goodsarr.length];
				
				boolean ck = false;
				for(int i = LINE; i < goodsarr.length; i++) {
					Goods GoodsOBJ = new Goods();
					
					String[] edit = goodsarr[i].split(",");
					
					String id2 = edit[LINE];
					int Id3 = Integer.parseInt(id2);
				
					GoodsOBJ.setID(Id3);
					String name = edit[1];
					GoodsOBJ.setName(name);
					String Description = edit[2];
					GoodsOBJ.setDescription(Description);
					String price = edit[3];
					int intPrice = Integer.parseInt(price);
					GoodsOBJ.setPrice(intPrice);
					String stock = edit[4];
					int intstock = Integer.parseInt(stock);
					GoodsOBJ.setStock(intstock);
					
					Goodsarray[i] = GoodsOBJ;
					
				}
				for(int i = LINE; i < goodsarr.length; i++) {
					int goodsid = Integer.parseInt(idTxt.getText());
					if(goodsid==Goodsarray[i].getInt()) {
						String showId =String.valueOf(Goodsarray[i].getInt());
                        String showname =Goodsarray[i].getName();
                        String showDescription =  Goodsarray[i].getDescription();
                        String showprice = String.valueOf(Goodsarray[i].getPrice());
                        String showstock = String.valueOf(Goodsarray[i].getStock());
                        ShowForm show = new ShowForm(frame, Goodsarray[i].getInt(), Goodsarray[i].getName(), Goodsarray[i].getDescription(), Goodsarray[i].getPrice(), Goodsarray[i].getStock());
                        
                        ShowForm.setVisible(true);
					}
					
				}
			}catch (Exception e) {
                e.printStackTrace();
			}
		}else if (actionCommand.equals(cancelString)) {
			System.out.println("actionCommand:" + cancelString);
			setVisible(false);
		}
	}

}
