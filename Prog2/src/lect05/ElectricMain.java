package lect05;

import java.util.Scanner;

public class ElectricMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input ID: ");
		long myId = sc.nextLong();
		System.out.print("Input Name: ");
		String myName = sc.next();
		System.out.print("Input Surname: ");
		String mySurname = sc.next();
		System.out.print("Input Used: ");
		int myUnits = sc.nextInt();
		
		Electric user = new Electric(myId,myName,mySurname,myUnits);
		user.bill = ElectricBillCalculation.calculating(myUnits);
		System.out.println(user.toString());
		sc.close();
	}

}
