package lect08;

public class W4ArrayMax {
	
	public static void main(String[] args) {
		
		int[] a = {-22, 138, 9, -9210, 3018, -12345};
		int maxValue = Integer.MIN_VALUE;
		int maxIndex = -1;
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "]:" + a[i]);
			if(a[i] > maxValue) {
				maxValue = a[i];
				maxIndex = i;				
			}
			
		}
	}

}
