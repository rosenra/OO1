package ej14.ej14;

public class Cilindro extends Pieza{
	private double ratio;
	private double height;
	
	public Cilindro (String material, String color,double r,double h) {
		super(material,color);
		this.ratio = r;
		this.height = h;
	}
	
	public double getRatio() {
		return this.ratio;
	}
	public double getHeight() {
		return this.height;
	}
	
	public double volumenDeMaterial() {
		return Math.PI*Math.pow(ratio, 2)*this.height;
	}
	
	public double superficieDeColor() {
		return 2*Math.PI*this.ratio*this.height+2*Math.PI*Math.pow(ratio, 2);
	}
	
	
}
