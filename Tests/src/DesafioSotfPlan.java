import java.util.Arrays;

public class DesafioSotfPlan {

	public static void main(String[] args) {

		int n = 2;
		String seats = "1A 2F 1C";
		
		int freeSeats = solution(n, seats);
		System.out.println(freeSeats);
		
	}

	public static int solution(int N, String S) {
		int intReturn = 0;

		String[][] allSeats = new String[N][10];		
						
		//cria lista total de poltronas
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 10; j++) {
				allSeats[i][j] = (i+1) + getSeatLetter(j);
			}
		}
		
		//verifica disponilibidade
		for(int i = 0; i < N; i++) {
			System.out.println("Seat1: " + allSeats[i][0]);			
			
			if(S.indexOf(allSeats[i][0]) < 0 && S.indexOf(allSeats[i][1]) < 0 && S.indexOf(allSeats[i][2]) < 0){
				intReturn ++;
			}
			if((S.indexOf(allSeats[i][3]) < 0 && S.indexOf(allSeats[i][4]) < 0 && S.indexOf(allSeats[i][5]) < 0) 
					|| (S.indexOf(allSeats[i][4]) < 0 && S.indexOf(allSeats[i][5]) < 0 && S.indexOf(allSeats[i][6]) < 0)){
				intReturn ++;
			}		
			if(S.indexOf(allSeats[i][7]) < 0 && S.indexOf(allSeats[i][8]) < 0 && S.indexOf(allSeats[i][9]) < 0){
				intReturn ++;
			}
		}
		
		return intReturn;
	}
	
	public static String getSeatLetter(int seatNumber ) {
		
		String seatLetter = null;
		switch(seatNumber) {
			case 0: seatLetter = "A"; break;
			case 1: seatLetter = "B"; break;
			case 2: seatLetter = "C"; break;
			case 3: seatLetter = "D"; break;
			case 4: seatLetter = "E"; break;
			case 5: seatLetter = "F"; break;
			case 6: seatLetter = "G"; break;
			case 7: seatLetter = "H"; break;
			case 8: seatLetter = "J"; break;
			case 9: seatLetter = "K"; break;					
		}
		return seatLetter;
	}

}
