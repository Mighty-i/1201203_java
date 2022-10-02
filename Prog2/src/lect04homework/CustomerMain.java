package lect04homework;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input ID Customer: ");
		long id = sc.nextLong();
		
		System.out.print("Input Name: ");
		String name = sc.next();
		
		System.out.print("Input Surname: ");
		String surname = sc.next();
		
		System.out.print("Input Birthdate: ");
		String birthdate = sc.next();
		
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
		
		Customer obj = new Customer(id,name,surname,birthdate,houseNo,
				villageNo,subarea,area,province,phonenumber);
		System.out.print(obj.toString());
		sc.close();
	}

}
