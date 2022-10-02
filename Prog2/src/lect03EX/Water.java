package lect03EX;

public class Water {
	int units;
	double bill;
	
	public Water(int units) {
		this.units = units;
		this.bill = ' ';
	}
	public String toString() {
		return "Used Water: "+this.units+" Units, Water bill: "+this.bill+" Baht";
	}

}
