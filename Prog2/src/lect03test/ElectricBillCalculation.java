package lect03test;

public class ElectricBillCalculation {
	public static double calculating(int units) {
		double bill = ' ';
		double amount1 = 15*2.3488;
		double amount2 = amount1+(10*2.9882);
		double amount3 = amount2+(10*3.2405);
		double amount4 = amount3+(65*3.6237);
		double amount5 = amount4+(50*3.7171);
		double amount6 = amount5+(250*4.2218);
		
		if(units <= 25) {
			bill = units*2.3488;
		}else if(units <= 25) {
			bill = amount1+((units-15)*2.9882);
		}else if(units <= 35) {
			bill = amount2+((units-25)*3.2405);
		}else if(units <= 100) {
			bill = amount3+((units-35)*3.6237);
		}else if(units <= 150) {
			bill = amount4+((units-100)*3.7171);
		}else if(units <= 400) {
			bill = amount5+((units-150)*4.4217);
		}else {
			bill = amount6+((units-400)*4.4271);
		}
		return bill + 8.19;
		
	}

}
