package Exlect10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class WriteTextFile {

	public WriteTextFile(int goodsid, String goodsname, String goodsDescription, int goodsprice, int goodsstock, boolean ch) {
		System.out.println("WriteTextFile.main()");
		String fileName = "files/goods.csv";
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName, ch));

			bw.write(goodsid + "," + goodsname + "," + goodsDescription + "," + goodsprice + "," + goodsstock);
			bw.write("\n");
			bw.flush();
			bw.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
