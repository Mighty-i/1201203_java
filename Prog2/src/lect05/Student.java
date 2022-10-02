package lect05;

public class Student extends Human{
	
	int studentId;
	int mark;
	char grade;
	public Student (int id, String name, String surname, int mark, char grade) {
		
		super(name, surname);
		studentId = id;
		this.mark = mark;
		this.grade = grade;
	}
	
	public String toString() {
		
		String data = studentId + "-" + name + "-" +surname + "-" + mark + "-" + grade;
		
		return data;
	}

}
