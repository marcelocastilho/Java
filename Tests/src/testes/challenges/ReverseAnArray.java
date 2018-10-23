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
		int[] arr = new int[10];
		Scanner scan= new Scanner(System.in);
		for(int i =0;i<10;i++)
		{
			System.out.println("Enter the array elements["+i+"]:");
			arr[i]=scan.nextInt();
		}
		
		List aaa = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			aaa.add(arr[i]);
		}
		
		
		//write your logic here
		List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Collections.reverse(arrayList);
		arrayList.forEach(s -> System.out.print(s));
	}
}
