package lect03test01;
import java.util.Scanner;

public class StudentMarkMain {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("ID:");
		long id = sc.nextLong();
		
		System.out.print("Name:");
		String name = sc.next();
		
		System.out.print("Surname:");
		String surname = sc.next();
		
		System.out.print("Mark:");
		int mark = sc.nextInt();
		
		char grade = ' ';
		
		if(mark<60) {
			grade = 'U';
		}else {
			grade = 'S';
		}
		System.out.println("Grade: "+grade);
		
		StudentMark student = new StudentMark();
		System.out.println("Before student:" + student);
		System.out.println("Before student.toString():" + student.toString());
		System.out.println("id:" + student.id);
		System.out.println("name:" + student.name);
		student.id = id;
		student.name = name;
		student.surname = surname;
		student.mark = mark;
		student.grade = grade;
		System.out.println("After student:" + student);
		System.out.println("After student.toString():" + student.toString());
		System.out.println("id:" + student.id);
		System.out.println("name:" + student.name);
		
		StudentMark student2 = new StudentMark(id, name, surname, mark, grade);
		System.out.println("After student:" + student2);
		System.out.println("After student.toString():" + student.toString());
		
		sc.close();
		
	}

}
