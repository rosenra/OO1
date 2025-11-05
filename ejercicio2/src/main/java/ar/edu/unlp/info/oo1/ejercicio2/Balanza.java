package ar.edu.unlp.info.oo1.ejercicio2;
import java.util.LinkedList;
import java.util.List;
public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private LinkedList<Producto> listP;
	public Balanza(){
	}
	
	public void ponerEnCero(){
		this.pesoTotal = 0;
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.listP.clear();
	}

	public Ticket emitirTicket() {
		Ticket t = new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
		return t;
	}

	public void agregarProducto(Producto p) {
		this.pesoTotal += p.getPeso();
		this.precioTotal += p.getPrecio();
		this.cantidadDeProductos++;
		this.listP.add(p);
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public LinkedList<Producto> getProducto(){
		return this.listP;
	}
}
