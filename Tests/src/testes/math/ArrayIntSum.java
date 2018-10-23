package testes.math;

import java.util.Arrays;

public class ArrayIntSum {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		int i = 2111;
		ArrayIntSum teste = new ArrayIntSum();
		teste.makeReduce(i);
		System.out.println("Numero de loops:" + count); 
		       
	}
	
	private void makeReduce(int in) {		
		count++;
		
		//Tranformar em string para colocar 0 a esquerda
		String inStr = String.valueOf(in);
		
		if(inStr.length() < 4) {
			
			for(int i = inStr.length() ; i < 4; i++ ) {			
				inStr = "0" + inStr;
			}
		}		
		
		char[] sortedArray = inStr.toCharArray();
			
		Arrays.sort(sortedArray);
		
		int valueA = Integer.parseInt(new String(sortedArray));
		System.out.println(valueA);
			
		StringBuilder builder = new StringBuilder(new String(sortedArray)); 
		
		int valueB = Integer.parseInt(new String(builder.reverse().toString()));
		System.out.println(valueB);
		
		int newValue = valueB-valueA;
		
		if ( newValue == 6174) {
			return; 
		}else {
			makeReduce(newValue);
		}	
	}
}
