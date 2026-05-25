package org.ip.sesion03;

import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Verificar si un número es primo");
            System.out.println("2. Listar números primos hasta un número");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                int contador = 0;

                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        contador++;
                    }
                }

                if (contador == 2) {
                    System.out.println(numero + " es un numero primo.");
                } else {
                    System.out.println(numero + " no es un numero primo.");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese un número: ");
                int limite = scanner.nextInt();
                System.out.println("Listado de numeros primos hasta  " + limite + ": ");

                for (int i = 2; i <= limite; i++) {
                    int divisores = 0;

                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            divisores++;
                        }
                    }

                    if (divisores == 2) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } else if (opcion == 3) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}

