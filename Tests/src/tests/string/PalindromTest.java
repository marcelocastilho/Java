package tests.string;

public class PalindromTest {
	
	public static void main(String[] args) {
		
		String in = "8102018";
		String test2 = "08102018";
		
		StringBuilder builder = new StringBuilder(test2); 
		
		System.out.println(builder.reverse().toString());
		
		
		
	}

}
