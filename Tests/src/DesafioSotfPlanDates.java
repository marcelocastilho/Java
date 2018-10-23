import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class DesafioSotfPlanDates {

	public static void main(String[] args) {

		int y = 2014;
		String  beginMonth = "April";
		String  endMonth = "May";
		String  dayOfWeek = "Wednesday";
	
		int solution =  solution(y, beginMonth, endMonth, dayOfWeek);
	}

	public static int solution(int Y, String A, String B, String W) {
		//int Y == year 
		//A == beginMonth
		//B == endMonth
		//C == dayOfWeek
		int returnInt = 0;
		
		final String DEPARTS_DAY =  "Monday";
		final String ARRIVE_DAY =  "Sunday";
		
		//gennerating the departs date 
		LocalDate beginMonthDate = LocalDate.of(Y,getMonth(A), 1);	
		beginMonthDate = getFirstWeekDayOnMonth(beginMonthDate, W);		
		beginMonthDate = getFirstWeekDayOnMonth(beginMonthDate, DEPARTS_DAY);
				
		//gennerating the arrive date
		YearMonth yearMonth = YearMonth.of(Y, getMonth(B));
		LocalDate endMonthDate = LocalDate.of(Y,getMonth(B), yearMonth.lengthOfMonth());
		endMonthDate = getLastWeekDayOnMonth(endMonthDate, ARRIVE_DAY);
		
		long returnLong = ChronoUnit.WEEKS.between(beginMonthDate, endMonthDate);
					
		return (int) returnLong +1;
	}
	
	public static LocalDate getFirstWeekDayOnMonth(LocalDate date, String dayOfWeek){
		
		for(int i = 0; i < 7; i++) {
			if(date.getDayOfWeek() != getDayOfWeek(dayOfWeek)) {
				date = date.plusDays(1);
			}else {
				break;
			}
		}
		return date;
	}
	
	public static LocalDate getLastWeekDayOnMonth(LocalDate date, String dayOfWeek){
	
		for(int i = 0; i < 7; i++) {
			if(date.getDayOfWeek() != getDayOfWeek(dayOfWeek)) {
				date = date.minusDays(1);
			}else {
				break;
			}
		}
		return date;
	}
	
	public static Month getMonth(String month) {		
		Month monthObject = null;
		switch(month) {
			case "January": monthObject = Month.JANUARY; break;
			case "February": monthObject = Month.FEBRUARY; break;
			case "March": monthObject = Month.MARCH; break;
			case "April": monthObject = Month.APRIL; break;
			case "May": monthObject = Month.MAY; break;
			case "June": monthObject = Month.JUNE; break;
			case "July": monthObject = Month.JULY; break;
			case "August": monthObject = Month.AUGUST; break;
			case "September": monthObject = Month.SEPTEMBER; break;
			case "October": monthObject = Month.OCTOBER; break;
			case "November": monthObject = Month.NOVEMBER; break;
			case "December": monthObject = Month.DECEMBER; break;								
		}
		return monthObject;				
	}
	
	public static DayOfWeek getDayOfWeek(String dayOfWeek) {		
		DayOfWeek dayOfWeekReturn = null;
		switch(dayOfWeek) {
			case "Monday": dayOfWeekReturn = DayOfWeek.MONDAY; break;
			case "Tuesday": dayOfWeekReturn = DayOfWeek.TUESDAY; break;
			case "Wednesday": dayOfWeekReturn = DayOfWeek.WEDNESDAY; break;
			case "Thursday": dayOfWeekReturn = DayOfWeek.THURSDAY; break;
			case "Friday": dayOfWeekReturn = DayOfWeek.FRIDAY; break;
			case "Saturday": dayOfWeekReturn = DayOfWeek.SATURDAY; break;
			case "Sunday": dayOfWeekReturn = DayOfWeek.SUNDAY; break;						
		}
		return dayOfWeekReturn;		
	}
	
}
