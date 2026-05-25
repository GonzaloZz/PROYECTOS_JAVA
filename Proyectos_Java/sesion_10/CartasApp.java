package org.ip.sesion010;
import java.util.Scanner;
public class CartasApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcion = -1;
		
		while(opcion != 0) {
			
			System.out.println("---Menu---\n"
					+ "1. Crear Carta Española.\n"
					+ "2. Crear Carta Francesa.\n"
					+ "3. Comparar Cartas.\n"
					+ "0. Salir.");
			System.out.print("Seleccione una opcion: ");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.print("Introduzca el numero de la carta: ");
				int numeroEspañola = scanner.nextInt();
				System.out.print("Introduzca el palo de la carta: ");
				String paloEspañola = scanner.next();
				System.out.println("Carta creada: " + numeroEspañola + " de " + paloEspañola);
			
				break;
			
			case 2:	
				
				System.out.print("Introduzca el numero de la carta: ");
				int numeroFrancesa = scanner.nextInt();
				System.out.print("Introduzca el palo de la carta: ");
				String paloFrancesa = scanner.next();
				System.out.println("Carta creada: " + numeroFrancesa + " de " + paloFrancesa);
			
				break;
			
			case 3: 
				
				System.out.print("Tipo de baraja (1: Española; 2: Francesa): ");
				int baraja = scanner.nextInt();
				Carta carta1 = null;
				Carta carta2 = null;
		
				if(baraja == 1) {
					//carta 1
					System.out.println("Introduce los datos de la primera carta: ");
					System.out.print("Numero: ");
					int numero1 = scanner.nextInt();
					System.out.print("Palo: ");
					String palo1 = scanner.next();
					carta1 = new CartaEspañola(numero1,palo1);
					
					//carta 2
					System.out.println("Introduce los datos de la segunda carta: ");
					System.out.print("Numero ");
					int numero2 = scanner.nextInt();
					System.out.print("Palo: ");
					String palo2 = scanner.next();
					carta2 = new CartaEspañola(numero2,palo2);
				}else if(baraja == 2) {
					
					//carta 1
					System.out.println("Introduce los datos de la primera carta: ");
					System.out.print("Numero: ");
					int numero1 = scanner.nextInt();
					System.out.print("Palo: ");
					String palo1 = scanner.next();
					carta1 = new CartaFrancesa(numero1,palo1);
					
					//carta 2
					System.out.println("Inroduce los datos de la segunda carta: ");
					System.out.print("Numero: ");
					int numero2 = scanner.nextInt();
					System.out.print("Palo: ");
					String palo2= scanner.next();
					carta2 = new CartaFrancesa(numero2,palo2);
				}else {
					System.out.println("Numero no valido. Pruebe otra vez.");
				}
					
				int resultadoComparacion = carta1.compareTo(carta2);
				
				if(resultadoComparacion > 0) {
					System.out.println(carta1 + " es mayor que " + carta2);
				}else if(resultadoComparacion < 0) {
					System.out.println(carta1 + " es menor que " + carta2);
				}else {
					System.out.println(carta1 + " es igual que " + carta2);
				}
				
				break;
				
			case 0:
				System.out.println("Adios...");
				
				break;
				
				default:
					System.out.println("Opcion no valida. Introduzca otro numero.");
			
			}
		}
		scanner.close();
	}
}
