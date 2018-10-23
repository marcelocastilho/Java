package tests.string;

import java.util.Arrays;

public class StringSort {
	
	public static void main(String[] args) {
		
		String in = "coderbyte";
		String out = "";				
		char[] c_arr = in.toCharArray(); 
		
		Arrays.sort(c_arr);
		out = new String(c_arr);		
		System.out.println(out);		
	}
}
