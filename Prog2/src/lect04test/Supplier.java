package lect04test;

public class Supplier {
	
	long id;
	String companyname;
	String houseNo;
	String villageNo;
	String subarea;
	String area;
	String province;
	String phonenumber;
	
	public Supplier(long id,String companyname,String houseNo,String villageNo,String subarea,
			String area,String province,String phonenumber) {
		this.id = id;
		this.companyname = companyname;
		this.houseNo = houseNo;
		this.villageNo = villageNo;
		this.subarea = subarea;
		this.area = area;
		this.province = province;
		this.phonenumber = phonenumber;
	}
	public String toString() {
		return "__________________________\n"+
				"ID Company: "+this.id+"\n"+
				"Companyname: "+this.companyname+"\n"+
				"HouseNo: "+this.houseNo+"\n"+
				"VillageNo: "+this.villageNo+"\n"+
				"Subarea: "+this.subarea+"\n"+
				"Area: "+this.area+"\n"+
				"Province: "+this.province+"\n"+
				"Phonenumber: "+this.phonenumber+"\n"+
				"__________________________\n";
				
	}

}
