package lect10;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;

public class PanelTest {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My Panel Test");
		frame.setLocation(100, 200);
		frame.setOpacity(1);
		frame.setBackground(Color.BLUE);
		frame.setPreferredSize(new Dimension(700, 300));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setBounds(500, 100, 400, 300);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		panel.setPreferredSize(new Dimension(400, 200));
		panel.setBounds(50, 50, 700,300);
		panel.setBackground(Color.BLUE);
		String strLabel = "Panel Test";
		JLabel label = new JLabel(strLabel);
		label.setOpaque(true);
		label.setAlignmentX(10.0f);
		label.setBounds(20,20, label.getPreferredSize().width+10, label.getPreferredSize().height+10);
		label.setBackground(Color.RED);
		System.out.println("alignmentX:" + label.getAlignmentX());
		panel.add(label);
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
