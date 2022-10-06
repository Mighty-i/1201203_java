package Exlect10;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ShowForm extends JDialog implements ActionListener {

    public static final int LINE = 0;

    private static final String deleteString = "Delete";
	private static final String cancelString = "cancel";
    
    private static final int width = 400;
    private static final int height = 250;

    private static int idPro ;
    
    public ShowForm(JFrame frame, int showId, String showname,String  showDescription, int showprice, int showstock) {
        super(frame, true);


        idPro = showId;

        System.out.println(showId + showname + showDescription + showprice + showstock);
        Container pane = getContentPane();
        pane.setLayout(null);

        JLabel productLabel = new JLabel("Delete Product");
        JLabel productId = new JLabel("ID : ");
        JLabel productName = new JLabel("Name:");
        JLabel productDescription = new JLabel("Description:");
        JLabel productPrice = new JLabel("Price:");
        JLabel Stock = new JLabel("Stock:");

        JLabel showductId = new JLabel(String.valueOf(showId));
        JLabel showductName = new JLabel(showname);
        JLabel showductDescription = new JLabel(showDescription);
        JLabel showuctPrice = new JLabel(String.valueOf(showprice));
        JLabel showStock = new JLabel(String.valueOf(showstock));

        JButton btn_del = new JButton(deleteString);
        JButton btn_cancel = new JButton(cancelString);

        pane.add(productLabel);
        pane.add(productId);
        pane.add(productName);
        pane.add(productDescription);
        pane.add(productPrice);
        pane.add(Stock);

        pane.add(showductId);
        pane.add(showductName);
        pane.add(showductDescription);
        pane.add(showuctPrice);
        pane.add(showStock);

        pane.add(btn_del);
        pane.add(btn_cancel);

        btn_del.addActionListener(this);
        
        Dimension size = productLabel.getPreferredSize();
        productLabel.setBounds((width - size.width) / 2, 5, size.width, size.height);
        size = productId.getPreferredSize();
        productId.setBounds((width - size.width) / 10, 30, size.width, size.height);
        size = productName.getPreferredSize();
        productName.setBounds((width - size.width) / 10, 60, size.width, size.height);
        size = productDescription.getPreferredSize();
        productDescription.setBounds((width - size.width) / 10, 90, size.width, size.height);
        size = productPrice.getPreferredSize();
        productPrice.setBounds((width - size.width) / 10, 120, size.width, size.height);
        size = Stock.getPreferredSize();
        Stock.setBounds((width - size.width) / 10, 150, size.width, size.height);

        size = showductId.getPreferredSize();
        showductId.setBounds((width - size.width) / 3, 30, size.width, size.height);
        size = showductName.getPreferredSize();
        showductName.setBounds((width - size.width) / 3, 60, size.width, size.height);
        size = showductDescription.getPreferredSize();
        showductDescription.setBounds((width - size.width) / 3, 90, size.width, size.height);
        size = showuctPrice.getPreferredSize();
        showuctPrice.setBounds((width - size.width) / 3, 120, size.width, size.height);
        size = showStock.getPreferredSize();
        showStock.setBounds((width - size.width) / 3, 150, size.width, size.height);

        // set sizes and positions for controls buttons
        size = btn_del.getPreferredSize();
        btn_del.setBounds(width / 2 - size.width - 10, 180, size.width, size.height);
        size = btn_cancel.getPreferredSize();
        btn_cancel.setBounds(width / 2 + 10, 180, size.width, size.height);

        pane.setPreferredSize(new Dimension(width, height));

        pack();
        setLocationRelativeTo(null);
        setVisible(false);

        System.out.println("AddProductDialog() done!");
    }

    public void actionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        System.out.println("actionCommand : " + deleteString);
        if (actionCommand.equals(deleteString)) {
            try {
                int proId = idPro;
                System.out.println(proId);
             // read file
				String goodsfile = "files/goods.csv";
				// read file to array
				String[] goodsarr = ReadTextFile.readTextFile(goodsfile);

				Goods[] Goodsarray = new Goods[goodsarr.length];

                boolean ck = false;
                for (int i = LINE; i < goodsarr.length; i++) {
					Goods GoodsOBJ = new Goods();
//               System.out.println(i);
                    String[] goods = goodsarr[i].split(",");
//               System.out.println(goods);
                    String id2 = goods[LINE];
					int Id3 = Integer.parseInt(id2);
                    
//               System.out.println(id);
                    GoodsOBJ.setID(Id3);
					String name = goods[1];
					GoodsOBJ.setName(name);
					String Description = goods[2];
					GoodsOBJ.setDescription(Description);
					String price = goods[3];
					int intPrice = Integer.parseInt(price);
					GoodsOBJ.setPrice(intPrice);
					String stock = goods[4];
					int intstock = Integer.parseInt(stock);
					GoodsOBJ.setStock(intstock);

					Goodsarray[i] = GoodsOBJ;
                }

                for (int i = LINE; i < goodsarr.length; i++) {
                	if(Goodsarray[i].getInt()==proId) {
                		continue;
                	}
					if (i == 0) {
						WriteTextFile wtf = new WriteTextFile(Goodsarray[i].getInt(), Goodsarray[i].getName(),
								Goodsarray[i].getDescription(), Goodsarray[i].getPrice(), Goodsarray[i].getStock(),
								false);
						JOptionPane.showMessageDialog(null, "Success");
					} else {
						WriteTextFile wtf = new WriteTextFile(Goodsarray[i].getInt(), Goodsarray[i].getName(),
								Goodsarray[i].getDescription(), Goodsarray[i].getPrice(), Goodsarray[i].getStock(),
								true);
					}

                 }
                

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if (actionCommand.equals(cancelString)) {
			System.out.println("actionCommand:" + cancelString);
			setVisible(false);
		}
    }

}
