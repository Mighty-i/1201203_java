package lect04test;

import java.util.Scanner;

public class GoodsMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Code Goods: ");
		long code = sc.nextLong();
		
		System.out.print("Input name Goods: ");
		String nameGoods = sc.next();
		
		System.out.print("Input Price: ");
		int price = sc.nextInt();
		
		System.out.print("Input Stock: ");
		int stock = sc.nextInt();
		
		Goods obj = new Goods(code,nameGoods,price,stock);
		System.out.print(obj.toString());
		sc.close();
	}

}
