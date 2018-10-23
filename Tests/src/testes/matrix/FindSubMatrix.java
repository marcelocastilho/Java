package testes.matrix;

/*
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
*/ 

public class FindSubMatrix {
	
	public static void main(String[] args) {
			
		String [][] matrix1 = new String[4][5];
				
		createMatrix(matrix1);		

		int rows = matrix1.length -1;
		int coluns = matrix1[0].length -1;
		String line = "";
		
		System.out.println("Rows: " + rows);
		System.out.println("Coluns: " + coluns);
				
		for(int r = 0; r < matrix1.length/2; r++) {
			coluns =  matrix1[r].length - 1;
			
			for(int c = 0; c < matrix1[r].length; c++) {				
				line = line + matrix1[r][c];
				System.out.println(r + "" + c + " vs " + rows + "" + coluns);
				if(matrix1[r][c].equals("1") && matrix1[rows][coluns].equals("1")) {
					System.out.println("True");
				}else {
					coluns--;
					continue;					
				}						
			}			
			
			line = line + "\n";			
		}
		System.out.println(line);
	}

	private static void createMatrix(String[][] matrix1) {
		
		matrix1[0][0] = "1";
		matrix1[0][1] = "0";
		matrix1[0][2] = "1";
		matrix1[0][3] = "0";
		matrix1[0][4] = "0";
		
		matrix1[1][0] = "1";
		matrix1[1][1] = "0";
		matrix1[1][2] = "1";
		matrix1[1][3] = "1";
		matrix1[1][4] = "1";

		matrix1[2][0] = "1";
		matrix1[2][1] = "1";
		matrix1[2][2] = "1";
		matrix1[2][3] = "1";
		matrix1[2][4] = "1";
		
		matrix1[3][0] = "1";
		matrix1[3][1] = "0";
		matrix1[3][2] = "0";
		matrix1[3][3] = "1";
		matrix1[3][4] = "0";	
	}
}