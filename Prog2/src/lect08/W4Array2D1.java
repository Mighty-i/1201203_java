package lect08;

public class W4Array2D1 {

	public static void main(String[] args) {
		
		int[][] a = new int[3][2];
		a[0][0] = -5;
		a[0][1] = 20;
		a[1][0] = -2;
		a[1][1] = 0;
		a[2][0] = 3;
		a[2][1] = 9;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "]:" + a[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("row x col --------------------------");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + (j<a[i].length-1?"\t":"\n"));
			}
		}
				
	}

}
