package lect03test;

public class TaxCalculation {
	public static int calculating(int income) {
		int tax = ' ';
		int amount1 = 7500;
		int amount2 = amount1+20000;
		int amount3 = amount2+37500;
		int amount4 = amount3+50000;
		int amount5 = amount4+250000;
		int amount6 = amount5+900000;
		
		if(income <= 150000) {
			tax = 0;
		}else if(income <= 300000) {
			tax = ((income-150000)/100)*5;
		}else if(income <= 500000) {
			tax = amount1+(((income-300000)/100)*10);
		}else if(income <= 750000) {
			tax = amount2+(((income-500000)/100)*15);
		}else if(income <= 1000000) {
			tax = amount3+(((income-750000)/100)*20);
		}else if(income <= 2000000) {
			tax = amount4+(((income-1000000)/100)*25);
		}else if(income <= 5000000) {
			tax = amount5+(((income-2000000)/100)*30);
		}else {
			tax = amount6+(((income-5000000)/100)*35);
		}
		return tax;
	}

}
