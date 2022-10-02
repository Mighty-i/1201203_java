package lect04test;

public class Goods {
	long code;
	String nameGoods;
	int price;
	int stock;
	
	public Goods(long code,String nameGoods,int price,int stock) {
		this.code = code;
		this.nameGoods = nameGoods;
		this.price = price;
		this.stock = stock;
	}
	
	public String toString() {
		return "Code: "+this.code+" Name Goods: "+this.nameGoods+
				" Price: "+this.price+" Stock: "+this.stock;
	}

}
