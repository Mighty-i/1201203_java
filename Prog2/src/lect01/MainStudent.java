package lect01;

public class MainStudent {
	
	public static void main(String[] args) {
		
		int myId = 123;
		String myName = "Chatra";
		String mySurname = "Sombattheera";
		
		Student obj = new Student(myId, myName, mySurname);
		
		System.out.println("obj:" + obj.toString());
		
	}

}
