package lect04;

import java.util.Scanner;

public class ContinueDoLoop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cont = "yes";
		
		while(cont.equalsIgnoreCase("yes")) {
			System.out.print("ID:");
			long id = sc.nextLong();
			
			System.out.print("Do you want to continue?[yes/no]:");
			cont = sc.next();
			
		}
		sc.close();
	}

}
