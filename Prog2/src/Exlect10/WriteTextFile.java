package Exlect10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class WriteTextFile {

	public WriteTextFile(int id, String name, String Description, int price, int stock) {
		System.out.println("WriteTextFile.main()");
		String fileName = "files/goods.csv";
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName, true));

			bw.write(id + "," + name + "," + Description + "," + price + "," + stock);
			bw.write("\n");
			bw.flush();
			bw.close();
			JOptionPane.showMessageDialog(null, "Success");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
