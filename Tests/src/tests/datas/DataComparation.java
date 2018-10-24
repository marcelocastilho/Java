package tests.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataComparation {
	
	public static void main(String[] args) {
				
		Instant inicio = Instant.now();
		
		//####################
		
		LocalDate hoje = LocalDate.now();					
		LocalDate amanha = LocalDate.of(2018, Month.OCTOBER, 02);		
		Period periodo = Period.between(hoje,amanha);		
		
		System.out.println("Diferença em dias: " + periodo.getDays());
				
		LocalDateTime agora = LocalDateTime.now();		
		LocalDateTime amanhaANoite = LocalDateTime.of(2018, Month.OCTOBER, 02,22,10);		
		Duration duracao = Duration.between(agora, amanhaANoite);		
		
		System.out.println("Diferença entre hj e amanha as 22:00 horas:" + duracao.toHours());
		
		//####################
		Instant fim = Instant.now();
		Duration duracao2 = Duration.between(fim, inicio);		
		long duracaoEmMilissegundos = duracao.toMillis();
		
		System.out.println("Duração em milisegundos: " + duracaoEmMilissegundos);
		
		int year = 2059;
		int month = 12;
		int day = 25;
		
		LocalDate date = LocalDate.of(year, month, day); 
		System.out.println("Local Date: " + date.getDayOfWeek());
				
		Calendar calendar = new GregorianCalendar(year, month-1, day) ;
	
		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday","Friday", "Saturday" };		
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Month: " + calendar.get(Calendar.MONTH));
		System.out.println("Day of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Calendar: " + strDays[calendar.get(Calendar.DAY_OF_WEEK)-1].toUpperCase());
	}
}
