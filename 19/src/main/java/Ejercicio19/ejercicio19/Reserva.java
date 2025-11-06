package Ejercicio19.ejercicio19;
import Ejercicio16.ejercicio16.DateLapse;
import java.time.LocalDate;
public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	private Usuario inquilino;
	public Reserva(DateLapse period, Propiedad prop, Usuario inqui) {
		this.periodo = period;
		this.propiedad = prop;
		this.inquilino = inqui;
	}
	
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public Usuario getInquilino() {
		return this.inquilino;
	}
	public double calcularPrecio() {
		return this.propiedad.getPrecio() * this.periodo.sizeInDays();
	}
	

	public boolean isDisponible(DateLapse p) {
	    return !this.periodo.overlaps(p);
	}

	public boolean estaEnCurso() {
		//LocalDate hoy = LocalDate.now();
		return this.periodo.includesDate(LocalDate.now());
		//return !this.periodo.getFrom().isAfter(hoy) && !this.periodo.getTo().isBefore(hoy);//si from es hoy o antes de hoy, y si to es hoy o desp de hoy 
	}
} 
