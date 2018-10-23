package tests.datas;

public class ChangeMinutesToHours {
	
	public static void main(String[] args) {

		int minutos = 12;
		
		int horas = minutos/60;
		int minutosRestantes = minutos%60;
		
		System.out.println(horas + ":" + minutosRestantes);
	}
}
