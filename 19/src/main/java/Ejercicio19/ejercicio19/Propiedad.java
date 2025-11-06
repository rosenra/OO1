package Ejercicio19.ejercicio19;
import Ejercicio16.ejercicio16.DateLapse;

import java.util.List;
import java.util.ArrayList;
public class Propiedad {
	private String direccion;
	private String nombre;
	private double precio;
	private List<Reserva> fechasOcupadas;
	public Propiedad (String dir,String nom, double p) {
		this.direccion = dir;
		this.nombre = nom;
		this.precio = p;
		this.fechasOcupadas = new ArrayList<Reserva>();
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public List<Reserva> getReservas(){
		return this.fechasOcupadas;
	}
	public boolean isDisponible(DateLapse p) {
	    return this.fechasOcupadas.stream().noneMatch(r -> r.getPeriodo().overlaps(p));//chequea todo
	}
	
	public Reserva reservar(DateLapse periodo,Usuario inquilino) {
		if (isDisponible(periodo)) {
			Reserva r = new Reserva(periodo,this,inquilino);
			this.fechasOcupadas.add(r);
			return(r);
		}else return null;
	
	}

	
/*public boolean isDisponible(DateLapse periodo) {ESTA SOLUCION SOLO CHEQUEA SI SE SOLAPAN TODOS LOS DIAS, SI SE SUPERPONE SOLO ALGUNO DIAS DA TRUE!!!
		List<Boolean> f = fechasOcupadas.stream()
			.map(r -> r.getPeriodo().equals(periodo))
			.collect(Collectors.toList());
		
		if (f.isEmpty())
			return true;
		else
			return false;
	}*/
	
	public boolean cancelarReserva(Reserva r) {
		if(!r.estaEnCurso())
			return this.fechasOcupadas.remove(r);
		else return false;
	}
	
	public double calcularTotal(DateLapse periodo) {
		return this.fechasOcupadas.stream().filter(r -> !r.isDisponible(periodo)).mapToDouble(r-> r.calcularPrecio()).sum();
	}
}
