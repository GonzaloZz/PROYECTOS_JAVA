package org.ip.sesion01;

public class DensidadPPI {

	public static void main(String[] args) {
		
		// Dispositivo 1
		int ancho1= 1920;
		int alto1= 1080;
		int pulgadas1= 27;
		
		// Dispositivo 2
		int ancho2= 3840;
		int alto2= 2160;
		int pulgadas2= 32;
		
		// Dispositivo 3
		int ancho3= 2340;
		int alto3= 1080;
		double pulgadas3= 6.5;
		
		
		// Calcular Dispositivo 1
		double PPI1= Math.sqrt(Math.pow(ancho1, 2) + Math.pow(alto1, 2))/pulgadas1;
		System.out.printf("DensidadPPI del dispositivo1 es: %.2f", PPI1);
		System.out.println();
		
		// Calcular Dispositivo 2
		double PPI2= Math.sqrt(Math.pow(ancho2, 2) + Math.pow(alto2, 2))/pulgadas2;
		System.out.printf("DensidadPPI del dispositivo2 es: %.2f", PPI2);
		System.out.println();
		
		// Calcular Dispositivo 3
		double PPI3= Math.sqrt(Math.pow(ancho3, 2) + Math.pow(alto3, 2))/pulgadas3;
		System.out.printf("DensidadPPI del deispositivo2 es: %.2f", PPI3);
		

	}

}
