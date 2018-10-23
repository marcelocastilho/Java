package tests.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalUnit;

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
		
	}
}
