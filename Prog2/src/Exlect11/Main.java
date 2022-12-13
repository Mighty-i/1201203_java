package Exlect11;

import javax.swing.JFrame;

public class Main {
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("EX Lect10");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new Menu(frame));
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
