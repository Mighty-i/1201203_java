package lect03test;

public class Student {
	long id;
	String name;
	String surname;
	int mark;
	char grade;
	
	public Student(long id, String name, String surname, int mark) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mark = mark;
		this.grade = ' ';
	}
	public String toString() {
		return "ID: "+this.id+" ,Name: "+this.name+" ,Surname: "+this.surname+
				" ,Mark: "+this.mark+" ,Grade: "+this.grade;
	}

}
