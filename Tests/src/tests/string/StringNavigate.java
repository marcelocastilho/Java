package tests.string;

public class StringNavigate {
	
	public static void main(String[] args) {
		
		//String in = "acc?7??sss?3rr1??????5";
		//String in = "aa6?9";
		//String in = "arrb6???4xxbl5???eee5";
		String in = "5??aaaaaaaaaaaaaaaaaaa?5?5";
		
		boolean firstNumberPassed = false;
		int firstNumber = 0;
		int numberOfInterrogation = 0;		
		boolean allFine = false;
		
		char[] listOfChar = in.toCharArray(); 
		
		for (int i = 0; i < listOfChar.length; i++) {
			char actualChar = listOfChar[i];
			
			if(Character.isLetter(actualChar)) {
				continue;
			}else if(actualChar == '?') {
				numberOfInterrogation++;
				continue;
			}else if(Character.isDigit(actualChar) && !firstNumberPassed){
				firstNumber = Integer.parseInt(String.valueOf(actualChar));
				firstNumberPassed = true;
				numberOfInterrogation = 0;
				allFine = false;
				continue;
			}else if( Character.isDigit(actualChar) && firstNumberPassed) {
				
				//verifica a soma dos numeros
				if(numberOfInterrogation == 3 && (firstNumber + Integer.parseInt(String.valueOf(actualChar)) == 10) ) {
					allFine = true;				
				}else if(numberOfInterrogation > 3 && (firstNumber + Integer.parseInt(String.valueOf(actualChar)) != 10) ) {
					allFine = true;
					continue;
				}
				firstNumber = 0;
				firstNumberPassed = false;
				numberOfInterrogation = 0;
				continue;
			}else if(Character.isDigit(actualChar) && firstNumberPassed && numberOfInterrogation != 3) {
				allFine = false;
				break;
			}
		}
		
		System.out.println(allFine);
	}
}
