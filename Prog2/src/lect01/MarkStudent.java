package lect01;

public class MarkStudent {
	
	int id;
	String name;
	String surname;
	int mark;
	
	public MarkStudent(int id, String name, String surname, int mark) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mark = mark;
	}
	
	public String toString() {
		
		String data = this.id + "-" + this.name + "-" + this.surname + "-" + this.mark;
		return data;
		
	}

}
