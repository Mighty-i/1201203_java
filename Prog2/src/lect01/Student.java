package lect01;

public class Student {
	
	int id;
	String name;
	String surname;
	
	// constructor
	public Student(int id, String name, String surname) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		
	}
	
	public String toString() {
		
		String data = this.id +"-" + this.name + "-" + this.surname;
		return data;
		
	}

}
