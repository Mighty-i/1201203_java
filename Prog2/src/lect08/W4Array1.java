package lect08;

public class W4Array1 {
	
	public static void main(String[] args) {
		
		int[] a = new int[4];
		a[0] = -5;
		a[1] = -2;
		a[2] = 0;
		a[3] = 3;
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println("a[" + i + "]:" + a[i]);
		}
		
	}

}
