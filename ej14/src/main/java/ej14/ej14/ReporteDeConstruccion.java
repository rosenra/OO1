package ej14.ej14;
import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion{
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void addPieza(Pieza p) {
		this.piezas.add(p);
	}
	
	public double getVolumenDeMaterial(String m) {//m= nombre del material
		return this.piezas.stream()
				.filter(Pieza -> Pieza.getMaterial().equals(m))
				.mapToDouble(Piezas -> Piezas.volumenDeMaterial())
				.sum();
	}
	
	public double getSuperficieDeColor(String c) {//c= nom del color
		return this.piezas.stream()
				.filter(Piezas -> Piezas.getColor().equals(c))
				.mapToDouble(Pieza -> Pieza.superficieDeColor())
				.sum();
	}
	
}
