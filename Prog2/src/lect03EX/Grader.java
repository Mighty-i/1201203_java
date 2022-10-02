package lect03EX;

public class Grader {
	public static char grade(int mark) {
		
		char grade = ' ';
		
		if(mark < 50) {
			grade = 'F';
		}else if(mark < 60) {
			grade = 'D';
		}else if(mark <70) {
			grade = 'C';
		}else if(mark < 80) {
			grade = 'B';
		}else {
			grade = 'A';
		}
		System.out.println("Grade: " + grade);
		
		return grade;
	}

}
