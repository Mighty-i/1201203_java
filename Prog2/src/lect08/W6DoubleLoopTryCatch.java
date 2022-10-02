package lect08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class W6DoubleLoopTryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double price = 0;

		do {
			try {
				System.out.print("Insert the price > 0 of this good:");
				price = sc.nextDouble();

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
		} while (price <= 0);

		System.out.println("price:" + price);
		System.out.println("Good bye");
	}

}
