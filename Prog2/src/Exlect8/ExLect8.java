package Exlect8;

public class ExLect8 {

	public static final int ANSWER_1ST_LINE = 2;
	public static final int ANSWER_ID_COL = 1;
	public static final int ANSWER_1ST_COL = 2;

	public static int searchStringArray(String[] arr, String str) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				index = 1;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		String enrollFile = "src/exlect8/enroll.csv";
		String answerFile = "src/exlect8/midterm-answer.csv";
		String phattFile = "src/exlect8/phatt-answer.csv";

		String[] enrollarr = ReadTextFile.readTextFile(enrollFile);
		String[] answerarr = ReadTextFile.readTextFile(answerFile);
		String[] phattarr = ReadTextFile.readTextFile(phattFile);

		System.out.println("Mark answerArr...");

		String[] ans = phattarr[0].split(",");

		for (int i = ANSWER_1ST_LINE; i < answerarr.length; i++) {

			String[] choices = answerarr[i].split(",");
			String id = choices[ANSWER_ID_COL];
			int totalMark = 0;

			int index = searchStringArray(answerarr, id);
			if (index > -1) {

				System.out.println("CORRECTED_ANSWER MARKED! ID:" + id);
				continue;
			}

			index = searchStringArray(enrollarr, id);
			if (index < 0) {

				System.err.println("ERROR! ID NOT FOUND: " + id);
				continue;
			}
			System.out.print("ID:" + id + " ");
			for (int j = ANSWER_1ST_COL; j < choices.length; j++) {
				if (choices[j].equals(ans[j - ANSWER_1ST_COL])) {
					totalMark += 1;
					System.out.print((j - 1) + ")" + choices[j] + ":" + ans[j - 2] + "=" + "1" + " ");
				} else {
					System.out.print((j - 1) + ")" + choices[j] + ":" + ans[j - 2] + "=" + "0" + " ");
				}
			}

			System.out.println("totalMark:" + totalMark);
		}

	}

}
