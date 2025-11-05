package ej14.ej14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporte;
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prismaRectangular;
	
	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		cilindro = new Cilindro("Hierro","Rojo",2,4);
		esfera = new Esfera("Hierro","Azul",6);
		prismaRectangular = new PrismaRectangular("Hierro","Rojo",8,6,4);
		reporte.addPieza(cilindro);
		reporte.addPieza(esfera);
		reporte.addPieza(prismaRectangular);
	}
	
	@Test
	void testVolumen() {
		assertEquals(50, Math.round(cilindro.volumenDeMaterial()));
		assertEquals(905, Math.round(esfera.volumenDeMaterial()));//904.77 se redondea
		assertEquals(192, prismaRectangular.volumenDeMaterial());
	}
	
	@Test
	void testSuperficie() {
		assertEquals(75,Math.round(cilindro.superficieDeColor()));
		assertEquals(452,Math.round(esfera.superficieDeColor()));
		assertEquals(208,Math.round(prismaRectangular.superficieDeColor()));
	}
	
	@Test
	
	void testGetVolumenDeMaterial() {
		assertEquals(1147,Math.round(reporte.getVolumenDeMaterial("Hierro")));
		assertEquals(0,Math.round(reporte.getVolumenDeMaterial("Cobre")));
		assertEquals(0,Math.round(reporte.getVolumenDeMaterial(null)));
	}
	
	@Test
	void testGetSuperficieDeColor() {
		assertEquals(283,Math.round(reporte.getSuperficieDeColor("Rojo")));
		assertEquals(452,Math.round(reporte.getSuperficieDeColor("Azul")));
		assertEquals(0,Math.round(reporte.getSuperficieDeColor("Amarillo")));
		assertEquals(0,Math.round(reporte.getSuperficieDeColor(null)));
	}
}
