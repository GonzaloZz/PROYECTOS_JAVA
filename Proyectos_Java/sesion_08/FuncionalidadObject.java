package org.ip.sesion08;
import java.util.Scanner;
public class FuncionalidadObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 6) {
            System.out.println("Menú:\n"
                    + "1. Mostrar toString.\n"
                    + "2. Comprobar equals.\n"
                    + "3. Mostrar hashCode.\n"
                    + "4. Mostrar getClass.\n"
                    + "5. Comprobar instanceof.\n"
                    + "6. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
            
                case 1:
                    Object objeto1 = new Object();
                    Object objeto2 = new Object();
                    System.out.println("Objeto 1: " + objeto1.toString());
                    System.out.println("Objeto 2: " + objeto2.toString());
                    break;

                case 2:
                    Object objeto3 = new Object();
                    Object objeto4 = new Object();
                    System.out.println("¿Objeto 3 igual a Objeto 4? " + objeto3.equals(objeto4));
                    break;

                case 3:
                    Object objeto5 = new Object();
                    Object objeto6 = new Object();
                    System.out.println("HashCode de objeto5: " + objeto5.hashCode());
                    System.out.println("HashCode de objeto6: " + objeto6.hashCode());
                    break;

                case 4:
                    Object objeto7 = new Object();
                    System.out.println("Clase de objeto7: " + objeto7.getClass());
                    break;

                case 5:
                    Object objeto8 = new Object();
                    System.out.println("Es una instancia de Object: " + (objeto8 instanceof Object));
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.");
                    break;
            }
        }
    }
}