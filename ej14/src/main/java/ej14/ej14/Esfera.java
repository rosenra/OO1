package ej14.ej14;

public class Esfera extends Pieza{
	private double ratio;
	
	public Esfera (String material, String color,double r) {
		super(material,color);
		this.ratio = r;
	}
	
	public double getRatio() {
		return this.ratio;
	}
	
	public double volumenDeMaterial() {
		return (4.0/3.0)*Math.PI*Math.pow(ratio, 3);
	}
	
	public double superficieDeColor() {
		return 4*Math.PI*Math.pow(ratio, 2);
	}
	
}
