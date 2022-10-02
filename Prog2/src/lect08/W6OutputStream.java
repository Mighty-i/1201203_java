package lect08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class W6OutputStream {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("files/InputStreamExample.txt");
			outputStream = new FileOutputStream("files/InputStreamExample-copy.txt");
			byte[] bytes = new byte[1024];
			int index;
			while ((index = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, index);
			}
		} catch(IOException ex) {
			ex.getMessage();
			ex.printStackTrace();
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}
}
