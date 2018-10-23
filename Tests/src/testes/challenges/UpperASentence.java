package testes.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperASentence {
	
	public static void main(String[] args) throws IOException 
	  {
	   
	    String str = "welcome to Programr!";
	        
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter a string:"); 
	    str = br.readLine();
	    
	    str = str.toUpperCase();
	 
	    System.out.println(str);
	    
	  }

}
