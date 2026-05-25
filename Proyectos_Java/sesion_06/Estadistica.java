package org.ip.sesion06;

import java.util.Scanner;
import java.util.Random;

public class Estadistica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        double[] array = null;

        while (opcion != 5) {
            System.out.println("Menu:\n "
                    + "1. Cargar datos aleatorios.\n"
                    + "2. Cargar datos manualmente.\n"
                    + "3. Visualizar datos.\n"
                    + "4. Operaciones a realizar.\n"
                    + "5. Salir.");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    array = cargarDatosAleatorios(leerEnteroPositivoPorTeclado(scanner), -10, 10);
                    System.out.println("Datos aleatorios cargados.");
                    break;

                case 2:
                    array = cargarDatosManualmente(scanner, leerEnteroPositivoPorTeclado(scanner));
                    System.out.println("Datos cargados manualmente.");
                    break;

                case 3:
                    if (array != null) {
                        visualizarDatos(array);
                    } else {
                        System.out.println("No hay datos cargados.");
                    }
                    break;

                case 4:
                    if (array != null) {
                        realizarOperaciones(scanner, array);
                    } else {
                        System.out.println("No hay datos cargados.");
                    }
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    public static int leerEnteroPositivoPorTeclado(Scanner scanner) {
        int numero;
        do {
            System.out.print("Introduce un entero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Número incorrecto. Debe ser mayor que cero.");
            }
        } while (numero <= 0);
        return numero;
    }

    public static double[] cargarDatosAleatorios(int tamano, double minimo, double maximo) {
        double[] datos = new double[tamano];
        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            datos[i] = minimo + (maximo - minimo) * random.nextDouble();
        }
        return datos;
    }

    public static double[] cargarDatosManualmente(Scanner scanner, int tamano) {
        double[] datos = new double[tamano];
        for (int i = 0; i < tamano; i++) {
            System.out.print("Introduzca el valor para el índice " + (i + 1) + ": ");
            datos[i] = scanner.nextDouble();
        }
        return datos;
    }

    public static void visualizarDatos(double[] datos) {
        System.out.println("Datos actuales en el array:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Dato " + (i + 1) + ": " + datos[i]);
        }
    }

    public static void realizarOperaciones(Scanner scanner, double[] array) {
        int opcion2;
        do {
            System.out.println("Menu:\n"
                    + "1. Calcular la media.\n"
                    + "2. Calcular la varianza.\n"
                    + "3. Calcular la desviación típica.\n"
                    + "4. Calcular el valor mínimo.\n"
                    + "5. Calcular el valor máximo.\n"
                    + "6. Volver al menú anterior.\n");
            System.out.print("Selecciona una opción: ");
            opcion2 = scanner.nextInt();

            switch (opcion2) {
                case 1:
                    System.out.println("Media: " + calcularMedia(array));
                    break;

                case 2:
                    double media = calcularMedia(array);
                    System.out.println("Varianza: " + calcularVarianza(array, media));
                    break;

                case 3:
                    double mediaDesv = calcularMedia(array);
                    System.out.println("Desviación Típica: " + calcularDesviacionEstandar(array, mediaDesv));
                    break;

                case 4:
                    System.out.println("Valor mínimo: " + calcularMinimo(array));
                    break;

                case 5:
                    System.out.println("Valor máximo: " + calcularMaximo(array));
                    break;

                case 6:
                    // Volver al menú anterior
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion2 != 6);
    }

    public static double calcularMedia(double[] datos) {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }

    public static double calcularVarianza(double[] datos, double media) {
        double sumaCuadrados = 0;
        for (double dato : datos) {
            sumaCuadrados += Math.pow(dato - media, 2);
        }
        return sumaCuadrados / datos.length;
    }

    public static double calcularDesviacionEstandar(double[] datos, double media) {
        return Math.sqrt(calcularVarianza(datos, media));
    }

    public static double calcularMinimo(double[] datos) {
        double minimo = datos[0];
        for (double dato : datos) {
            if (dato < minimo) {
                minimo = dato;
            }
        }
        return minimo;
    }

    public static double calcularMaximo(double[] datos) {
        double maximo = datos[0];
        for (double dato : datos) {
            if (dato > maximo) {
                maximo = dato;
            }
        }
        return maximo;
    }
}


