package lect09;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "ABC";
		String str3 = "123";
		String str4 = "0123";
		
		int cmp = str1.compareTo(str1);
		System.out.println("cmp:" + cmp);
		cmp = str1.compareTo(str2);
		System.out.println("cmp:" + cmp);
		cmp = str1.compareToIgnoreCase(str2);
		System.out.println("cmp:" + cmp);
		boolean eq = str1.equals(str2);
		System.out.println("eq:" + eq);
		eq = str1.equalsIgnoreCase(str2);
		System.out.println("eq:" + eq);
	}

}
