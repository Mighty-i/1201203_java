package lect08;

public class W4SumAverage {
	
	public static void main(String[] args) {
		
		int[] a = {-22, 138, 9, -9210, 3018, -12345};

		int sum = 0;
		double average = 0;
		for(int i=0; i<a.length; i++) {
			
			sum += a[i];
		}
		average = sum/a.length;
		
		System.out.println("sum:" + sum + ", average:" + average);
		
	}

}
