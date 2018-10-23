package testes.challenges;

public class PrintRectangle {

	public static void main(String[] args) {


		int l = 10;
		int w = 5;
		boolean firstLine = true;
		boolean lasttLine = false;

		StringBuilder out = new StringBuilder() ;

		for (int i = 0; i < w; i++) {		
			for (int j = 0; j < l; j++) {
				if(i == w-1)
					lasttLine = true;
				if(firstLine || lasttLine) {
					out.append("*");	
				}else if(j == 0 || j == l-1 ) {
					out.append("*");
				}else {
					out.append(" ");
				}		
			}
			firstLine = false;
			out.append("\n");
		}
		System.out.println(out);
	}
}
