package lect08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class W6WriteFileFor {

	public static void main(String[] args) {
		System.out.println("WriteFileFor.main()");
		System.out.print("Number of students:");
		Scanner sc = new Scanner(System.in);
		int studentNumber = sc.nextInt();
		String fileName = "file/StudentMarks.csv";
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName,true));
			for (int counter = 0; counter < studentNumber; counter++) {
				System.out.println("counter:" + counter);
				System.out.print("Student Id:");
				int studentId = sc.nextInt();
				System.out.print("Student Name:");
				String studentName = sc.next();
				System.out.print("Student Surname:");
				String studentSurname = sc.next();
				System.out.print("Marks:");
				double marks = sc.nextDouble();
				bw.write(studentId + "," + studentName + "," + studentSurname + "," + marks);
				bw.write("\n");
				bw.flush();
			}
			bw.close();
//			JOptionPane.showMessageDialog(null, "Record saved");
		} catch (IOException ex) {
			ex.printStackTrace();
//			JOptionPane.showMessageDialog(null, "Record not saved");
		}

	}
}
