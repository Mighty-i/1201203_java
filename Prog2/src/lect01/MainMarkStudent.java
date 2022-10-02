package lect01;

public class MainMarkStudent {
	
	public static void main(String[] args) {
		
		int myId = 123;
		String myName = "Chatra";
		String mySurname = "Sombattheera";
		int myMark = 56;
		
		MarkStudent obj = new MarkStudent(myId, myName, mySurname, myMark);
		
		System.out.println("obj:" + obj.toString());
		
	}

}
