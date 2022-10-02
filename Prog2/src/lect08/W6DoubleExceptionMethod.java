package lect08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class W6DoubleExceptionMethod {

	public static double getDouble(String message, Scanner sc) {

		double value = 0;
		try {

			System.out.print(message);
			value = sc.nextDouble();

		} catch (InputMismatchException ex) {
			if(sc.hasNext()) {
				sc.next();
			}
			System.out.println("Error! You must insert a double value.");
			System.out.println("ex.getMessage():" + ex.getMessage());
			System.out.println("ex.getCause():" + ex.getCause());
			System.out.println("ex.printStackTrace():");
		} finally {
			System.out.println("finally.");
		}
		return value;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double price = 0;

			do {
				price = getDouble("Insert the price > 0 of this good:", sc);

			} while (price <= 0);


		System.out.println("price:" + price);
		System.out.println("Good bye");
	}

}
