package ar.edu.unlp.oo1.ejercicio3.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String det,int cant,double cu) {
		this.detalle = det;
		this.cantidad = cant;
		this.costoUnitario = cu;
	}
	
	public double costo() {
		return this.cantidad * this.costoUnitario;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
}

