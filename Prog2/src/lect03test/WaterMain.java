package lect03test;

import java.util.Scanner;

public class WaterMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Used Water: ");
		int myUnits = sc.nextInt();
		
		Water user = new Water(myUnits);
		user.bill = WaterBillCalculation.calculating(myUnits);
		System.out.println(user.toString());
		
		sc.close();
	}
}
