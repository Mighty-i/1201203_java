package lect04test;

import java.util.Scanner;

public class DoWhileMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String check = " ";
		do {
			System.out.print("Input ID Supplier: ");
			long id = sc.nextLong();
			
			System.out.print("Input Companyname: ");
			String companyname = sc.next();
			
			System.out.print("Input HouseNo: ");
			String houseNo = sc.next();
			
			System.out.print("Input VillageNo: ");
			String villageNo = sc.next();
			
			System.out.print("Input Subarea: ");
			String subarea = sc.next();
			
			System.out.print("Input Area: ");
			String area = sc.next();
			
			System.out.print("Input Province: ");
			String province = sc.next();
			
			System.out.print("Input Phonenumber: ");
			String phonenumber = sc.next();
			
			Supplier obj = new Supplier(id,companyname,houseNo,villageNo,subarea,area,province,phonenumber);
			System.out.print(obj.toString());
			
			System.out.print("Do you want to continue?[yes/no]: ");
			check = sc.next();
			System.out.println();
		}while(check.equalsIgnoreCase("yes"));
		System.out.println("Good bye");
		sc.close();
	}

}
