package Ejercicio19.ejercicio19;
import java.util.List;

import Ejercicio16.ejercicio16.DateLapse;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int dni;
	private String direccion;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	public Usuario(String nom,String dir,int dni) {
		this.nombre = nom;
		this.direccion = dir;
		this.dni = dni;
		propiedades = new ArrayList<Propiedad>();
		reservas = new ArrayList<Reserva>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public List<Propiedad> getPropiedades(){
		return this.propiedades;
	}
	
	public List<Reserva> getReservas(){
		return this.reservas;
	}
	
	public Reserva reservar(String nom,DateLapse periodo ) {
		Propiedad p = propiedades.stream()
						.filter(propiedad -> propiedad.getNombre().contentEquals(nom))
						.findFirst().orElse(null);
		if(p != null)
			return p.reservar(periodo, this);
		else return null;
	}
	
	public double calcularMonto(DateLapse periodo) {
		return  propiedades.stream()
                .mapToDouble(propiedad -> propiedad.calcularTotal(periodo))
                .sum() * 0.75;
	}
}
