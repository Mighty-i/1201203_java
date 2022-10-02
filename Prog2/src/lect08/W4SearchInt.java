package lect08;

public class W4SearchInt {
	
	public static void main(String[] args) {
		
		int[] a = {-22, 138, 9, -9210, 3018, -12345};

		int key1 = 9;
		int index = -1;
		boolean found = false;
		
		for(int i=0; i<a.length; i++) {
			if(key1 == a[i]) {
				index = i;
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("found:" + found + ", index:" + index + ", a[" + index + "]:" + a[index]);
		} else {
			System.out.println("Error! found:" + found);
		}
	}

}
