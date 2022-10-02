package lect02;

public class Grader {
	
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

}
