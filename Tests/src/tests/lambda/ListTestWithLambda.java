package tests.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListTestWithLambda {

	public static void main(String[] args) {


		List<String> words = Arrays.asList("rodrigo", "paulo", "marcelox");
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(1, 3);

		System.out.println("Size: " + numeros.size());
		System.out.println("Original sequence");

		numeros.forEach(n -> System.out.println(n) );

		numeros.sort(null);

		System.out.println("Sorted !!!");

		numeros.forEach(s -> System.out.println(s));
		
		Comparator<String> comparator = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length()); 
			}
		};

		Comparator<String> lambdaComparator = (s1,s2) -> {
			return Integer.compare(s2.length(), s1.length());			
		};
		
		words.sort(lambdaComparator);
		//ultra lambda comparator
		words.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
		
		System.out.println("Lambda sorted by length >");
		
		words.forEach(s -> System.out.println(s));
		
		words.sort(comparator);		
		System.out.println("List sorted by length <");
		
		words.forEach(s -> System.out.println(s));
		
		ArrayList<Integer> aaa = new ArrayList<Integer>();
		aaa.add(5654);
		aaa.add(874);
		aaa.add(623);
		aaa.add(111);
		aaa.sort(Integer::compare);
		aaa.forEach(s -> { if(s % 2 == 0) { System.out.println(s);System.out.println("Do karalho!!!");}});
	}
}