package lect05;

public class GraderPractice implements Grader{
	public char grade(int mark) {
		char grade = ' ';
		if(mark < 50) {
			grade = 'U';
		}else {
			grade = 'S';
		}
		return grade;
	}

}
