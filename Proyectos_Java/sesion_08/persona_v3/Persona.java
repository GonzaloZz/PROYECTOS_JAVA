package org.ip.sesion08.persona_v3;

import java.util.Random;
import java.util.Arrays;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        int comparacionApellido1 = this.apellido1.compareTo(otraPersona.apellido1);
        if (comparacionApellido1 != 0) {
            return comparacionApellido1;
        }
        int comparacionApellido2 = this.apellido2.compareTo(otraPersona.apellido2);
        if (comparacionApellido2 != 0) {
            return comparacionApellido2;
        }
        return this.nombre.compareTo(otraPersona.nombre);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    public static Persona[] generarPersonasOrdenadas(int numPersonas, String[] nombres, String[] apellidos) {
        Persona[] personas = new Persona[numPersonas];
        Random random = new Random();

        for (int i = 0; i < numPersonas; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido1 = apellidos[random.nextInt(apellidos.length)];
            String apellido2 = apellidos[random.nextInt(apellidos.length)];
            personas[i] = new Persona(nombre, apellido1, apellido2);
        }

        Arrays.sort(personas);
        return personas;
    }
}
