package org.ip.sesion010;
import java.util.Scanner;
public class BarajasApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcion = -1;
		Baraja baraja = null;
		
		while(opcion != 0) {
			System.out.println("---Menu---\n"
					+ "1. Crear Baraja Española.\n"
					+ "2. Crear Baraja Francesa.\n"
					+ "3. Barajar.\n"
					+ "4. Ordenar la Barja.\n"
					+ "5. Mostrar la Baraja.\n"
					+ "6. Repartir Carta.\n"
					+ "0. Salir.");
			System.out.print("Seleccione una opcion: ");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				baraja = new BarajaEspañola();
				System.out.println("La baraja ha sido creada.");
				
			break;
			
			case 2: 
				
				baraja = new BarajaFrancesa();
				System.out.println("La baraja ha sido creada.");
				
			break;
			
			case 3:
				
				if(baraja != null) {
					baraja.barajar();
					System.out.println("Las cartas han sido barajadas.");
				}else{
					System.out.println("Primero debes crear una baraja.");
				}
			break;
			
			case 4:
				
				if(baraja != null) {
					baraja.ordenar();
					System.out.println("Las cartas han sido ordenadas.");
				}else {
					System.out.println("Primero debes crear una baraja.");
				}
			break;
			
			case 5: 
				
				if(baraja != null) {
					baraja.mostrarBaraja();
					System.out.println("Las cartas han sido barajadas.");
				}else {
					System.out.println("No hay barajas guardadas.");
				}
			
			break;
			
			case 6:
				
				if(baraja != null) {
					System.out.println("Carta repartida: " + baraja.repartir());
				}else {
					System.out.println("No hay barajas guardadas.");
				}
			
			break;
			
			case 0:
				
				System.out.println("Adios...");
			
				break;
			
			}	
		}
		scanner.close();
	}

}
