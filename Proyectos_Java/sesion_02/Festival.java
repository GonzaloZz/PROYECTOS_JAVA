package org.ip.sesion02;

import java.util.Scanner;

public class Festival {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("      Festival GreenBeach       ");
        System.out.println("      15-17 de Julio, 2025     ");
        
        System.out.println("================================");
        System.out.println();
        System.out.println(" Tarifas del festival: ");
        
        System.out.println("--------------------------------");
        System.out.println(" Entrada un dia:         50€");
        System.out.println(" Abono 3 dias:          120€");
        System.out.println(" Entrada VIP:           150€");
        System.out.println(" Descuento menores:      20%");
        System.out.println(" Descuento estudiantes:   15%");
        System.out.println(" Descuento jubilados:     10%");
        System.out.println(" Descuento anticipado:    10%");
        System.out.println(" Descuento grupos:        5%");
        System.out.println(" Camping:               +20€");
        System.out.println(" Parking:               +10€");
        System.out.println();
        
        System.out.println("-------------------------------");
        System.out.println("Caso de uso: Calculo de la entrada (ticket)");
        System.out.println("-------------------------------");
        System.out.println();
        
        System.out.print("------------TICKET-------------\n");
        System.out.print("Tipo de entrada (1: Un dia, 2: Abono, 3: VIP): ");
        int entrada = scanner.nextInt();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("¿Estudiante? (1: Sí, 0: No): ");
        int estudiante = scanner.nextInt();
        System.out.print("Días de antelación: ");
        int dias = scanner.nextInt();
        System.out.print("Tamaño del grupo: ");
        int tamaño = scanner.nextInt();
        System.out.print("¿Camping? (1: Sí, 0: No): ");
        int camping = scanner.nextInt();
        System.out.print("¿Parking? (1: Sí, 0: No): ");
        int parking = scanner.nextInt();
        // Precios base
        double precioBase = 0;
        
        // Selección del precio base según el tipo de entrada
        switch (entrada) {
            case 1: // Entrada un día
                precioBase = 50.00;
                break;
            case 2: // Abono 3 días
                precioBase = 120.00;
                break;
            case 3: // Entrada VIP
                precioBase = 150.00;
                break;
            default:
                System.out.println("Tipo de entrada no válido.");
                return;
        }

       
        double descuento = 0.0;

        if (edad < 18) {
            descuento += precioBase * 0.20; 
        } else if (edad >= 65) {
            descuento += precioBase * 0.10; 
        } else if (estudiante == 1 && edad >= 18 && edad <= 25) {
            descuento += precioBase * 0.15; 
        

        if (dias > 30) {
            descuento += precioBase * 0.10; 
        }

        if (tamaño >= 5) {
            descuento += precioBase * 0.05; 
        }

        // Cálculo de adicionales
        double adicionales = 0.0;
        if (camping == 1) {
            adicionales += 20.00; 
        }
        if (parking == 1) {
            adicionales += 10.00; 
        }

        // Precio final
        double precioFinal = precioBase - descuento + adicionales;

        // Mostrar resultados
        System.out.println("-------------------------------");
        System.out.printf("Precio base:    %.2f€%n", precioBase);
        System.out.printf("Descuento:      %.2f€%n", descuento);
        System.out.printf("Adicionales:    %.2f€%n", adicionales);
        System.out.printf("PRECIO FINAL:   %.2f€%n", precioFinal);
        System.out.println("-------------------------------");
        
        scanner.close();
    }
    	}
 }
