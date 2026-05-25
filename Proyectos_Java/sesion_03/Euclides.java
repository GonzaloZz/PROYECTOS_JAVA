package org.ip.sesion03;

import java.util.Scanner;

public class Euclides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;

        do {
            System.out.print("Introduce el primer valor entero positivo: ");
            x = scanner.nextInt();
            if (x <= 0) {
                System.out.println("Valor incorrecto. Repite...");
            }
        } while (x <= 0);

        do {
            System.out.print("Introduce el segundo valor entero positivo: ");
            y = scanner.nextInt();
            if (y <= 0) {
                System.out.println("Valor incorrecto. Repite...");
            }
        } while (y <= 0);

        int mcd = calcularMCD(x, y);

        System.out.println("El MCD de " + x + " y " + y + " es " + mcd);
        
        scanner.close();
    }

    public static int calcularMCD(int x, int y) {
        while (y != 0) {
            int resto = x % y;
            x = y;
            y = resto;
        }
        return x;
    }
}
