package lect06;

import java.util.Scanner;

public class WaterMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Units: ");
		int myUnits = sc.nextInt();
		
		Water wt = new Water(myUnits);
		wt.bill = WaterBill.calculating(myUnits);
		System.out.println(wt.toString());
		
		sc.close();
	}

}
