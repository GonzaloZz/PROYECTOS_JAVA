package org.ip.sesion02;

import java.util.Scanner;

public class SegundoGradoArgumentos {

    public static void main(String[] args) {    
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("SOLUCION DE UNA ECUACION DE SEGUNDO GRADO");
    	
    	int a, b, c;

        
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        } else {
     
            System.out.println("Valores de los coeficientes: ");
            System.out.print("a: ");
            a = scanner.nextInt();
            System.out.print("b: ");
            b = scanner.nextInt();
            System.out.print("c: ");
            c = scanner.nextInt();
        }

      
        	int ecuacion = b * b - 4 * a * c;

      
        if (ecuacion > 0) {
            double raiz1 = (-b + Math.sqrt(ecuacion)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(ecuacion)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (ecuacion == 0) {
            double raiz = -b / (2.0 * a);
            System.out.println("La raíz doble es: " + raiz);
        } else {
            System.out.println("No tiene solucion real");
        }
    }
}


