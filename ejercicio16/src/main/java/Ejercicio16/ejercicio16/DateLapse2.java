package Ejercicio16.ejercicio16;

import java.time.LocalDate;

public class DateLapse2 implements Date {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse2(LocalDate from,int size) {
		this.from = from;
		this.sizeInDays = size;
	}
	public LocalDate getFrom() {
		return this.from;
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays); //a la fecha de from le sumo los dias de size in days asi saco el to
	}
	
	public boolean includesDate(LocalDate other) {
		if(other.isAfter(getFrom())&& other.isBefore(getTo()))
			return true;
		else return false;
	}
}
