package org.ip.sesion08.persona_v2;

import java.util.Scanner;
import java.util.Random;

public class PersonaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        Persona[] personas = null;
        String nombres[] = {"Juan", "Manu", "Antonio", "Juana", "Manoli"};
        String apellidos[] = {"Navarro", "Fernandez", "Ortega", "Marte", "Ojeda"};
        
        int opcion = -1;
        while(opcion != 5) {
            System.out.println("Menu: \n"
                    + "1. Generar personas aleatorias.\n"
                    + "2. Mostrar personas generadas.\n"
                    + "3. ¿Cuantas personas hay repetidas?.\n"
                    + "4. Eliminar personas repetidas.\n"
                    + "5. Salir.");
            System.out.print("Por favor, introduzca su eleccion: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
            case 1:
                System.out.print("Introduzca el numero de personas que desea generar: ");
                int numeroPersona = scanner.nextInt();
            
                personas = Utilidades.generarPersonas(numeroPersona, nombres, apellidos);
                System.out.println("Personas aleatorias generadas.");
                break;
                
            case 2:
                if (personas != null) {
                    for (Persona persona : personas) {
                        System.out.println(persona);
                    }
                } else {
                    System.out.println("No hay personas generadas.");
                }
                break;
                
            case 3: 
                if (personas != null) {
                    int perRepetidas = Utilidades.contarPersonasRepetidas(personas);
                    System.out.println("Hay " + perRepetidas + " personas repetidas en el array.");
                } else {
                    System.out.println("No hay datos guardados.");
                }
                break;

            case 4:
            
                if (personas.length > 0) {
                    int eliminadas = Utilidades.eliminarPersonasIguales(personas);
                    System.out.println("Se han eliminado " + eliminadas + " personas repetidas.");
                } else {
                    System.out.println("No hay datos guardados.");
                }
                break;


            case 5: 
                System.out.println("Adios...");
                scanner.close();
                break;
                
            default:
                System.out.println("Opcion no valida. Pruebe otra vez.");
            }
        }
    }
}
