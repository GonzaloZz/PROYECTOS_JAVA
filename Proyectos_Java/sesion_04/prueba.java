package org.ip.sesion04;

import java.util.Scanner;
import java.util.Random;

public class prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        int tamaño;
        boolean datosCargados = false;
        double[] array = null;
        Random random = new Random();

        while (opcion != 5) {
            System.out.println("Menu:\n "
                    +"1. Cargar datos aleatorios.\n"
                    +"2. Cargar datos manualmente.\n"
                    +"3. Visualizar datos.\n"
                    +"4. Operaciones a realizar.\n"
                    +"5. Salir.");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el tamaño del array: ");
                    tamaño = scanner.nextInt();
                    array = new double[tamaño];
                    for (int i = 0; i < tamaño; i++) {
                        array[i] = random.nextDouble() * 100;
                    }
                    datosCargados = true;
                    System.out.println("Datos aleatorios cargados.");
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.print("Introduzca el tamaño del array: ");
                    tamaño = scanner.nextInt();
                    array = new double[tamaño];
                    for (int i = 0; i < tamaño; i++) {
                        System.out.println("Introduzca el valor para el índice " + (i +1));
                        array[i] = scanner.nextDouble();
                    }
                    datosCargados = true;
                    System.out.println("Datos cargados manualmente.");
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    if (array != null) {
                    	System.out.println("Datos guardados");
                    	for (double datos : array) {
                    		System.out.println(datos);
                    	}
                    }
                    	else {System.out.println("No hay datos guardados");
                    		
                    	
                        }
                    System.out.println();
                    break;

                case 4:
                	int opcion2 = 0;
               
                if (array != null) {
                
               
                    	while (opcion2 != 4) {
                    		System.out.println("Menu:\n"
                    				+ "1. Calcular la media.\n"
                    				+ "2. Calcular la varianza.\n"
                    				+ "3. Calcular la desviacion tipica.\n"
                    				+ "4. Volver al menu anterior.\n ");
                    		System.out.print("Selecciona una opcion: ");
                    		opcion2 = scanner.nextInt();
                    		
                    		switch (opcion2) {
                    		
                    		case 1:
                    			
                    			double suma = 0.0;
                    			for (double num : array) {
                    				suma += num;
                    			}
                    			
                    		}
                    		
                    		
                    		
                    		
                    		
                    	}
                }
                else {
                	System.out.println("No hay datos guardados");
                }
                    		
                    break;	
                        
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

