package lect03EX;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID: ");
		long myId = sc.nextLong();
		System.out.print("Name: ");
		String myName = sc.next();
		System.out.print("Surname: ");
		String mySurname = sc.next();
		System.out.print("Mark: ");
		int myMark = sc.nextInt();
		
		Student std = new Student(myId, myName, mySurname, myMark);
		std.grade = Grader.grade(myMark);
		System.out.println(std.toString());
		
		sc.close();
	}

}
