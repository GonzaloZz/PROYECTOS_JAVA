package org.ip.sesion07;

public class Strings {

	public static void main(String[] args) {
		System.out.println("TEXTO: ");
		System.out.println(" \"En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en\r\n"
				+ " astillero, adarga antigua, rocín flaco y galgo corredor.\"");
		System.out.println();
		System.out.println("----ACTIVIDAD----");
		
		String cadena =  "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en\r\n"
				+ " astillero, adarga antigua, rocín flaco y galgo corredor.";
		
		String primerosDiez = cadena.substring(0,10);
		String posicion2 = " ";
		String posicion1 = " ";
		char posicionCero = cadena.charAt(0);
		String ultimaPalabra = " ";
		String primeraPalabra = " ";
		int contador = 0;
		
		//primera palabra del texto
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) ==  ' ') break;
			primeraPalabra += cadena.charAt(i);
		} 
		System.out.println("-La primera palabra es:" + primeraPalabra);
		
		//ultima palabra del texto
		for (int i = cadena.length() - 1; i>= 0 ; i--) {
			if (cadena.charAt(i) == ' ') break;
			ultimaPalabra = cadena.charAt(i) + ultimaPalabra;
		}
		System.out.println("-La ultima palabra es: " + ultimaPalabra);
		
		//¿aparece "un lugar de la mancha"?
			if (cadena.contains("lugar de la Mancha")) {
				System.out.println(" 'lugar de la Mancha': true.");
			}else {
				System.out.println(" 'lugar de la Mancha': false.");
			}
			
		//numero de veces que aparece la palabra de
		for (int i = 0; i < cadena.length() - 1; i++) { 
			    if (cadena.charAt(i) == 'd' && cadena.charAt(i + 1) == 'e') {
			        contador++;
			    }
			}
			System.out.println("-El numero de veces que aparece 'de' es: " + contador);
			
		//caracter en la posicion 0:
			System.out.println("-Caracter en la posicion 0: " + posicionCero);
		
		//posicion de la primera "de":	
		
			
		for (int i = 0; i< cadena.length() - 1;i++) {
			if(cadena.charAt(i) == 'd' && cadena.charAt(i + 1) == 'e' ) {
				posicion1 += i;
				break;
			}
		}
			
			System.out.println("-La posicion de la primera de es : " + posicion1);
		
		//posicion de la ultima "de":	
	
		for (int i = cadena.length() - 1; i>= 0; i--) {
			if (cadena.charAt(i) == 'd' && cadena.charAt(i + 1) == 'e') {
				posicion2 += i;
				break;
				
			}
			
		}
			System.out.println("-La posicion de la ultima de es: " + posicion2);
		
		//primeros 10 caracteres
			
		System.out.println("-Los primeros 10 caracteres son: " + primerosDiez);
	
		//cambio de comas por puntos
		
		String textoCambiado = cadena.replace(",", ".");
		System.out.println("-El texto cambiado es: " + textoCambiado);
		
		//cambio mayusculas
		
		String textoMayusculas = cadena.toUpperCase();
		System.out.println("-El texto en mayusculas: " + textoMayusculas);
		
		//longitud del parrafo
		
		int longitud = cadena.length();
		System.out.println("-La longitud del texto es: " + longitud);
		
		//ultimo caracter del parrafo
		
		String ultimoCaracter = " ";
		for (int i = cadena.length() -1; i >= 0; i-- ) {
			if(cadena.charAt(i) == ' ')break;
			ultimoCaracter = cadena.charAt(i) + ultimoCaracter;
		}
		System.out.println("-El ultimo caracter es: " + ultimoCaracter);
		
	
		//contiene 'caballero':
		
		if (cadena.contains("caballero")) {
			System.out.println("-Palabra 'caballero': true.");
		}else {System.out.println("-Palabra 'caballero': false.");
		
		}
	
	
	
	
	
	
	}

}
