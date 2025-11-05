package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;
public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(int cant,double peso,double precio) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cant;
		this.pesoTotal = peso;
		this.precioTotal = precio;
	}
	
	public String toString() {
		String ticket = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.cantidadDeProductos + "\n" + "Peso total en productos: " + this.pesoTotal + "\n"
				+ "Total a pagar: " + this.precioTotal;
		return ticket;
	}
	public double impuesto() {
		return (this.precioTotal*0.21);
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
}
