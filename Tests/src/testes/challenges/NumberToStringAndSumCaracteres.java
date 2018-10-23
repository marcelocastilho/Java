package testes.challenges;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumberToStringAndSumCaracteres {

	public static void main(String[] args) {

		int i = 131083;

		//java 8
		int sum = Stream.of(String.valueOf(i).split(""))
				.mapToInt(Integer::parseInt)
				.sum();

		System.out.println(Stream.of(String.valueOf(sum).split(""))
				.mapToInt(Integer::parseInt)
				.sum());

		//java 7		
		char[] intChars = String.valueOf(i).toCharArray();
		int sum1 = 0;		
		for (char c : intChars) {
			sum1 += Character.getNumericValue(c);
		}
		
		intChars = String.valueOf(sum1).toCharArray();
		int sum2 = 0;		
		for (char c : intChars) {
			sum2 += Character.getNumericValue(c);
		}
		System.out.println("Sum2: " + sum2);
	}
}
