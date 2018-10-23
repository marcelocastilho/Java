package tests.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaAndArray {

	public static void main(String[] args) {
		
		double[] d = {8, 7, -4, 5, -6};
		System.out.println("Original array: " + Arrays.toString(d));
		d = Arrays.stream(d).filter(x -> x > -5).toArray();
		System.out.println("Filtered by > -5: " + Arrays.toString(d));
		
		Comparator<Double> lambdaComparator = (s1,s2) -> {
			return Double.compare(s2, s1);			
		};		
		d = Arrays.stream(d).boxed().sorted((s1,s2) -> Double.compare(s2, s1)).mapToDouble(num -> num.doubleValue()).toArray();		
		System.out.println("Sorting using comparator: " + Arrays.toString(d));
		 
		//System.out.println(Arrays.stream(d).sorted().boxed().sorted(lambdaComparator).mapToDouble(num -> num.doubleValue()));
		d = Arrays.stream(d).sorted().toArray();
		System.out.println("Natural sorting: " +Arrays.toString(d));
				
		//d => [8, 7, 5]
		//If you want to filter a reference array that is not an Object[] you will need to use the toArray method which takes an IntFunction to get an array of the original type as the result:

		String[] a = { "s", "", "1", "", "" };
		a = Arrays.stream(a).filter(s -> !s.isEmpty()).toArray(String[]::new);
		System.out.println(Arrays.toString(a));
	}
	
}
