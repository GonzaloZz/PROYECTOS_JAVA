package org.ip.sesion03;
import java.util.Scanner;

public class ConversorDecimalBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Decimal a Binario");
            System.out.println("2. Binario a Decimal");
            System.out.println("3. Tabla Decimal a Binario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Decimal: ");
                int decimal = scanner.nextInt();
                String binario = "";
                if (decimal == 0) {
                    binario = "0";
                } else {
                    while (decimal > 0) {
                        binario = (decimal % 2) + binario;
                        decimal /= 2;
                    }
                }
                System.out.println("Binario: " + binario);
            } else if (opcion == 2) {
                System.out.print("Binario: ");
                String binario = scanner.next();
                int decimal = 0;
                for (int i = 0; i < binario.length(); i++) {
                    decimal = decimal * 2 + (binario.charAt(i) - '0');
                }
                System.out.println("Decimal: " + decimal);
            } else if (opcion == 3) {
                System.out.print("Límite: ");
                int limite = scanner.nextInt();
                for (int i = 0; i <= limite; i++) {
                    String binario = "";
                    int temp = i;
                    if (temp == 0) {
                        binario = "0";
                    } else {
                        while (temp > 0) {
                            binario = (temp % 2) + binario;
                            temp /= 2;
                        }
                    }
                    System.out.printf("%d: %s%n", i, binario);
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

		
		
		
		
		
		
