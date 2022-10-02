package lect05;

public class StudentMain {
	
	public static void main(String[] args) {
		
		int id = 1064;
		String name = "Phattharadanai";
		String surname = "Khotniya";
		int mark = 75;
		char grade = ' ';
		
		GraderPractice grader = new GraderPractice();
		grade = grader.grade(mark);
		
		Student student = new Student(id, name, surname, mark, grade);
		
		System.out.println("student:" + student);
	}

}
