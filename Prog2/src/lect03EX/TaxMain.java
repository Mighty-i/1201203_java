package lect03EX;

import java.util.Scanner;

public class TaxMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Income: ");
		int myIncome = sc.nextInt();
		
		Tax user = new Tax(myIncome);
		user.tax = TaxCalculation.calculating(myIncome);
		System.out.println(user.toString());
		
		sc.close();
	}

}
