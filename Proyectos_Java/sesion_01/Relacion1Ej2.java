package org.ip.sesion01;

public class Relacion1Ej2 {

	public static void main(String[] args) {
		
		System.out.println("ENUNCIADO: ");
		System.out.println("2. Una carga eléctrica de 1 mC está distribuida homogéneamente en el volumen de una\r\n"
				+ "esfera de 1 cm de radio. Calcular la densidad volumétrica de carga en la esfera. ");
		
		System.out.println("==============================");
		System.out.println("DATOS: ");
		System.out.println("Carga eléctrica = 1mC ");
		System.out.println("Radio de la esfera = 1cm ");
		
		System.out.println("==============================");
		System.out.println("SOLUCION: ");
		
		double cargaElectrica = 0.001;
		double radioEsfera = 0.01;
		
		// Calculamos el volumen de la esfera
		double volumenEsfera = (4.0/ 3.0) * Math.PI * Math.pow(radioEsfera, 3);
		System.out.println("El volumen de la esfera es: " + volumenEsfera + "m^3");
		
		// Calculamos la densidad volumetrica de carga.
		double densidadVolumetrica = cargaElectrica / volumenEsfera;
		System.out.println("La densidad volumetrica de carga es: " + densidadVolumetrica + "C/m^3");
	}

}
