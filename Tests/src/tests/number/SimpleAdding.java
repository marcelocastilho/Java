package tests.number;

public class SimpleAdding {

	public static void main(String[] args) {
		
		int number = 8;
		int total = 0;
		
		for (int i = 1; i <= number; i++) {
			total = total + i;
		}
		
		System.out.println(total);
	}
}
