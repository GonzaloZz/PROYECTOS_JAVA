package org.ip.sesion02;
import java.util.Scanner;
public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("SOLUCION DE INA ECUACION DE SEGUNDO GRADO: ");
		System.out.println("Valores de los coeficientes: ");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.print("c = ");
		int c = scanner.nextInt();
		
		double multiplicacion = b * b - 4 * a * c;
		double raiz1 = (-b + Math.sqrt(multiplicacion)) / (2 * a);
		double raiz2 = (-b - Math.sqrt(multiplicacion)) / (2 * a);
		
		System.out.println("Raiz 1 : " + raiz1);
		System.out.println("Raiz 2 : " + raiz2);
		
		
		
	}

}
