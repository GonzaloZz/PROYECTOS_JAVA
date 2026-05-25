package org.ip.sesion01;
import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese valor para x: ");
		int x = scanner.nextInt();
		
		System.out.print("Ingrese valor pata y: ");
		int y = scanner.nextInt();
		
		double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.printf("La distancia al origen es: %.4f", distancia);
	}

}
