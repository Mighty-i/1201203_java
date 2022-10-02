package lect08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class W6IntThrow {

	public static double getInt(String message, Scanner sc) 
			throws InputMismatchException {

		int value = 0;
//		try {

			System.out.print(message);
			value = sc.nextInt();

//		} catch (InputMismatchException ex) {
//			if(sc.hasNext()) {
//				sc.next();
//			}
//			System.out.println("Error! You must insert a double value.");
//			System.out.println("ex.getMessage():" + ex.getMessage());
//			System.out.println("ex.getCause():" + ex.getCause());
//			System.out.println("ex.printStackTrace():");
//		} catch(Exception ex) {
//			System.out.println("catch Exception in method getInt(String, Scanner)");
//		} finally {
//			System.out.println("finally.");
//		}
		return value;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double price = 0;
		try {
			do {
				price = getInt("Insert the price > 0 of this good:", sc);

			} while (price <= 0);

		} catch(InputMismatchException ex) {
			System.out.println("catch InputMismatchException in method main()");
			if(sc.hasNext()) {
				sc.next();
			}
		}
		System.out.println("price:" + price);
		System.out.println("Good bye");
	}
}