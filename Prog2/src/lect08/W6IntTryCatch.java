package lect08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class W6IntTryCatch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Insert an int value:");
			int value = sc.nextInt();
			
		} catch(InputMismatchException ex) {
			System.out.println("catch InputMismatchException");
			ex.getCause();
			ex.getMessage();
			ex.printStackTrace();
		} catch(Exception ex) {
			System.out.println("catch Exception");
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("Good bye");
	}

}
