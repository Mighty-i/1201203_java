package lect08;

public class W5MethodVoid2 {
	
	public static void analyzeString(String string) {
		
		System.out.println("in analyzeString");
		System.out.println("string:" + string);
		
		int stringLength = string.length();
		System.out.println("stringLength:" + stringLength);
		
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
				'u', 'v', 'w', 'x', 'y', 'z'
		};
		
		int[] freq = new int[letters.length];
		for(int i=0; i<stringLength; i++) {
			char letter = string.charAt(i);
			for(int j=0; j<letters.length; j++) {
				if(letter == letters[j]) {
					++freq[j]; 
				}
			}
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i] > 0) {
				System.out.println("freq[" + letters[i] + "]:" + freq[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String fullName = "somchai jaidee";
		analyzeString(fullName);
		
	}

}
