package org.ip.sesion02;

import java.util.Scanner;

public class ImpuestoIRPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu base imponible: ");
        double base = scanner.nextDouble();
        
        double impuesto = 0;

        if (base <= 12450) {
            impuesto = base * 0.19;
        } else if (base <= 20200) {
            impuesto = 12450 * 0.19 + (base - 12450) * 0.24;
        } else if (base <= 35200) {
            impuesto = 12450 * 0.19 + (20200 - 12450) * 0.24 + (base - 20200) * 0.30;
        } else if (base <= 60000) {
            impuesto = 12450 * 0.19 + (20200 - 12450) * 0.24 + (35200 - 20200) * 0.30 + (base - 35200) * 0.37;
        } else {
            impuesto = 12450 * 0.19 + (20200 - 12450) * 0.24 + (35200 - 20200) * 0.30 + (60000 - 35200) * 0.37 + (base - 60000) * 0.45;
        }

        System.out.printf("El impuesto total a pagar es: %.2f €%n", impuesto);
        scanner.close();
    }
}
