package org.ip.sesion05;

public class PixelArt {
    public static void main(String[] args) {
        
    	final String PIXEL = "  "; 
        int TAMAÑO = 10; 

        // Colores ANSI
        String BLANCO = "\033[47m"; 
        String NEGRO = "\033[40m"; 
        String AMARILLO = "\033[43m"; 
        String REINICIAR = "\033[0m";

       
        int[][] emoji = {
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

        
        for (int fila = 0; fila < TAMAÑO; fila++) {
            for (int columna = 0; columna < TAMAÑO; columna++) {
                switch (emoji[fila][columna]) {
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
}




