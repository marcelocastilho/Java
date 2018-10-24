package testes.challenges.hackerhank;

public class Loops2 {

	public static void main(String[] args) {
		
		
		String inn = "2\n" + 
				"0 2 10\n" + 
				"5 3 5\n";
		
		String[] innArray = inn.split("\n");
		
		
		int initialLoops = Integer.parseInt(innArray[0]);
		
		for (int loop1 = 0; loop1 < initialLoops; loop1++) {
			
			int a =  Integer.parseInt(innArray[loop1+1].split(" ")[0]);
			int b = Integer.parseInt(innArray[loop1+1].split(" ")[1]);
			int n = Integer.parseInt(innArray[loop1+1].split(" ")[2]);
			int total = 0;
			
			total = (int) (a + (Math.pow(1, 0)) * b);
			System.out.print(total + " ");

			for (int i = 2; i < n+1; i++) {		
				total += (Math.pow(2, i-1)) * b;
				System.out.print(total + " ");
			}
			System.out.println();
		}
	}
}
