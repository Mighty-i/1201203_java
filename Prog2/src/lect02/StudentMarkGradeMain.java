package lect02;

import java.util.Scanner;

public class StudentMarkGradeMain {
	
	public static char grading(int mark) {
		char g = ' ';
		
		if(mark < 50) {
			g = 'F';
		} else if(mark < 60) {
			g = 'D';
		} else if(mark < 70) {
			g = 'C';
		} else if(mark < 80) {
			g = 'B';
		} else {
			g = 'A';
		}
		
		return g;
	}
	
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
		
		StudentMark studentMark = new StudentMark(id, name, surname, mark);
		char grade = grading(mark);
		
		studentMark.grade = grade;
		
		System.out.println("studentMark:" + studentMark.toString());
		
	}

}
