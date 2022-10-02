package Mylect8;

import java.util.Scanner;

public class W4Array2StringFor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of names:");
		int number = sc.nextInt();
		String[] names = new String[number];
		for(int i=0;i<number;i++) {
			System.out.print("name[" + i + "]:");
			names[i] = sc.next();
		}
		System.out.println("There are names...");
		for(int i=0;i<number;i++) {
			System.out.println("name[" + i + "]:" + names[i]);
		}
		sc.close();
	}

}
