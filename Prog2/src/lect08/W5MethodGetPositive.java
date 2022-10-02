package lect08;

import java.util.Scanner;

public class W5MethodGetPositive {

	public static int getPositive() {

		int pos = -1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Insert positive number:");
			pos = sc.nextInt();
		} while (pos <= 0);
		return pos;
	}

	public static void main(String[] args) {

		int a = getPositive();
		System.out.println("positive number a:" + a);

	}

}
