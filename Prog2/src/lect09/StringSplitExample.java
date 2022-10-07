package lect09;

public class StringSplitExample {
	
	public static void viewStringArr(String[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("arr[" + i + "]:" + arr[i]);
			
		}
		System.out.println("---");
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "abc, def, ghi";
		String[] arr1 = str1.split(",");
		viewStringArr(arr1);
				
		String[] arr2 = str1.split(" ");
		viewStringArr(arr2);
		
		String[] arr3 = str1.split(", ");
		viewStringArr(arr3);
		
		String str2 = "abc,,  def,,  ghi";
		String[] arr4 = str2.split(",");
		viewStringArr(arr4);
				
		String[] arr5 = str2.split(" ");
		viewStringArr(arr5);
		
		String[] arr6 = str2.split(", ");
		viewStringArr(arr6);
	}

}
