package tests.string;

public class FindThePlusBeforeAllLetters {

	public static void main(String[] args) {

		String toFind = "f++d+";
		boolean allFine = true;
		char[] c_arr = toFind.toCharArray(); 

		if(toFind.length() < 2) {
			allFine = false;
			return;
		}
		
		boolean auxHasPlusBefore = false;
		
		for (int i = 0; i < c_arr.length; i++) {
			char c = c_arr[i];

			if(c == '+') {
				auxHasPlusBefore = true;
				continue;
			}			
			if( Character.isLetter(c) )  {
				if( !auxHasPlusBefore) {
					allFine = false;
					break;
				}else {
					auxHasPlusBefore = false;					
				}							
			}
		}			
	}
}
