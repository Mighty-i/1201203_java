package lect06;

public class Water {
	
	double bill;
	int units;
	
	public Water (int units) {
		this.bill = 0;
		this.units = units;
	}
	
	public String toString() {
		return "Used Units : "+this.units+" Unit , bill is :"+this.bill+" Baht ";
	}
	
}