package org.ip.sesion04;

import java.util.Scanner;
public class MezclaLineal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			int opcion = -1;
			boolean datosCargados = false;
			int[] array1 = null;
			int[] array2 = null;
		
		while (opcion != 4) {
			System.out.println("== Menu de opciones: \n"
					+ "1. Definir el tamaño de los arrays.\n"
					+ "2. Rellenar manualmente los arrays.\n"
					+ "3. Mostrar el array resultante.\n"
					+ "4. Finalizar el programa.\n"
					+ "5. Ayuda - Explicacion de las opciones del menu.\n");
			System.out.print("Seleccione una opcion: ");
			opcion = scanner.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.print("Introduzca el tamaño del primer array: ");
				int tamaño1 = scanner.nextInt();
				array1 = new int [tamaño1];
				
				System.out.print("Introduzca el tamaño del segundo array: ");
				int tamaño2 = scanner.nextInt();
				array2 = new int [tamaño2];
				
				System.out.println();
			
				break;
				
			case 2:
				
				if (array1 == null || array2 == null) {
					System.out.println("¡Primero debe definir el tamaño de los arrays");
				}
				
					else { System.out.println("Introduzca los valores del primer array (ordenados): ");
					System.out.println();
				for (int i = 0; i < array1.length; i++) {
					System.out.print("-Valor " + (i+1) + " del primer array: ");
					array1[i] = scanner.nextInt();
				
				}
				
				System.out.println("Introduzca los valores del segundo array (ordenados): ");
				System.out.println();
				for(int i = 0; i< array2.length; i++) {
					System.out.print("-Valor " + (i+1) + " del segundo array: ");
					array2[i] = scanner.nextInt();
					}
				}
					System.out.println();
				break;
				
			case 3:
				System.out.println();
             	if (datosCargados){
             		System.out.print("Array actual: ");
             		for (double num : array1) {
             			System.out.print(  num + " " );
             		}
             		System.out.println();
             	}else {
             		System.out.println("No hay datos guardados en el array. ");
             		}
            	System.out.println();
             	if (datosCargados){
             		System.out.print("Array actual: ");
             		for (double num : array2) {
             			System.out.print(  num + " " );
             		}
             		System.out.println();
             	}else {
             		System.out.println("No hay datos guardados en el array. ");
             	
             		
             	
             	}
             	System.out.println();
             break;
				
			case 4:
				 System.out.println("Programa finalizado.");
				 System.out.println();
				
			 break;
				
			case 5:
				int opcion2 = 0;
			while(opcion2 != 5) {
				System.out.println("¿Qué dudas tienes?.\n"
						+ "1. Definir el tamaño de los arrays.\n"
						+ "2. Rellenar manualmente los arrays.\n"
						+ "3. Mostrar el array resultante.\n"
						+ "4. Finalizar el programa.\n"
						+ "5. Volver al menu anterior.");
				System.out.print("Seleccione una opcion con la que tengas dudas: ");
					opcion2 = scanner.nextInt();
					
				switch (opcion2) {
				
				case 1:
					System.out.println(" El programa solicita al usuario ingresar el tamaño del array y lo crea con ese tamaño.");
					break;
				case 2:
					System.out.println("El usuario ingresa los valores uno por uno para llenar el array.");
					break;
				case 3:
					System.out.println("El programa muestra el contenido del array en pantalla.");
					break;
				case 4:
					System.out.println("El usuario puede elegir esta opción para terminar la ejecución del programa.");
					break;
				case 5:
					System.out.println("Volviendo al menu principal...");
					
					break;
						
					}				
				}
			break;
			
			default:
				System.out.println("Opcion no valida. Pruebe otra vez.");
			
			}
			
		}
		
		scanner.close();	
		

	}

}
