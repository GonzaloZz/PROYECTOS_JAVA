package org.ip.sesion01;

public class EnteroAleatorio {
	
	public static void main(String[] args) {
		int M = -15;
		int N = 15;
		
		
	double numeroAleatorio = Math.random();
	int ValorEntero=  (int) (numeroAleatorio*(N-M + 1) + M);
	
	System.out.println("Generamos numero aleatoruo entre -15 y 15");
	System.out.println();
	System.out.println("El numero aleatorio generado es:" + ValorEntero);
	
	}
}
