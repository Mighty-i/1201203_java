package lect08;

public class W4NameSectMark {
	
	public static void main(String[] args) {
		
		final int SECT = 0;
		final int MARK = 1;
		
		String[] names = {"somchai", "nakorn", "wanchai"};
		int[][] sectMarks = {
				{1, 20},
				{2, 55},
				{3, 60}
		};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("name:" + names[i] 
					+ ", sect:" + sectMarks[i][SECT] 
					+ ", mark:" + sectMarks[i][MARK]);
		}
	}

}
