package org.ip.sesion08.persona_v3;
import java.util.Scanner;
import java.util.Random;
public class InsercionOrdenada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Persona[] personas = null;
		
		int opcion = -1;
		
		while(opcion != 3) {
			System.out.println("Menu: \n"
					+ "1. Generar personas ordenadas.\n"
					+ "2. Mostrar personas ordenadas.\n"
					+ "3. Salir.");
			System.out.print("Por favor, introduzca su eleccion: ");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.print("Introduzca el numero de personas a generar: ");
				int numPersona = scanner.nextInt();
				
				System.out.print("Introduzca los nombres separados por comas: ");
				String nombres = scanner.next();
				String[] nombresPersonas = nombres.split(",");
				
				System.out.print("Introduzca los apellidos separados por comas: ");
				String apellidos = scanner.next();
				String[] apellidosPersonas = apellidos.split(",");
				
				personas = Persona.generarPersonasOrdenadas(numPersona , nombresPersonas , apellidosPersonas);
				System.out.println("Las personas han sido generadas y ordenadas correctamente.");
				
				break;
				
			case 2:
				if (personas != null) {
					for (Persona persona : personas) {
						System.out.println(persona);
					}
				}else {
					System.out.println("No hay personas guardadas.");
				}
				
				break;
				
			case 3:
				System.out.println("Saliendo...");
				scanner.close();
				break;
				
				default:
				System.out.println("Opcion no valida. Pruebe otra vez.");
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
