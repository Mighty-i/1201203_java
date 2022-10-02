package lect08;

public class W5MethodReverse {
	
	public static int[] reverse(int[] a) {
		
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			int j= a.length - 1 - i;
			b[j] = a[i];
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		
		int[] a = { -10, -5, 0, 5, 10};
		int[] b = reverse(a);
		System.out.print("b:");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + (i<b.length-1?"\t":"\n"));
		}
	}

}
