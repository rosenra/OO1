package ej14.ej14;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double height;
	
	public PrismaRectangular(String material, String color,double max,double min,double h) {
		super(material,color);
		this.ladoMayor = max;
		this.ladoMenor = min;
		this.height = h;
	}
	
	public double getLadoMayor() {
		return this.ladoMayor;
	}
	
	public double getLadoMenor() {
		return this.ladoMenor;
	}
	
	public double getHeight() {
		return this.height;
	}

	
	public double volumenDeMaterial() {
		return this.ladoMayor* this.ladoMenor * this.height;
	}

	public double superficieDeColor() {
		return 2*(this.ladoMayor*this.ladoMenor+this.ladoMayor*this.height+this.ladoMenor*this.height);
	}
	
	
}
