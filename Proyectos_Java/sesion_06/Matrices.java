package org.ip.sesion06;

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
                    int[][] matriz1 = ingresarMatriz(scanner);
                    System.out.print("Ingrese el escalar: ");
                    int escalar = scanner.nextInt();
                    int[][] productoEscalar = productoPorEscalar(matriz1, escalar);
                    imprimirMatriz("Resultado del producto escalar", productoEscalar);
                    break;

                case 2:
                    int[][] matrizA = ingresarMatriz(scanner);
                    int[][] matrizB = ingresarMatriz(scanner);
                    int[][] suma = sumaMatrices(matrizA, matrizB);
                    imprimirMatriz("Resultado de la suma", suma);
                    break;

                case 3:
                    int[][] matrizX = ingresarMatriz(scanner);
                    int[][] matrizY = ingresarMatriz(scanner);
                    int[][] producto = multiplicacionMatrices(matrizX, matrizY);
                    imprimirMatriz("Resultado de la multiplicación", producto);
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

    public static int[][] ingresarMatriz(Scanner scanner) {
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] productoPorEscalar(int[][] matriz, int escalar) {
        int[][] resultado = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    public static int[][] sumaMatrices(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicacionMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

    public static int[] sumaFilas(int[][] matriz) {
        int[] suma = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma[i] += matriz[i][j];
            }
        }
        return suma;
    }

    public static int[] sumaColumnas(int[][] matriz) {
        int[] suma = new int[matriz[0].length];
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma[i] += matriz[j][i];
            }
        }
        return suma;
    }

    public static int[] extraerDiagonalMatriz(int[][] matriz) {
        int[] diagonal = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            diagonal[i] = matriz[i][i];
        }
        return diagonal;
    }

    public static void imprimirMatriz(String titulo, int[] matriz) {
        System.out.println(titulo + ":");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirMatriz(String titulo, int[][] matriz) {
        System.out.println(titulo + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

