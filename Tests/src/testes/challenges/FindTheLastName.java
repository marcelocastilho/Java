package testes.challenges;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindTheLastName {

	public static String names[]={"harry","michael","will","tom","jackie"};    
	public static String surnames[]={"potter","jackson","smith","cruise","chan"};    

	public static void main(String[] args) throws InterruptedException {

		Scanner sc=new Scanner(System.in);
		String name;   
		System.out.println("Enter the name:");
		name=sc.next();

		List<String> listNames = Arrays.asList(names);

		if (listNames.indexOf(name) >= 0){
			System.out.println(name + " " + surnames[listNames.indexOf(name)]);
		}
		//sleep
		Thread.sleep(1000L);	

		HashMap<String, String> completeNames = new HashMap<String, String>();
		for (int i = 0; i < names.length; i++) {
			completeNames.put(names[i], surnames[i]);
		}	

		//sleep
		Thread.sleep(1000L);	
		if(completeNames.containsKey(name)) {
			System.out.println(name + " " + completeNames.get(name));
		}

		//sleep
		Thread.sleep(1000L);	
		EnumMap<NamesEnum, String> enumMap = new EnumMap(NamesEnum.class);

		//charge the enumMap by the loop in enuns
		for (NamesEnum nameEnum: NamesEnum.values()) {
			enumMap.put(nameEnum, nameEnum.toString());		
		}

		enumMap.forEach((k,v) -> {if(v.equals(name)){System.out.println(k.toString() + " " + k.surName);}});				
	}

	private enum NamesEnum{
		harry("Potter"),
		michael("Jackson"),
		will("Smith"),
		tom("Cruize"),
		jackie("Chan");

		String surName;

		private NamesEnum(String surName) {
			this.surName = surName;
		}

		public String getSurName() {
			return surName;
		}

		public void setSurName(String surName) {
			this.surName = surName;
		}		
	}
}
