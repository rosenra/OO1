package Ejercicio16.ejercicio16;
import java.time.LocalDate;

public interface Date {
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	public LocalDate getFrom();
}
