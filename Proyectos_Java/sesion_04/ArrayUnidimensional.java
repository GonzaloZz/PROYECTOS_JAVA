package org.ip.sesion04;

import java.util.Scanner;
import java.util.Random;

public class ArrayUnidimensional {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Random random = new Random ();
		
		
		
		
		int tamaño;
		int opcion = -1;
		double array[] = null;
		boolean datosCargados = false;
		
		while (opcion != 5) {
			System.out.println("Menú:\n"
					+ "1. Intruduzca un array de números enteros de forma ascendente.\n"
					+ "2. Visualizar el array.\n"
					+ "3. Invertir el array de forma inversa.\n"
					+ "4. Mostrar los valores mayor y menor del array.\n"
					+ "5. Salir.\n");
			System.out.print("Selecciona una opción: ");
			opcion = scanner.nextInt();
			
			switch (opcion) {
			
			case 1:
				System.out.print("Introduzca el tamaño del array: ");
                  tamaño = scanner.nextInt();
                  array = new double [tamaño];
                  int numero;
                  int ultimoNumero = 0;
               
                  
                  for (int i = 0; i< tamaño; i++) {
                	  do {
                		    System.out.print("Introduce el número " + (i+1) + ": ");
                		    numero = scanner.nextInt();
                		    
                		    if (numero <= ultimoNumero) {
                		    	System.out.println("El número debe ser mayor que " + ultimoNumero + ".");
                		    }
                		   
                		    
                		    
                		} while (numero<= ultimoNumero);
                	   array[i] = numero;
                	   ultimoNumero = numero;
                	  
                  }
                  datosCargados = true;
                  
                  break;
			case 2:
				System.out.println();
                 	if (datosCargados){
                 		System.out.print("Array actual: ");
                 		for (double num : array) {
                 			System.out.print(  num + " " );
                 		}
                 		System.out.println();
                 	}else {
                 		System.out.println("No hay datos guardados en el array. ");
                 	
                 		
                 	
                 	}
                 break;
                 
                 
			case 3:
				if (array != null) {
					
				
				for( int i = 0; i< array.length/2; i++){
					
					double invertir = array[i];
					array[i] = array[array.length -1 - i];
					array [array.length - 1 - i] = invertir;
					 System.out.print("El array ha sido invertido y ahora está en orden descendente");
				}
			}
               
               
                System.out.print("No hay datos guardados");
                
                System.out.println();
                  
				break;
				
			case 4:
				
				double max1 = array[0];
				double min1 = array[0];
				
				
				
				for (int i = 1 ; i < array.length; i++) {
					if (array[i] > max1) {
						max1 = array[i];
					}
					if (array[i] < min1) {
						min1 = array[i];
						}
					}
				System.out.println("-El valor maximo del array  es: " + max1);
				System.out.println("-El valor minimo del array  es: " + min1);
				System.out.println();
				
			
				break;
				
			case 5:
				
				System.out.println("Saliendo del programa. ¡Hasta luego!");
				
				break;
				
				default:
					System.out.println("Opcion no valida. Pruebe otra vez.");
					System.out.println();
					}
			
				}
		
		
			
			}
		
			
	}

