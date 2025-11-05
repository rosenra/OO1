package ej14.ej14;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza() {}
	
	public Pieza(String m, String c) {
		this.material = m;
		this.color = c;	
	}
	
	public String getMaterial() {
		return this.material;
	}
	public String getColor() {
		return this.color;
	}
	
	public abstract double volumenDeMaterial();
	
	public abstract double superficieDeColor();
}

