package lect03EX;

public class Tax {
	int income;
	int tax;
	
	public Tax(int income) {
		this.income = income;
		this.tax = ' ';
	}
	public String toString() {
		return "Income : "+this.income+" Baht, Tax : "+this.tax+" Baht";
	}

}
