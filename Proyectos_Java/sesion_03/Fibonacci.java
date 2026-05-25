package org.ip.sesion03;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar el término de Fibonacci hasta que sea válido
        do {
            System.out.print("¿Hasta qué término de la serie de Fibonacci quieres mostrar? ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Valor incorrecto. Repita...");
            }
        } while (n < 0);

        // Calcular y mostrar el término n-ésimo
        long resultado = fibonacci(n);
        System.out.println("El término " + n + " de la sucesión de Fibonacci es: " + resultado);
        
        scanner.close();
    }

    // Método para calcular el n-ésimo término de Fibonacci
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}

