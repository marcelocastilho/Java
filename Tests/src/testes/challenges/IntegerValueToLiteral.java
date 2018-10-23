package testes.challenges;

public class IntegerValueToLiteral {


	public static String ones[]={"zero", "one","two","three","four","five","six"," seven", "eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};      
	public static String tens[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};       
	public static void main(String a[]) throws Exception
	{

		int num = 19;
		String out = "";
	
		
		if(num <= 19){
			out = ones[num];
		}else{
			out = out + tens[Integer.parseInt(((String.valueOf(num)).substring(0,1)))-2] ;
			if(Integer.parseInt(((String.valueOf(num)).substring(1,2)))>0) {
				out = out + " " + ones[Integer.parseInt(((String.valueOf(num)).substring(1,2)))];
			}
			
		}
		System.out.println(out );
	} 
}
