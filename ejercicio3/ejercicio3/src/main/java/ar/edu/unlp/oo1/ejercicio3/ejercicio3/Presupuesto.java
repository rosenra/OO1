package ar.edu.unlp.oo1.ejercicio3.ejercicio3;
import java.util.LinkedList;
import java.time.LocalDate;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private LinkedList<Item> items; 
	
	public Presupuesto(String cli) {
		this.fecha = LocalDate.now(); //!!!
		this.cliente = cli;
		this.items = new LinkedList<Item>() ; //va el tipo??
	}
	public void agregarItem(Item i) {
		this.items.add(i);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Item i:this.items) {
			total += i.costo();
		}
		return total;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
}
