package lect04test;

public class Customer {
	long id;
	String name;
	String surname;
	String birthdate;
	String houseNo;
	String villageNo;
	String subarea;
	String area;
	String province;
	String phonenumber;
	
	public Customer(long id,String name,String surname,String birthdate,String houseNo,
			String villageNo,String subarea,String area,String province,String phonenumber) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.houseNo = houseNo;
		this.villageNo = villageNo;
		this.subarea = subarea;
		this.area = area;
		this.province = province;
		this.phonenumber = phonenumber;
	}
	public String toString() {
		return "__________________________\n"+
				"ID Customer: "+this.id+"\n"+
				"Name: "+this.name+"\n"+
				"Surname: "+this.surname+"\n"+
				"Birthdate: "+this.birthdate+"\n"+
				"HouseNo: "+this.houseNo+"\n"+
				"VillageNo: "+this.villageNo+"\n"+
				"Subarea: "+this.subarea+"\n"+
				"Area: "+this.area+"\n"+
				"Province: "+this.province+"\n"+
				"Phonenumber: "+this.phonenumber+"\n"+
				"__________________________\n";
				
	}

}
