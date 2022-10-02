package lect08;

public class W5MethodArray {
	
	public static int[] increaseReverse(int[] a) {
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			int j= a.length - 1 - i;
			b[j] = a[i];
			a[i] += 5;
		}
		
		return b;
	
	}
	
	public static void main(String[] args) {
		int[] a = { -10, -5, 0, 5, 10};
		System.out.print("a:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + (i<a.length-1?"\t":"\n"));
		}
		int[] b = increaseReverse(a);
		System.out.print("a:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + (i<a.length-1?"\t":"\n"));
		}
		System.out.print("b:");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + (i<b.length-1?"\t":"\n"));
		}

	}

}
