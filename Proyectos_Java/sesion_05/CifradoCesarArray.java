package org.ip.sesion05;

import java.util.Scanner;

public class CifradoCesarArray {
    public static void main(String[] args) {
    	
        // Crear Strings con los alfabetos
        String alfabetoMayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String alfabetoMinusculas = "abcdefghijklmnñopqrstuvwxyz";

        // Convertir Strings a arrays de caracteres
        char[] mayusculas = alfabetoMayusculas.toCharArray();
        char[] minusculas = alfabetoMinusculas.toCharArray();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Cifrar un mensaje");
            System.out.println("2. Descifrar un mensaje");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            if (opcion == 1 || opcion == 2) {
                System.out.print("Introduzca el mensaje: ");
                String mensaje = scanner.nextLine();
                System.out.print("Introduzca el tamaño del desplazamiento: ");
                int desplazamiento = scanner.nextInt();
                  
                
                if (opcion == 1) {
                    String cifrado = cifrar(mensaje, desplazamiento, mayusculas, minusculas);
                    System.out.println("Mensaje cifrado: " + cifrado);
                } else {
                    String descifrado = cifrar(mensaje, -desplazamiento, mayusculas, minusculas);
                    System.out.println("Mensaje descifrado: " + descifrado);
                }
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static String cifrar(String mensaje, int desplazamiento, char[] mayusculas, char[] minusculas) {
        String resultado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (Character.isUpperCase(c)) {
                resultado += cifrarCaracter(c, desplazamiento, mayusculas);
            } else if (Character.isLowerCase(c)) {
                resultado += cifrarCaracter(c, desplazamiento, minusculas);
            } else {
                resultado += c;
            }
        }

        return resultado;
    }

    public static char cifrarCaracter(char c, int desplazamiento, char[] alfabeto) {
        int indice = buscarIndice(alfabeto, c);
        if (indice != -1) {
            int nuevoIndice = (indice + desplazamiento + alfabeto.length) % alfabeto.length;
            return alfabeto[nuevoIndice];
        } else {
            return c;
        }
    }

    public static int buscarIndice(char[] array, char c) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return 0;
    }
}

