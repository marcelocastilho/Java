package tests.loops;

import java.util.Arrays;

public class ArraysAndLoopsTests {

	enum SORT_TYPE{ENCREASING,DECREASING;}

	public static void main(String[] args) {
		int[] intArray = new int[]{ 10, 12, 8, 2, 50, 68, 4, 9, 17, 20, 10, 33, 44, 55, 66, 77, 88, 99, 61, 83, 74, 58, 96, 51, 1, 25, 38, 49, 85, 92};

		int numberToFind = 88;
		System.out.println("Encontrado o numero " + numberToFind + " na lista? " + findInArray(intArray, numberToFind));

		int minNumber = 1;
		int maxNumber = 25;
		System.out.println("Numero primos entre: " + minNumber + " e " + maxNumber + ": " + Arrays.toString(findOddNumberInArray(minNumber, maxNumber))); 

		sortAnArray(intArray, SORT_TYPE.ENCREASING);
		System.out.println("Numeros agora em order: \n" + Arrays.toString(intArray));
		
		int[] test1 = new int[]{1,2,3};
		System.out.println(Arrays.toString(test1));
		System.out.println("Proximo numero sequencial positivo: " + findNextSequencialPositiveNumber(test1)); 
		
		int[] test2 = new int[]{1,2,3,4,9};
		System.out.println(Arrays.toString(test2));
		System.out.println("Proximo numero sequencial positivo: " + findNextSequencialPositiveNumber(test2));
		
		int[] test3 = new int[]{-1,-3};
		System.out.println(Arrays.toString(test3));
		System.out.println("Proximo numero sequencial positivo: " + findNextSequencialPositiveNumber(test3)); 
		
		int[] test4 = new int[]{-1,-3,7};
		System.out.println(Arrays.toString(test4));
		System.out.println("Proximo numero sequencial positivo: " + findNextSequencialPositiveNumber(test4)); 
		
		int[] test5 = new int[]{0,1,5,4,3,2,9};
		System.out.println(Arrays.toString(test5));
		Arrays.sort(test5);
		//sortAnArray(test5, SORT_TYPE.ENCREASING);
		System.out.println("Array em ordem crescente: " + Arrays.toString(test5));
		System.out.println("Proximo numero sequencial positivo: " + findNextSequencialPositiveNumber(test5)); 
		
	}

	private static void sortAnArray(int[] intArray, SORT_TYPE encreasing) {				

		for(int i = 0; i < intArray.length; i++ ) {
			boolean hasChangeAux = false;
			for(int j = 1; j < intArray.length - i ; j++) {
				if (intArray[j] < intArray[j-1] ) {
					hasChangeAux = true;
					int actualValue = intArray[j];
					int newValue = intArray[j-1] ;
					intArray[j] = newValue;
					intArray[j-1] = actualValue;
				}
			}
			if(!hasChangeAux) {
				break;
			}
		}
	}

	private static String findInArray(int[] intArray, int numberToFind){
		String returnFind = null;
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] == numberToFind) {			
				returnFind = "YES";
			}
		}
		return returnFind;
	}

	private static int[] findOddNumberInArray(int l, int r){

		int[] auxOddNumbersArray = new int[((r-l)/2)+1];// neste caso estou criando um primeiro array d metade da diferente entre o maior e menor tamanho +1 
		int[] oddArrayReturn = null;
		int oddLoopCount = 0;

		for(int i = l; i <= r; i++){						
			if(i % 2 != 0){
				auxOddNumbersArray[oddLoopCount] = i;
				oddLoopCount ++;
			}
		}

		if(oddLoopCount > 0){
			oddArrayReturn = new int[oddLoopCount];
			System.arraycopy(auxOddNumbersArray, 0, oddArrayReturn, 0, oddArrayReturn.length);

		}

		return	oddArrayReturn;
	}

	private static int findNextSequencialPositiveNumber(int[] A) {

		int returnInt = 0;

		int maxInt = 0;
		int lastMaxInt = 0;
		
		boolean hasNumberBiggerThanZero = false;

		for(int i = 0; i < A.length; i++){
			if(A[i] > 0){
				hasNumberBiggerThanZero = true;
			}
			if (A[i] > 0 && A[i] > maxInt){
				lastMaxInt = maxInt;
				maxInt =  A[i];
				if(maxInt - lastMaxInt > 1) {
					break;
				}					
			}else if(A[i] > lastMaxInt ){
				lastMaxInt = A[i];
			}
		}

		if(!hasNumberBiggerThanZero){
			returnInt = 1;
		}else if( maxInt - lastMaxInt == 1 || lastMaxInt == 0){
			returnInt = maxInt + 1;
		}else {
			returnInt = lastMaxInt +1;
		}

		return returnInt;
	}
}

