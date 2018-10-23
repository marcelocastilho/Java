package tests.string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringTests {

	public static void main(String[] args) {



		String request = "2\n"
				+"5\n"
				+"aaa bb cc eeeeeeeeeeeeeeeeeeeeeeeee dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddg"
				+ "";

		findInStringWithLength(request);

		findInStringWithLengthAndSplit(request);
		
		System.out.println("Sorted wods: " +  Arrays.toString(sortAnStringArray(request.split(" "))));

		System.out.println("Wrap: " + wrap(request, 3));

	}
	
	private static String[] sortAnStringArray(String[] array) {
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array)); 
		
		Collections.sort(arrayList);	
		
		return (String[]) arrayList.toArray(new String[arrayList.size()]);
	}

	private static void findInStringWithLengthAndSplit(String request) {
		String returnString = null;

		String[] parameters = request.split("\n");
		
		System.out.println("Parametros recebidos:" + Arrays.toString(parameters));

		System.out.println("Parametros recebidos:" + parameters[2].substring( Integer.valueOf(parameters[0]), Integer.valueOf(parameters[1])));
		
	}

	private static void findInStringWithLength(String request) {
		String returnString = null;

		int firstLineEnd = request.indexOf("\n");		
		int min = Integer.parseInt(request.substring(0,firstLineEnd));		 
		System.out.println("min " + min);

		int secondLineEnd = request.indexOf("\n", firstLineEnd +1 );
		int  max = Integer.parseInt(request.substring(firstLineEnd +1,firstLineEnd+secondLineEnd-1));		
		System.out.println("max " + max);

		System.out.println("Restante " + request.substring(secondLineEnd+1, request.length()));
		returnString = request.substring(secondLineEnd+1, request.length());

		System.out.println("SubString " + returnString.substring(min, max));
	}

	public static String wrap(String in,int len) {
		
		String returnString = "";
		in=in.trim();
		if(in.length()<len) {
			returnString = in;
		}else if(in.substring(0, len).contains("\n")) {
			returnString = in.substring(0, in.indexOf("\n")).trim() + "\n" + wrap(in.substring(in.indexOf("\n") + 1), len);
		}else {
			int place = Math.max(Math.max(in.lastIndexOf(" ",len),in.lastIndexOf("\t",len)),in.lastIndexOf("-",len));
			if(place > 0)
				returnString = in.substring(0,place).trim() + "\n" + wrap(in.substring(place),len);
		}

		return returnString;
	}

}
