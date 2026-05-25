package org.ip.sesion07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // fecha de nacimiento
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Introduzca su fecha de nacimiento: ");
        String fechaNacimiento = scanner.nextLine();
        LocalDate fechaNacimiento2 = LocalDate.parse(fechaNacimiento, formato);

        // menú
        int opcion = -1;

        while (opcion != 4) {
            System.out.println("Seleccione una opción: \n"
                    + "1. Calcular el próximo cumpleaños con java.time.\n"
                    + "2. Calcular la edad actual.\n"
                    + "3. Calcular días hasta el examen.\n"
                    + "4. Salir.");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {

                case 1:
                    LocalDate hoy = LocalDate.now();
                    LocalDate proximoCumple = fechaNacimiento2.withYear(hoy.getYear());
                    if (proximoCumple.isBefore(hoy) || proximoCumple.isEqual(hoy)) {
                        proximoCumple = proximoCumple.plusYears(1);
                    }

                    System.out.println("El próximo cumpleaños es: " + proximoCumple.format(formato));
                    System.out.println("El día de la semana es: " + proximoCumple.getDayOfWeek());

                    boolean finSemana = proximoCumple.getDayOfWeek().getValue() == 6 || proximoCumple.getDayOfWeek().getValue() == 7;
                    System.out.println("¿Cae en fin de semana?: " + finSemana);
                    long dias = ChronoUnit.DAYS.between(hoy, proximoCumple);
                    System.out.println("Días para el cumpleaños: " + dias);

                    break;

                case 2:
                    hoy = LocalDate.now();
                    int edad = (int) ChronoUnit.YEARS.between(fechaNacimiento2, hoy);
                    System.out.println("Tu edad es: " + edad + " años.");

                    break;

                case 3:
                    System.out.print("Introduzca la fecha de su próximo examen (dd/MM/yyyy): ");
                    String fechaExamen = scanner.nextLine();
                    try {
                        LocalDate fechaExamen2 = LocalDate.parse(fechaExamen, formato);
                        hoy = LocalDate.now();

                        if (fechaExamen2.isBefore(hoy)) {
                            System.out.println("La fecha del examen ya pasó. Introduzca una fecha futura.");
                        } else {
                            long diasParaExamen = ChronoUnit.DAYS.between(hoy, fechaExamen2);
                            System.out.println("Días que faltan para el examen: " + diasParaExamen);
                            System.out.println("El examen cae en: " + fechaExamen2.getDayOfWeek());
                        }
                    } catch (Exception e) {
                        System.out.println("Fecha inválida. Por favor, pruebe otra.");
                    }

                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
                    break;
            }
        }
    }
}
