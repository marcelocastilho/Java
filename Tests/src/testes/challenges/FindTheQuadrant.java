package testes.challenges;

import java.util.Scanner;

public class FindTheQuadrant {

	public static void main(String[] args) {
		  
		while(true) {
		  int angle = 0;
		  int quadrant = 0;
	      System.out.println("Type an integer angle (in degrees) and press Enter:");
	      Scanner sc = new Scanner(System.in);
	      angle= sc.nextInt();

	      if(angle ==0)
	    	  break;
	     
	      if(angle%90 ==0)
	    	  quadrant = angle/90;
	      else 
	    	  quadrant = angle/90+1;
	      System.out.println(quadrant);
	     
		}
	}
}
