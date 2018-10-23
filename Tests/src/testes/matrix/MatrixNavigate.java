package testes.matrix;

public class MatrixNavigate {
	
	/*
	 * This class navigates into a matrix and find the number of possible ways from A position to B position, just going to up and front.
	 * 
	 */
	public static void main(String[] args) {
		
		String in  = "(1 1)(4 4)";		
		String[][] tabul = new String[7][7]; 
		
		int x = Integer.parseInt(in.substring(1,2));
		int y = Integer.parseInt(in.substring(3,4));
		int a = Integer.parseInt(in.substring(6,7));
		int b = Integer.parseInt(in.substring(8,9));				
		
		String linha = "";
		
		linha = print(tabul, x, y, a, b, linha);
		
		long n = (a - x) + (b - y);
        long r = a - x;
        
        System.out.println("n " + n);
        System.out.println("r " + r);
        
        System.out.println("Fatorial " + n + " " + factorial(n));
        System.out.println("Fatorial " + r + " " + factorial(r));
        
        System.out.println((int)(factorial(n) / (factorial(r) * factorial(n - r))));
		
	}

	private static String print(String[][] tabul, int x, int y, int a, int b, String linha) {
		for (int i = 0; i < tabul.length; i++) {
			for (int j = 0; j < tabul[i].length; j++) {
				if(i+1 == x && j+1 == y || i+1 == a && j+1 == b) {
					tabul[i][j] = "# ";
				}else {
					tabul[i][j] = "0 ";
				}
				linha = linha + tabul[i][j];				
			}
			System.out.println(linha + "\t");
			linha = "";
		}
		return linha;
	}
	
	private static long factorial(long n) {
        return (n < 2 ? 1 : n * factorial(n - 1));
    }

}

