package lect08;

public class W4Array2D2 {
	
	public static void main(String[] args) {
		
		int[][] a = {
				{-5, 20},
				{-2, 0},
				{3, 9}
		};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "]:" + a[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("matrix a --------------------------");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + (j<a[i].length-1?"\t":"\n"));
			}
		}

		// transpose
		int aRow = a.length;
		int aCol = a[0].length;
		int bRow = aCol;
		int bCol = aRow;
		int[][] b = new int[bRow][bCol];
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		System.out.println("matrix b --------------------------");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + (j<b[i].length-1?"\t":"\n"));
			}
		}

		
	}

}
