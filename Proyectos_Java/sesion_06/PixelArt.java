package org.ip.sesion06;

import java.util.Scanner;

public class PixelArt {
    public static void main(String[] args) {
        
    	final String PIXEL = "  ";
        
    	String BLANCO = "\033[47m";
        String NEGRO = "\033[40m";
        String AMARILLO = "\033[43m";
        String REINICIAR = "\033[0m";

        Scanner scanner = new Scanner(System.in);
        int[][] emoji = rellenarEmoji();
        boolean salir = false;
        int opcion = -1;
        
        while (opcion !=5) {
            System.out.println("\n--- Menú PixelArt ---");
            System.out.println("1. Mostrar Emoji Original");
            System.out.println("2. Rotar Emoji a la Izquierda");
            System.out.println("3. Rotar Emoji a la Derecha");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Emoji original:");
                    mostrarEmoji(emoji, BLANCO, NEGRO, AMARILLO, REINICIAR, PIXEL);
                    break;
                case 2:
                    System.out.println("Emoji rotado a la izquierda:");
                    emoji = rotarIzquierda(emoji);
                    mostrarEmoji(emoji, BLANCO, NEGRO, AMARILLO, REINICIAR, PIXEL);
                    break;
                case 3:
                    System.out.println("Emoji rotado a la derecha:");
                    emoji = rotarDerecha(emoji);
                    mostrarEmoji(emoji, BLANCO, NEGRO, AMARILLO, REINICIAR, PIXEL);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }
        scanner.close();
    }

    public static int[][] rellenarEmoji() {
        return new int[][]{
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 2, 2, 2, 2, 2, 2, 1, 0},
                {1, 2, 1, 2, 2, 2, 2, 1, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 1, 2, 2, 2, 2, 1, 2, 1},
                {1, 2, 2, 1, 2, 2, 1, 2, 2, 1},
                {1, 2, 2, 2, 1, 1, 2, 2, 2, 1},
                {0, 1, 2, 2, 2, 2, 2, 2, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    public static void mostrarEmoji(int[][] m, String BLANCO, String NEGRO, String AMARILLO, String REINICIAR, String PIXEL) {
        for (int[] fila : m) {
            for (int pixel : fila) {
                switch (pixel) {
                    case 1:
                        System.out.print(NEGRO + PIXEL);
                        break;
                    case 2:
                        System.out.print(AMARILLO + PIXEL);
                        break;
                    default:
                        System.out.print(BLANCO + PIXEL);
                        break;
                }
            }
            System.out.println(REINICIAR);
        }
    }

    public static int[][] rotarIzquierda(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;
        int[][] rotada = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rotada[columnas - j - 1][i] = m[i][j];
            }
        }
        return rotada;
    }

    public static int[][] rotarDerecha(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;
        int[][] rotada = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rotada[j][filas - i - 1] = m[i][j];
            }
        }
        return rotada;
    }
}




