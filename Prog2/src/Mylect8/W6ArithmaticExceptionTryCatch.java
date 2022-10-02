package Mylect8;

public class W6ArithmaticExceptionTryCatch {

	public static void main(String[] args) {
		int x = 200;
		int y = 0;
		try {
			int z = x / y;
			System.out.println(" x / y = " + z);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			String msg = ex.getMessage();
			System.out.println("msg:" + msg);
		}

	}

}
