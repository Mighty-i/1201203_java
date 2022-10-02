package lect03test01;
import java.util.Scanner;

public class Grader3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("mark:");
		int mark = sc.nextInt();
		char grade = ' ';
		if(mark<60) {
			grade = 'U';
		}else {
			grade = 'S';
		}
		System.out.print("Grade:"+grade);
		sc.close();
	}

}
