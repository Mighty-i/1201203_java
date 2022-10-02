package lect02;

public class StudentMark {
	
	int id;
	String name;
	String surname;
	int mark;
	char grade;
	
	public StudentMark(int id, String name, String surname, int mark) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mark = mark;
		this.grade = ' ';
		
	}
	
	public String toString() {
		
		String data = this.id + "-" + this.name + "-" + this.surname 
				+ "-" + this.mark + "-" + this.grade;
		
		return data;
		
	}

}
