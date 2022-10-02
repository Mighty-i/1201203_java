package lect08;

import java.util.Scanner;

public class W4CountGrade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of students:");
		int number = sc.nextInt();
		
		int[] marks = new int[number];
		for(int i=0; i<marks.length; i++) {
			// receive mark and store in marks[i]
			System.out.print("Insert marks[" + i + "]:");
			marks[i] = sc.nextInt();
		}
		
		System.out.println("0 <= mark < 70, Grade = U");
		System.out.println("70 <= mark <= 100, Grade = S");
		int countS = 0; // number of S
		int countU = 0; // number of U
		int countE = 0; // number of Error
		for(int i=0; i<marks.length; i++) {
			if(marks[i] < 0 || marks[i] > 100) {
				++countE; // increase number of Error
			} else if(marks[i] < 70) {
				++countU; // increase number of U
			} else {
				++countS; // increase number of S
			}
		}
		
		System.out.println("countS:" + countS);
		System.out.println("countU:" + countU);
		System.out.println("countE:" + countE);
		
	}

}
