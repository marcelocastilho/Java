package tests.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		RegularExpression re = new RegularExpression();
		re.run();

	}

	private void run() {

		String binary = "0011011000101";
		System.out.println("Test1: " + binary);

		//Verifying if only numbers
		if(binary.matches("^\\d+$")) {
			System.out.println("São somente digitos");
		}else {
			System.out.println("Existe outro caracter não digito");
		}

		//Verifying if only numbers 0 and 1
		if(binary.matches("[10]+")) {
			System.out.println("São somente 0 e 1 ");
		}else {
			System.out.println("Existe caracter diferente de 0 e 1");
		}

		String test2 = "-128.254";
		System.out.println("\nTest2: " + test2);

		//Verifying if is numerical, numbers(positive or negative) and '.' and ',' Ex.: -124.000.000,00 
		if(test2.matches("^[-+]?\\d+(\\.\\d+)?$")) {
			System.out.println("É um valor numerico");
		}else {
			System.out.println("Não é numerico");
		}

		String test3 = "aaaaaa9854126541478521adas\ndasd1234568521451562sdasdas\ndasd9854132655547821sdasdas";
		System.out.println("\nTest3: " + test3);
		//Finding numbers between 15 and 20 digits-card credit

		//Using a pattern and a match and a matcher
		//Match a single digit
		Pattern p = Pattern.compile(
				"[\\D]{1}"  		//caracteres diferentes de digitos qualquer qntd
				+ "(\\d{16,20})"   // start group + five or more digits + end grouping
				+ "[^0-9]{1}");         //caracteres diferentes de digitos qualquer qntd

		Matcher matcher = p.matcher(test3);
		ArrayList<String> possibleCreditCardNumber = new ArrayList<>(); 

		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("found: " + count + ": " + matcher.start() + "-" + matcher.end() + "    Matched: " + matcher.group(1));
			possibleCreditCardNumber.add(matcher.group(1));
		}
		String creditCardMask = "(\\d{4})?(\\d{4})?(\\d{4})?(\\d{4})";
		for (int i = 0; i < possibleCreditCardNumber.size(); i++) {
			System.out.print("CreditCard with mask: " + possibleCreditCardNumber.get(i).replaceAll(creditCardMask, "$1-$2-$3-$4") );
			System.out.println(" Hidding 2 e 3 block: " + possibleCreditCardNumber.get(i).replaceAll(creditCardMask, "$1-****-****-$4") );
					
		}		

		String cpf ="095.511.304-01";
		System.out.println("\n\nCPF: " + cpf);
		String cpfPattern = "(\\d{3}.?\\d{3}.?\\d{3}-?\\d{2})";
		//validar se está detro da mascara de CPF
		if(cpf.matches(cpfPattern)) {
			System.out.println("CPF valid!");
		}
		//retirar caracteres . e -
		cpf = cpf.replaceAll("[./-]","");
		System.out.println("CPF sem pontos: " + cpf);
		
		//inserir navamente os ponto
		cpf = cpf.replaceAll("(\\d{3})?(\\d{3})?(\\d{3})?(\\d{2})","$1.$2.$3-$4");
		System.out.println("CPF com mascara padrao: " + cpf);
		System.out.println("CPF com *2: " + cpf.replaceAll("(\\d{3}.)?\\d{3}(.?\\d{3}-?\\d{2})","$1***$2"));
		System.out.println("CPF com * 2 e 3 " + cpf.replaceAll("(\\d{3}.)?\\d{3}.?\\d{3}(-?\\d{2})","$1***.***$2"));
		
	
		// Verifying if the string have a valid email Ex.: teste@teste.com.eu
		Pattern emailPattern = Pattern.compile("/^[a-zA-Z0-9][a-zA-Z0-9\\._-]+@([a-zA-Z0-9\\._-]+\\.)[a-zA-Z-0-9]{2}/");

		//Verifying if the string have a valid cep Ex.: 83010-390
		Pattern cepPattern = Pattern.compile("\\d{5}-\\d{3}");

		//Verifying if the string have a valid cep Ex.: 00:01 a 23:59
		//TODO melhorar para validar somente até 24h e não 29 conforme está
		Pattern timePattern = Pattern.compile("[012]\\d:[0-5]\\d");
		//Exemplo de OR conditional para datas de cartão de crédito:     ^((0[1-9])|(1[0-2]))\/(\d{2})$
		//[012]\\d --> Valida digitos 0 ou 1 ou 2 + qualquer digito Ex.: 00 a 29
		//: 
		//[0-5]\\d --> --> Valida digitos entre 0 e 5 + qualquer digito  Ex.: 00 a 59

	}
}