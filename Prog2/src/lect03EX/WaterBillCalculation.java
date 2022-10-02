package lect03EX;

public class WaterBillCalculation {
	public static double calculating(int units) {
		double bill = ' ';
		double amount1 = 10*10.2;
		double amount2 = amount1+(10*16);
		double amount3 = amount2+(10*19);
		
		if(units <= 10) {
			bill = units*10.2;
		}else if(units <= 20) {
			bill = amount1+((units-10)*16);
		}else if(units <= 30) {
			bill = amount2+((units-20)*19);
		}else {
			bill = amount3+((units-30)*21.2);
		}
		return bill;
	}

}
