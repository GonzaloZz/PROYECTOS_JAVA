package org.ip.sesion04;

import java.util.Scanner;
import java.util.Random;

public class Estadistica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        int tamaño;
        boolean datosCargados = false;
        double[] array = null;
        Random random = new Random();

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
                    System.out.print("Introduzca el tamaño del array: ");
                    tamaño = scanner.nextInt();
                    if (tamaño > 0) {
                        array = new double[tamaño];
                        for (int i = 0; i < tamaño; i++) {
                            array[i] = random.nextDouble() * 100;
                        }
                        datosCargados = true;
                        System.out.println("Datos aleatorios cargados.");
                    } else {
                        System.out.println("El tamaño debe ser mayor que 0.");
                    }
                    break;

                case 2:
                    System.out.print("Introduzca el tamaño del array: ");
                    tamaño = scanner.nextInt();
                    if (tamaño > 0) {
                        array = new double[tamaño];
                        for (int i = 0; i < tamaño; i++) {
                            System.out.print("Introduzca el valor para el índice " + (i + 1) + ": ");
                            array[i] = scanner.nextDouble();
                        }
                        datosCargados = true;
                        System.out.println("Datos cargados manualmente.");
                    } else {
                        System.out.println("El tamaño debe ser mayor que 0.");
                    }
                    break;

                case 3:
                    System.out.println();
                    if (array != null) {
                        System.out.println("Datos guardados:");
                        for (double datos : array) {
                            System.out.println(datos);
                        }
                    } else {
                        System.out.println("No hay datos guardados.\n");
                    }
                    break;

                case 4:
                    int opcion2 = 0;
                    if (array != null) {
                        while (opcion2 != 4) {
                            System.out.println("Menu:\n"
                                    + "1. Calcular la media.\n"
                                    + "2. Calcular la varianza.\n"
                                    + "3. Calcular la desviación típica.\n"
                                    + "4. Volver al menú anterior.\n");
                            System.out.print("Selecciona una opción: ");
                            opcion2 = scanner.nextInt();

                            switch (opcion2) {
                                case 1:
                                    double suma = 0.0;
                                    for (double num : array) {
                                        suma += num;
                                    }
                                    double media = suma / array.length;
                                    System.out.println("Media: " + media);
                                    break;

                                case 2:
                                    double mediaVarianza = 0.0;
                                    for (double num : array) {
                                        mediaVarianza += num;
                                    }
                                    mediaVarianza /= array.length;
                                    double sumaCuadrados = 0.0;
                                    for (double num : array) {
                                        sumaCuadrados += Math.pow(num - mediaVarianza, 2);
                                    }
                                    double varianza = sumaCuadrados / array.length;
                                    System.out.println("Varianza: " + varianza);
                                    break;

                                case 3:
                                    double mediaDesviacion = 0.0;
                                    for (double num : array) {
                                        mediaDesviacion += num;
                                    }
                                    mediaDesviacion /= array.length;
                                    double sumaCuadradosDesviacion = 0.0;
                                    for (double num : array) {
                                        sumaCuadradosDesviacion += Math.pow(num - mediaDesviacion, 2);
                                    }
                                    double varianzaDesviacion = sumaCuadradosDesviacion / array.length;
                                    double desviacionTipica = Math.sqrt(varianzaDesviacion);
                                    System.out.println("Desviación Típica: " + desviacionTipica);
                                    break;

                                case 4:
                                    // Volver al menú anterior
                                    break;

                                default:
                                    System.out.println("Opción no válida.");
                            }
                        }
                    } else {
                        System.out.println("No hay datos guardados.");
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
}
