package lect08;

import java.util.Scanner;

public class W4NameMark {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 2;
		
		String[] names = new String[n];
		String[] surnames = new String[n];
		int[] marks = new int[n];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Surname:");
			String surname = sc.next();
			System.out.print("Mark:");
			int mark = sc.nextInt();
			names[i] = name;
			surnames[i] = surname;
			marks[i] = mark;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("name:" + names[i] + ", surname:" + surnames[i] + ", mark:" + marks[i]);
		}
		
	}

}
