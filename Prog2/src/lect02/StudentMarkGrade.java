package lect02;

public class StudentMarkGrade {
	int id;
	String name;
	String surname;
	int mark;
	char grade;
	
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

	public StudentMarkGrade(int id, String name, String surname, int mark) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mark = mark;
		this.grade = grading(mark);
		
	}
	
	public String toString() {
		
		String data = this.id + "-" + this.name + "-" + this.surname 
				+ "-" + this.mark + "-" + this.grade;
		
		return data;
		
	}


}
