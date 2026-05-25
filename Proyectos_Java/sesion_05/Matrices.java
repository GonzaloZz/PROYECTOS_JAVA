package org.ip.sesion05;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 4) {
            System.out.println("Menú de operaciones:");
            System.out.println("1. Producto de un escalar.");
            System.out.println("2. Suma de matrices.");
            System.out.println("3. Multiplicación de matrices.");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Producto de un escalar
                    System.out.print("Ingrese el número de filas: ");
                    int filas1 = scanner.nextInt();
                    System.out.print("Ingrese el número de columnas: ");
                    int columnas1 = scanner.nextInt();
                    System.out.print("Ingrese el escalar: ");
                    int escalar = scanner.nextInt();

                    int[][] matriz1 = new int[filas1][columnas1];
                    System.out.println("Ingrese los elementos de la matriz:");
                    for (int i = 0; i < filas1; i++) {
                        for (int j = 0; j < columnas1; j++) {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matriz1[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Resultado del producto escalar:");
                    for (int i = 0; i < filas1; i++) {
                        for (int j = 0; j < columnas1; j++) {
                            System.out.print((matriz1[i][j] * escalar) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Suma de matrices
                    System.out.print("Ingrese el número de filas: ");
                    int filas2 = scanner.nextInt();
                    System.out.print("Ingrese el número de columnas: ");
                    int columnas2 = scanner.nextInt();

                    int[][] matrizA = new int[filas2][columnas2];
                    int[][] matrizB = new int[filas2][columnas2];

                    System.out.println("Ingrese los elementos de la primera matriz:");
                    for (int i = 0; i < filas2; i++) {
                        for (int j = 0; j < columnas2; j++) {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matrizA[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Ingrese los elementos de la segunda matriz:");
                    for (int i = 0; i < filas2; i++) {
                        for (int j = 0; j < columnas2; j++) {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matrizB[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Resultado de la suma:");
                    for (int i = 0; i < filas2; i++) {
                        for (int j = 0; j < columnas2; j++) {
                            System.out.print((matrizA[i][j] + matrizB[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Multiplicación de matrices
                    System.out.print("Ingrese el número de filas de la primera matriz: ");
                    int filas3 = scanner.nextInt();
                    System.out.print("Ingrese el número de columnas de la primera matriz (y filas de la segunda): ");
                    int columnas3 = scanner.nextInt();
                    System.out.print("Ingrese el número de columnas de la segunda matriz: ");
                    int columnas4 = scanner.nextInt();

                    int[][] matrizX = new int[filas3][columnas3];
                    int[][] matrizY = new int[columnas3][columnas4];
                    int[][] producto = new int[filas3][columnas4];

                    System.out.println("Ingrese los elementos de la primera matriz:");
                    for (int i = 0; i < filas3; i++) {
                        for (int j = 0; j < columnas3; j++) {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matrizX[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Ingrese los elementos de la segunda matriz:");
                    for (int i = 0; i < columnas3; i++) {
                        for (int j = 0; j < columnas4; j++) {
                            System.out.print("Elemento [" + i + "][" + j + "]: ");
                            matrizY[i][j] = scanner.nextInt();
                        }
                    }

                    // Realizar la multiplicación
                    for (int i = 0; i < filas3; i++) {
                        for (int j = 0; j < columnas4; j++) {
                            for (int k = 0; k < columnas3; k++) {
                                producto[i][j] += matrizX[i][k] * matrizY[k][j];
                            }
                        }
                    }

                    System.out.println("Resultado de la multiplicación:");
                    for (int i = 0; i < filas3; i++) {
                        for (int j = 0; j < columnas4; j++) {
                            System.out.print(producto[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}

