package testes.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseASentence {
	
	public static void main(String[] args) {
		String in = "My name is Marcelo";
		
		
		//Reversing words
		String[] words = in.split(" ");		
		System.out.println(Arrays.toString(words));		
		List<String> wordsList = Arrays.asList(words);
		
		Collections.reverse(wordsList);		
		wordsList.forEach(s -> System.out.print(s + " "));
		
		//Reverse letters		
		StringBuffer sbf = new StringBuffer(in);		
		System.out.println("\n" + sbf.reverse().toString().toLowerCase());				
	}
}
