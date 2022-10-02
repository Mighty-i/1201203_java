package lect06;

public class WaterBill {
	public static double calculating(int units) {
		double bill = ' ';
		double amount1 = 30*3;
		double amount2 = amount1+(20*4);
		
		if(units <= 30) {
			bill = units*3;
		}else if(units <= 50){
			bill = amount1+((units-20)*4);
		}else {
			bill = amount2+((units-50)*5);
		}
		return bill;
	}

}
