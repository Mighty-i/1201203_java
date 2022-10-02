package lect02;

import java.util.Scanner;

public class StudentMarkMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID:");
		int id = sc.nextInt();
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Surname:");
		String surname = sc.next();
		System.out.print("Mark:");
		int mark = sc.nextInt();
		
		// two classes
		StudentMarkGrade studentMarkGrade = new StudentMarkGrade(id, name, surname, mark);
		studentMarkGrade.grading(mark);
		System.out.println("studentMarkGrade:" + studentMarkGrade.toString());
		
		// three classes
		StudentMark studentMark = new StudentMark(id, name, surname, mark);
		char grade = Grader.grading(mark);		
		studentMark.grade = grade;
		
		System.out.println("studentMark:" + studentMark.toString());
		
	}

}
