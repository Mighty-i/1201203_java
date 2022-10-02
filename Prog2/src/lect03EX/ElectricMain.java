package lect03EX;

import java.util.Scanner;

public class ElectricMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID: ");
		long myId = sc.nextLong();
		System.out.print("Name: ");
		String myName = sc.next();
		System.out.print("Surname: ");
		String mySurname = sc.next();
		System.out.print("ElectricUnits: ");
		int myUnits = sc.nextInt();
		
		Electric user = new Electric(myId, myName, mySurname, myUnits);
		user.bill = ElectricBillCalculation.calculating(myUnits);
		System.out.println(user.toString());
		
		sc.close();
		
	}

}
