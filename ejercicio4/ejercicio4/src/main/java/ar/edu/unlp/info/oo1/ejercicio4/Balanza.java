package ar.edu.unlp.info.oo1.ejercicio4;
import java.util.ArrayList;
import java.util.List;
public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> listP;
	
	public Balanza() {
		this.listP = new ArrayList<Producto>();
	}
	public void ponerEnCero(){
		this.pesoTotal = 0;
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.listP.clear();
	}

	public Ticket emitirTicket() {
		Ticket t = new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal,this.listP);
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
	
	public List<Producto> getProducto(){
		return this.listP;
	}
}
