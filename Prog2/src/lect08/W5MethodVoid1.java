package lect08;

public class W5MethodVoid1 {
	
	// called method
	public static void printMessage(String message) {
		System.out.println("message:" + message);
	}
	
	// calling method
	public static void main(String[] args) {
		
		printMessage("This is a void method.");
		printMessage("It does not return anything to the calling method.");
		
		
	}

}
