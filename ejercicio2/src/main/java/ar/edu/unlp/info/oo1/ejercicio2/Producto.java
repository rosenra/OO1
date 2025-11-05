package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(String d, double p,double pxk) {
		this.descripcion = d;
		this.precioPorKilo = pxk;
		this.peso = p;
	}
	
	public double getPrecio() {
		return this.peso*this.precioPorKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double p) {
		this.peso = p;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	public void setPrecioPorKilo(double p) {
		this.precioPorKilo = p;
	}
	
	public void setDescripcion(String d) {
		this.descripcion = d;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
	@Override
	public String toString() {
		return "precio: "+this.getPrecio()+'\n'+"precio por kilo: "+this.getPrecioPorKilo()+'\n'+"descripcion: "+this.descripcion;
	}
}
