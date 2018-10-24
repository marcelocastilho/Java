package testes.challenges;

import java.util.Iterator;
import java.util.Scanner;

public class FindChar1 {

	public static void main(String[] args) {
		System.out.println("Enter the Maximum value:");
		Scanner sc1 = new Scanner(System.in);

		int min = sc1.nextInt();
		long max = sc1.nextLong();

		int count = 0;

		for(int i=min; i<=(int)max;i++)
		{
			char[] charArray = String.valueOf(i).toCharArray();
			for (char c : charArray) {
				if(Character.isDigit(c) && "1".equals(Character.toString(c))) {
					count++;
				}
			}	
		}
		System.out.println("Total sum of count of 1s:" + count); 
	}
}
