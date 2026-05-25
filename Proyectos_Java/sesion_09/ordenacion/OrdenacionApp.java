package org.ip.sesion09.ordenacion;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenacionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arrayEnteros = {87, 45, 32, 12, 98, 74, 23, 56, 67, 10};
        double[] arrayDouble = {56.789, 21.345, 89.123, 12.678, 43.567, 76.123, 98.456, 32.456, 65.789, 54.321};
        String[] provincias = {"Sevilla", "Zaragoza", "Bilbao", "Valencia", "Málaga", "Palma", "Las Palmas", "Madrid", "Murcia", "Barcelona"};    
                
        int opcion = -1;
        
        while(opcion != 0) {
            System.out.println("Menu: \n"
                    + "1. Ordenacion por insercion.\n"
                    + "2. Ordenacion burbuja.\n"
                    + "3. Ordenacion por seleccion.\n"
                    + "0. Salir.");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            System.out.println();
            
            switch(opcion) {
            
            case 1:
                System.out.println("Array de enteros sin ordenar: " + Arrays.toString(arrayEnteros));
                Ordenacion.ordenacionInsercion(arrayEnteros);
                System.out.println("Array de enteros ordenado por insercion:  " + Arrays.toString(arrayEnteros));
                break;
            
            case 2: 
                System.out.println("Array de double sin ordenar: " + Arrays.toString(arrayDouble));
                Ordenacion.ordenacionBurbuja(arrayDouble);
                System.out.println("Array de double ordenado por burbuja: " + Arrays.toString(arrayDouble));
                break;
            
            case 3:
                System.out.println("Array de provincias sin ordenar: " + Arrays.toString(provincias));
                Ordenacion.ordenacionSeleccion(provincias);
                System.out.println("Array de provincias ordenadas por seleccion: " + Arrays.toString(provincias));
                break;
            
            case 0:
                System.out.println("¡Hasta luego!");
                break;
            
            default: 
                System.out.println("Opcion no valida. Pruebe otra vez.");
            }
        }
        
        scanner.close();
    }
}
