package testes.challenges.hackerhank;

import java.util.Scanner;

public class EndOfAFile {
	
	public static void main(String[] args) {
		
		System.out.println("Write a text block");
		Scanner scanner = new Scanner(System.in);		
		scanner.useDelimiter("\n");
		
		//String str = scanner.next();
		
        for(int i = 0; scanner.hasNextLine(); i++) {        	
        	System.out.println(i + " " + scanner.next());
		}    
        scanner.close();
	}
}
