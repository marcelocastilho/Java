package tests.string;

public class capitalizeNextToSpace {

	public static void main(String[] args) {

		String toChange = "hello world";
		StringBuilder toReturn = new StringBuilder();

		char[] c_arr = toChange.toCharArray(); 

		for (int i = 0; i < c_arr.length; i++) {
			char c = c_arr[i];
			
			if(i == 0) {
				toReturn.append(Character.toUpperCase(c));	
				continue;
			}			
			
			if(Character.isWhitespace(c) && Character.isLetter(c_arr[i+1])) {								
				char newChar = Character.toUpperCase(c_arr[i+1]);				
				toReturn.append(" " + newChar);				
				i++;
			}else {
				toReturn.append(c);
			}
		}
		System.out.println(toReturn.toString());	
	}
}
