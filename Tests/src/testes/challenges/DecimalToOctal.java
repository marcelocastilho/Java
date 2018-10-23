package testes.challenges;

public class DecimalToOctal {
	
	public static void main(String[] args) {
		
		int decimal = 81;		
		int octal = Integer.parseInt(Integer.toString(decimal,8));
		
		System.out.println(octal);		
		decimal = Integer.parseInt(String.valueOf(octal),8);
		System.out.println(decimal);	
	    
	}
}
