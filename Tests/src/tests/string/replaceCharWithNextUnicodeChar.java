package tests.string;

public class replaceCharWithNextUnicodeChar {
	
	public static void main(String[] args) {
		
		String toChange = "fun times!";
		StringBuilder toReturn = new StringBuilder();
		
		char[] c_arr = toChange.toCharArray(); 
		
		for (char c : c_arr) {
			int code = c;
			if(Character.isLetter(c)) {
				char newChar = (char) (code+1);
				if (newChar == 'a' || newChar == 'e' || newChar == 'i' || newChar == 'o' || newChar == 'u'  ) {
					newChar = Character.toUpperCase(newChar);
				}
				toReturn.append(newChar);				
			}else {
				toReturn.append(c);
			}
		}
		System.out.println(toReturn.toString());	
	}

}
