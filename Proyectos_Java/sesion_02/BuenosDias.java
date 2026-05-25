package org.ip.sesion02;
import java.util.Scanner;

public class BuenosDias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce la hora (0-23): ");
		double hora = scanner.nextDouble();
		
		System.out.print("Introduce los minutos (0-59): ");
		double minutos = scanner.nextDouble();
		
		String saludo;
		
		if (hora >= 6 && hora < 13) {
			saludo ="Buenos dias";
		} else if (hora >= 13 && hora < 21) {
			saludo = "Buenas tardes";
		} else {
			saludo = "Buenas noches";
		}
		System.out.println(saludo);
		
		scanner.close();
			
		}
		

	}


