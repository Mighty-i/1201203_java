package lect08;

import java.io.*;

public class W6File {

	public static void main(String args[]) throws IOException {
		File f = new File("src/Lect08/W6File.java");
		// java.io.File f = new java.io.File("source/x.java”);
		System.out.println("getName: " + f.getName()); // x.java
		System.out.println("getPath: " + f.getPath()); // source/x.java
		System.out.println("getAbsolutePath: " + f.getAbsolutePath());
		// c:\source\x.java
		System.out.println("exists: " + f.exists()); // true
		System.out.println("isFile: " + f.isFile()); // true
		System.out.println("isDirectory: " + f.isDirectory()); // false
		System.out.println("canWrite: " + f.canWrite()); // true
		System.out.println("canRead: " + f.canRead()); // true
		System.out.println("length: " + f.length()); // 562 Bytes
	}
}
