package org.ip.sesion07;

import java.lang.Character.UnicodeBlock;
import java.util.Scanner;

public class Envoltorios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplos con Integer
        System.out.println("///EJEMPLOS CON INTEGER///");
        System.out.println("Rango int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        Integer entero = new Integer(10);
        Integer entero2 = Integer.valueOf(20);
        int primitivoEntero = Integer.parseInt("99");

        System.out.println("Creando objetos Integer");
        System.out.println("Entero con new Integer(10): " + entero);
        System.out.println("Otro entero con Integer.valueOf(20): " + entero2);
        System.out.println("Convirtiendo String a int con Integer.parseInt()");
        System.out.println("Primitivo parseado: " + primitivoEntero);

        // Ejemplos con Double
        System.out.println("///EJEMPLOS CON DOUBLE///");
        System.out.println("Rango double (positivos): " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);

        Double decimal = new Double(5.5);
        Double decimal2 = Double.valueOf(6.234);
        Double decimal3 = Double.valueOf(6.534);
        double decimalRedondeado = Math.round(decimal2);
        int valorEntero = (int) decimalRedondeado;
        double decimalRedondeado2 = Math.round(decimal3);
        int valorEntero2 = (int) decimalRedondeado2;

        System.out.println("Creando objetos Double");
        System.out.println("Decimal con new Double(5.5): " + decimal);
        System.out.println("Otro decimal con Double.valueOf(6.234): " + decimal2);
        System.out.println("Usando round() e intValue()");
        System.out.println("Decimal redondeado: " + decimalRedondeado);
        System.out.println("Parte entera de decimal: " + valorEntero);
        System.out.println("Otro ejemplo con Double.valueOf(6.534): " + decimal3);
        System.out.println("Decimal redondeado: " + decimalRedondeado2);
        System.out.println("Parte entera de decimal: " + valorEntero2);

        // Ejemplos con Character
        System.out.println("///EJEMPLOS CON CHARACTER///");
        System.out.print("Introduzca una letra: ");
        char letraObj = scanner.next().charAt(0);
        Character letra = new Character(letraObj);
        Character letraMayuscula = Character.toUpperCase(letraObj);
        System.out.println("Creando objeto con Character letraObj = new Character");
        System.out.println("Letra: " + letra);
        System.out.println("Usando toUpperCase()");
        System.out.println("Letra mayúscula: " + letraMayuscula);

        // Bloque Unicode de ASCII
        System.out.println("///BLOQUE UNICODE DE ASCII///");
        int contador = 0;
        for (int i = 32; i <= 126; i++) {
            System.out.print((char) i + " ");
            contador++;
            if (contador % 16 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Bloque Unicode de Símbolos Matemáticos
        System.out.println("///BLOQUE UNICODE DE SÍMBOLOS MATEMÁTICOS///");
        for (char c = 0x2200; c <= 0x22FF; c++) {
            System.out.print((char) c + " ");
            contador++;
            if (contador % 16 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // Bloque Unicode de Símbolos de Caja
        System.out.println("///BLOQUE DE SÍMBOLOS DE CAJA///");
        UnicodeBlock bloque = Character.UnicodeBlock.BLOCK_ELEMENTS;
        for (int i = 0; i <= 0xFFFF; i++) {
            if (Character.UnicodeBlock.of(i) == bloque) {
                System.out.print((char) i + " ");
                contador++;
                if (contador % 16 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();

        // Bloque Unicode de Emojis
        System.out.println("///BLOQUE UNICODE DE EMOJIS///");
        for (int i = 0x1F600; i <= 0x1F64F; i++) {
            System.out.print((char) i + " ");
            contador++;
            if (contador % 16 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
