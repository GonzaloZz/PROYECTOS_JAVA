package org.ip.sesion03;

import java.util.Scanner;

public class DibujarFiguras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Dibujar cuadrado");
            System.out.println("2. Dibujar triángulo");
            System.out.println("3. Dibujar rombo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el tamaño del cuadrado: ");
                int tamaño = scanner.nextInt();
                System.out.print("Ingrese el carácter para dibujar: ");
                char caracter = scanner.next().charAt(0);
                
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= tamaño; j++) {
                        System.out.print(caracter + " ");
                    }
                    System.out.println();
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el tamaño del triángulo: ");
                int tamaño = scanner.nextInt();
                System.out.print("Ingrese el carácter para dibujar: ");
                char caracter = scanner.next().charAt(0);
                
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(caracter + " ");
                    }
                    System.out.println();
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el tamaño del rombo: ");
                int tamaño = scanner.nextInt();
                System.out.print("Ingrese el carácter para dibujar: ");
                char caracter = scanner.next().charAt(0);
                
                // Parte superior del rombo
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = tamaño; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                // Parte inferior del rombo
                for (int i = tamaño - 1; i >= 1; i--) {
                    for (int j = tamaño; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
            } else if (opcion == 4) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}


		
	
		
	


