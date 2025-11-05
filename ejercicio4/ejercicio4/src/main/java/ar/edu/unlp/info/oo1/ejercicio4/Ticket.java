package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;

import java.util.List;
public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> listP;
	
	public Ticket(int cant,double peso,double precio,List<Producto> p) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cant;
		this.pesoTotal = peso;
		this.precioTotal = precio;
		this.listP = p;
	}
	
	public String toString() {
		String ticket = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.cantidadDeProductos + "\n" + "Peso total en productos: " + this.getPesoTotal() + "\n"
				+ "Total a pagar: " + this.getPrecioTotal()+'\n'+this.impuesto() ;
		for(Producto p: listP) {
			ticket += p.toString();//!!!
		}
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
