package org.ip.sesion08;

import java.util.Scanner;

class MiObjeto {
    private String descripcion;

    public MiObjeto(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "MiObjeto [descripcion=" + descripcion + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MiObjeto miObjeto = (MiObjeto) obj;
        return descripcion.equals(miObjeto.descripcion);
    }

    @Override
    public int hashCode() {
        return descripcion.hashCode();
    }
}

public class FuncionalidadMiObjeto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 6) {
            System.out.println("Menú:\n"
                    + "1. Mostrar toString.\n"
                    + "2. Comprobar equals.\n"
                    + "3. Mostrar hashCode.\n"
                    + "4. Mostrar getClass.\n"
                    + "5. Comprobar instanceof.\n"
                    + "6. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    MiObjeto miObjeto1 = new MiObjeto("Objeto 1");
                    MiObjeto miObjeto2 = new MiObjeto("Objeto 2");
                    System.out.println("Objeto 1: " + miObjeto1.toString());
                    System.out.println("Objeto 2: " + miObjeto2.toString());
                    break;

                case 2:
                    MiObjeto miObjeto3 = new MiObjeto("Objeto 3");
                    MiObjeto miObjeto4 = new MiObjeto("Objeto 4");
                    System.out.println("¿Objeto 3 igual a Objeto 4? " + miObjeto3.equals(miObjeto4));
                    break;

                case 3:
                    MiObjeto miObjeto5 = new MiObjeto("Objeto 5");
                    MiObjeto miObjeto6 = new MiObjeto("Objeto 6");
                    System.out.println("HashCode de objeto5: " + miObjeto5.hashCode());
                    System.out.println("HashCode de objeto6: " + miObjeto6.hashCode());
                    break;

                case 4:
                    MiObjeto miObjeto7 = new MiObjeto("Objeto 7");
                    System.out.println("Clase de objeto7: " + miObjeto7.getClass());
                    break;

                case 5:
                    MiObjeto miObjeto8 = new MiObjeto("Objeto 8");
                    System.out.println("Es una instancia de MiObjeto: " + (miObjeto8 instanceof MiObjeto));
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.");
                    break;
            }
        }
    }
}
