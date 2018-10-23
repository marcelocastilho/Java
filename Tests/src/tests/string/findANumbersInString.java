package tests.string;

public class findANumbersInString {
	
	public static void main(String[] args) {
		
		String aaa = "3 & num2 = 1";
		String retorno = "false";
		
		int firstNumber = Integer.parseInt(aaa.substring(0, aaa.indexOf("&")).trim());
		
		int lastNumber = Integer.parseInt(aaa.substring(aaa.indexOf("=")+1, aaa.length()).trim());
					
		System.out.println(firstNumber);
		System.out.println(lastNumber);
		
		if (lastNumber > firstNumber) {
			retorno = "true";
		}else if(lastNumber == firstNumber) {
			retorno = "-1";
		}
			
		System.out.println(retorno);
		
		String bbb = "marcelo castilho 1984 2018";
		
		String[] str = bbb.split(" ");
		
        for(int i=0;i<str.length;i++ ) {
            if(str[i].matches("[0-9]+")) {
                System.out.println("Numeros: " + str[i]);
            }
        }
		
		
	}

}
