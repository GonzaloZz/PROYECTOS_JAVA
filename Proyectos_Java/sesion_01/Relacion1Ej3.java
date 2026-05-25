package org.ip.sesion01;

public class Relacion1Ej3 {

	public static void main(String[] args) {
	
		System.out.println("ENUNCIADO:");
		System.out.println(" 3) Un cilindro de 10 cm de altura y radio de la base 3 cm tiene una densidad homogénea\r\n"
				+ " de carga volumétrica de 1 µC/m^3. Calcular la carga total que almacena.");
		
		System.out.println("===================================");
		System.out.println("DATOS: ");
		System.out.println("Altura = 0.1 cm");
		System.out.println("Radio = 0.03 cm");
		System.out.println("Densidad de carga = 1.0E-6 cm");
	
		System.out.println("===================================");
		System.out.println("SOLUCION: ");
		
		double altura = 0.1;
		double radio = 0.03;
		double densidadCarga = Math.pow(10, -6);
		System.out.println("Q= p * V ");
		double volumen = Math.PI * Math.pow(radio, 2);
		System.out.println("Volumen (V)= altura * radio^2 * PI");
		double cargaTotal = volumen * densidadCarga;
		
		System.out.print("Por tanto, la carga total almacenada es: " + cargaTotal);
			
	}

}
