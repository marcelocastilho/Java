package testes.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAnArray {

	//write your logic here

	public static void main(String a[]) throws Exception
	{
		Scanner scan= new Scanner(System.in);

		System.out.println("Enter the array elements seppareted by blank spaces, in the first one the array lenght Ex. 3 1 3 4 5");
		
		int lenght = scan.nextInt();
		
		int[] arr = new int[lenght];
		
		for(int i = 0; i < lenght; i++){		
			arr[i] = scan.nextInt();			
		}
		
		//Logic here
		List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Collections.reverse(arrayList);
				
		int[] response =  arrayList.stream().mapToInt(i -> i).toArray();
		
		System.out.println(Arrays.toString(response));
		
	}
}
