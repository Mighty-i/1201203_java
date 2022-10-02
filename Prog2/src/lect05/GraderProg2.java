package lect05;

public class GraderProg2 implements Grader {
	
	public char grade(int mark) {
		char g = ' ';
		if(mark < 50) {
			g = 'F';
		}else if(mark < 60) {
			g = 'D';
		}else if(mark < 70) {
			g = 'C';
		}else if(mark < 80) {
			g = 'B';
		}else {
			g = 'A';
		}
		return g;
	}

}
