package Ejercicio16.ejercicio16;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateLapse implements Date {
	private LocalDate to;
	private LocalDate from;
	
	public DateLapse (LocalDate from,LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public LocalDate getFrom() {
		return  this.from;
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.from, this.to); // uso chronounit para definir la unidad, en este caso Days
	}
	
	public boolean includesDate(LocalDate periodo) {
		if (periodo.isAfter(this.getFrom()) && periodo.isBefore(this.getTo()))
			return true;
		else return false;
	}
}
